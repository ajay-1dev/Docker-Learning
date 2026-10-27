package com.ajay.ecommerce.product_service.service;

import com.ajay.ecommerce.product_service.dto.CreateProductDTO;
import com.ajay.ecommerce.product_service.entity.product;
import com.ajay.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(CreateProductDTO createProductDTO) {
        log.info("creating product{}", createProductDTO.toString());
        productRepository.save(product.builder().name(createProductDTO.getName()).build());
    }

    public List<product> getAllProducts() {
        log.info("fetching all products");
        return productRepository.findAll();
    }
}
