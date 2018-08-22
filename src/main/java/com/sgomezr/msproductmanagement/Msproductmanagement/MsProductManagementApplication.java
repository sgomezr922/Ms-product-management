package com.sgomezr.msproductmanagement.Msproductmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProductManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductManagementApplication.class, args);
	}
}
