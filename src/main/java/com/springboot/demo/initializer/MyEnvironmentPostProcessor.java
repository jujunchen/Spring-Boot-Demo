package com.springboot.demo.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Order(5)
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        MapPropertySource mapPropertySource = new MapPropertySource("mySource", map);
        environment.getPropertySources().addLast(mapPropertySource);
        //为什么不打印日志
//        log.info("My EnvironmentPostProcessor run");
        System.out.println("My EnvironmentPostProcessor run");
    }
}
