package com.springboot.demo.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;


@Slf4j
@Order(-100)
public class MyApplicationListener implements ApplicationListener<ExitCodeEvent> {

    @Override
    public void onApplicationEvent(ExitCodeEvent event) {
//        log.info("应用启动完成");
        System.out.println("exitCode=" + event.getExitCode());
    }
}
