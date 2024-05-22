package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA의 날짜 관련 기능 활성화
@SpringBootApplication
public class Project11Application {

	public static void main(String[] args) {
		SpringApplication.run(Project11Application.class, args);
	}

}
