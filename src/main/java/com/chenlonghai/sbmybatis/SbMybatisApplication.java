package com.chenlonghai.sbmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SbMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMybatisApplication.class, args);
	}
	

	
}
