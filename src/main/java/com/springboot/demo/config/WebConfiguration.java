package com.springboot.demo.config;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//4.8.3 自动重启 -> 记录条件评估中的变化
//@Configuration
//public class WebConfiguration {
//
//    @Bean
//    @ConditionalOnMissingBean
//    public IdentifierGenerator identifierGenerator() {
//        return new DefaultIdentifierGenerator();
//    }
//}
