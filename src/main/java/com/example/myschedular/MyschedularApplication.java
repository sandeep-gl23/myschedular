package com.example.myschedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyschedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyschedularApplication.class, args);
	}

}
