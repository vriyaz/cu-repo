package com.cu.spring.batch;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		List<Person> results = context.getBean(JdbcTemplate.class)
									  .query("SELECT first_name, last_name FROM people", 
											  new PersonRowMapper());
		
		for (Person person : results) {
			System.out.println("Found <" + person + "> in the DB");
		}
	}
}
