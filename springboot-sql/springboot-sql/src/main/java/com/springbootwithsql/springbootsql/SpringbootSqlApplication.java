package com.springbootwithsql.springbootsql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringbootSqlApplication implements CommandLineRunner  {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM DATE_TABLE";
		List<sample> DATE_TABLE = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(sample.class));
		DATE_TABLE.forEach(System.out:: println);
	}

}
