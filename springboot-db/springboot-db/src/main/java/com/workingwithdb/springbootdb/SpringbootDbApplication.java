package com.workingwithdb.springbootdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDbApplication implements CommandLineRunner  {
	@Autowired
	private DateRepository daterepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<sample> DATE_TABLE= daterepository.findAll();
		DATE_TABLE.forEach(System.out::println);
		
	}


}
