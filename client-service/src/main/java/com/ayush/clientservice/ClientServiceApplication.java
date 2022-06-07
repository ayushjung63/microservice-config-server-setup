package com.ayush.clientservice;

import com.ayush.clientservice.entity.Data;
import com.ayush.clientservice.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientServiceApplication implements CommandLineRunner {

	@Autowired
	private DataRepo dataRepo;;

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataRepo.save(new Data(1L,"Local"));
	}
}
