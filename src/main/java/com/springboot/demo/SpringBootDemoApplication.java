package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootDemoApplication.class);
        //4.8.3 自动重启
        //关闭shudown hook,测试devTools自动重启是否失效
//        application.setRegisterShutdownHook(false);

        //5.1 SpringApplication,额外的日志记录
//        application.setLogStartupInfo(false);

        //5.1.2 惰性初始化
//        application.setLazyInitialization(true);

        application.run(args);
    }

}
