package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootDemoApplication.class);
        //4.8.3 自动重启
        //关闭shudown hook,测试devTools自动重启是否失效
        application.setRegisterShutdownHook(false);
        application.run(args);
    }

}
