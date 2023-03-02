package com.springboot.demo;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyRandomPortWebTestClientTests {

    @Test
    void exampleTest(@Autowired WebTestClient webClient) {
        webClient
                .get().uri("/")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello World");
    }


    //自动配置测试
    @Test
    void autoConfigTest() {
        new ApplicationContextRunner()
                .withUserConfiguration(UserConfiguration.class)
                .withInitializer(new ConditionEvaluationReportLoggingListener(LogLevel.INFO))
                .run((context) -> {
                    assert context.getBean(MyService.class).equals(context.getBean("myCustomService"));
                });
    }

    @Configuration(proxyBeanMethods = false)
    static class UserConfiguration {

        @Bean
        MyService myCustomService() {
            return new MyService("mine");
        }
    }

    @AllArgsConstructor
    static class MyService {
        private String name;

    }
}
