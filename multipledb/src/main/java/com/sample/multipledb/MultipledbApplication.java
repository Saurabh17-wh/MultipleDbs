package com.sample.multipledb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sample.multipledb"})
@SpringBootApplication
public class MultipledbApplication
{
	public static void main(String[] args) {
		SpringApplication.run(MultipledbApplication.class, args);
	}
}
