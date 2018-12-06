package com.klezovich.active_mq_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringActiveMqTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActiveMqTestApplication.class, args);
	}
}
