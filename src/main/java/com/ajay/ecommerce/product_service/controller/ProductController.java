package com.ajay.ecommerce.product_service.controller;

import com.ajay.ecommerce.product_service.dto.CreateProductDTO;
import com.ajay.ecommerce.product_service.entity.product;
import com.ajay.ecommerce.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hello")
    public String hello(){
        return "hello you sucessfully hit the hello() endpoint";
    }

    @PostMapping
    public String createProduct(@RequestBody CreateProductDTO createProductDTO){
        productService.createProduct(createProductDTO);
        return "Product created successfully";

    }

    @GetMapping
    public List<product> getAllProducts(){
        return productService.getAllProducts();
    }
}
