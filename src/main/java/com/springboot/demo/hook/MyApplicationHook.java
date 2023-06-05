package com.springboot.demo.hook;

import com.springboot.demo.listeners.MyApplicationRunListener2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationHook;
import org.springframework.boot.SpringApplicationRunListener;

public class MyApplicationHook implements SpringApplicationHook {
    @Override
    public SpringApplicationRunListener getRunListener(SpringApplication springApplication) {
        return new MyApplicationRunListener2();
    }

}
