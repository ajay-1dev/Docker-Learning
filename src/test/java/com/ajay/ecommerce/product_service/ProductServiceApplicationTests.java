package com.ajay.ecommerce.product_service;

import com.ajay.ecommerce.product_service.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceApplicationTests {

	@Autowired
	private ProductController productController;
	@Test
	void contextLoads() {
	}

	@Test
    void test(){
		System.out.println(productController.hello());
	}

}
