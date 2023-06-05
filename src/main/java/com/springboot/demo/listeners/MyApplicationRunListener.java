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
      log.info("Application 启动");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        log.info("环境以准备完毕");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("在创建和准备ApplicationContext之后，但在加载源之前调用");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("上下文准备完毕，未刷新");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("上下文已刷新，应用程序已启动，但尚未调用CommandLineRunners和ApplicationRunners");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("在刷新应用程序上下文并且调用了所有CommandLineRunner和ApplicationRunner之后，在运行方法完成之前立即调用");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("当运行应用程序时发生故障时调用");
    }
}
