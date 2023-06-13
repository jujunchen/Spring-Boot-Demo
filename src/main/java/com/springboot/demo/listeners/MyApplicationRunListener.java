package com.springboot.demo.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

@Slf4j
public class MyApplicationRunListener implements SpringApplicationRunListener {

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("Application 启动");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("环境已准备完毕");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("在创建和准备ApplicationContext之后，但在加载源之前调用");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("上下文准备完毕，未刷新");
//        System.out.println(context.getEnvironment().getProperty("me"));
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("上下文已刷新，应用程序已启动，但尚未调用CommandLineRunners和ApplicationRunners");
        System.out.println(context.getEnvironment().getProperty("me"));
        System.out.println(context.getEnvironment().getProperty("java.version"));
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("在刷新应用程序上下文并且调用了所有CommandLineRunner和ApplicationRunner之后，在运行方法完成之前立即调用");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("当运行应用程序时发生故障时调用");
    }
}
