package com.example.testapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Search for products by name (partial match, case-insensitive)
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByPriceLessThan(BigDecimal maxPrice);
    List<Product> findAll();
}
