package com.ajay.ecommerce.product_service.repository;

import com.ajay.ecommerce.product_service.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {
}