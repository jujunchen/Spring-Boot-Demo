package com.springboot.demo;

import com.springboot.demo.banner.CustomBanner;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@MapperScan
@SpringBootApplication
@PropertySource("classpath:app.yml")
public class SpringBootDemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class);
        //是否打印banner
//        springApplication.setBannerMode(Banner.Mode.OFF);
        //是否记录应用程序启动信息
//        springApplication.setLogStartupInfo(false);
        //设置ApplicationHook
//        springApplication.addInitializers(new MyInitializer2());
//        springApplication.addListeners(new MyApplicationListener());
        //banner
        springApplication.setBanner(new CustomBanner());
        //SpringApplication.setDefaultProperties 指定的默认属性
        Properties properties = new Properties();
        properties.setProperty("me", "123456");
        springApplication.setDefaultProperties(properties);

        ConfigurableApplicationContext context = springApplication.run(args);
        //关闭上下文
//        context.close();
        //优雅关机
//        Runtime.getRuntime().exit(999);
//        System.exit(999);
    }

}
