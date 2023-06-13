package com.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {"me=3000"})
@SpringBootTest(properties = {"me=2000"})
class SpringBootDemoTests {

	@Autowired
	private Environment environment;

	@Test
	void contextLoads() {
		System.out.println(environment.getProperty("me"));
	}

}
