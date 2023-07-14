package com.springboot.demo.publish;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublish {

    @Autowired
    private ApplicationContext applicationContext;

    public void publishCustomEvent(String name) {
        Person person = new Person();
        person.setName(name);
        applicationContext.publishEvent(person);
    }



}
