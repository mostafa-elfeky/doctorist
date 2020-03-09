package com.seniorsteps.doctorist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
public class DoctoristApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctoristApplication.class, args);
	}
	
	@Bean
	public Module datatypeHibernateModule() {
	  return new Hibernate5Module();
	}

}
