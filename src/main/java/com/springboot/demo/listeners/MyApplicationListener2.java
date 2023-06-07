package com.springboot.demo.listeners;

import com.springboot.demo.publish.MyEventPublish;
import com.springboot.demo.publish.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyApplicationListener2 {

    @EventListener
    public void listenerApplicationStarted(ApplicationStartedEvent event) {
        log.info("应用启动完成");
    }

    @EventListener({ApplicationEnvironmentPreparedEvent.class,ApplicationPreparedEvent.class})
    public void listenerApplicationEnv() {
        //实际测试，没有监听到，后面说明原理
        log.info("监听到了环境准备完成事件");
    }

    @EventListener({ApplicationReadyEvent.class, ApplicationStartedEvent.class})
    public void listenerApplication() {
        log.info("监听到了多个事件");
    }

    //自己发布了一个Person事件
    @EventListener
    public void myCustomListener(Person person) {
        log.info("监听到自己发布的事件,{}", person);
    }

    //只有Person事件中name属性值为csdn时才接收到
    @EventListener(condition = "#person.name == 'csdn'")
    public void myCustomListener2(Person person) {
        log.info("SpEL表达式监听到自己发布的事件,{}", person);
    }

}
