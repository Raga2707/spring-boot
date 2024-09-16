package com.zaga.springdemohello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoHelloApplication.class, args);
		// ConfigurableApplicationContext context = SpringApplication.run(SpringDemoHelloApplication.class, args);
		// Object datasource = context.getBean("dataSource");
		// System.out.println(datasource + "DATASOURCE");
	}

}
