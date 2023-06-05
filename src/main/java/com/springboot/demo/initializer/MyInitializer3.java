package com.springboot.demo.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Order(-10)
public class MyInitializer3 implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("key3", "value3");
        MapPropertySource mapPropertySource = new MapPropertySource("mySource", map);
        configurableEnvironment.getPropertySources().addLast(mapPropertySource);
        log.info("My Initializer3 run");
    }
}
