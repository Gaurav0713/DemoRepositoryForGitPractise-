package com.sbms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MsDemoAdminServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsDemoAdminServer1Application.class, args);
	}

}
