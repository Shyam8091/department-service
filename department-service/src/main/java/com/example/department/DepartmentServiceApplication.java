package com.example.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.apache.commons.lang.StringUtils;
@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DepartmentServiceApplication.class, args);
		String name="Shyam";
		String name1=StringUtils.isNotBlank(name) ?name:"";
		System.out.println("name 1"+name1);
		
	}

}
