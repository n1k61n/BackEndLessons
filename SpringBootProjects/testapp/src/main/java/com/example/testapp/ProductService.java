package com.example.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createNewProduct(String name, Double price){
        Product newProduct = new Product(name, price);
        return productRepository.save(newProduct);
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public Product getProductById(long id){
        return productRepository.findById(id);
    }
}
