package com.exemplu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcMySqlApplication implements CommandLineRunner {
	@Autowired
	

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
