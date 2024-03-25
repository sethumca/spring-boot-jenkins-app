package org.springboot.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBootJenkinsAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootJenkinsApplication::main).with(TestSpringBootJenkinsAppApplication.class).run(args);
	}

}
