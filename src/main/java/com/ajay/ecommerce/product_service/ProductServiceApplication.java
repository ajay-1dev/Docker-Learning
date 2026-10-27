package com.ajay.ecommerce.product_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().systemProperties().load();
		SpringApplication.run(ProductServiceApplication.class, args);
		System.out.println("Product Service Application Started");
	}

}
