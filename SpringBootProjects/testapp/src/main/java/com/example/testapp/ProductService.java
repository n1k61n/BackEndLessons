package com.example.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

// 1. Аннотация, помечающая класс как Spring-бин сервиса
@Service
public class ProductService {

    // 2. Внедрение зависимости ProductRepository
    private final ProductRepository productRepository;

    @Autowired // Внедрение через конструктор - предпочтительный способ
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // --- CRUD операции ---

    // saveProduct was removed (createProduct already saves) - keep service methods cohesive
    // Создание нового продукта
    @Transactional // Гарантирует, что операция будет выполнена как одна транзакция
    public Product createProduct(String name, BigDecimal price, String category, Integer stock) {
        Product newProduct = new Product(name, price, category);
        newProduct.setStock(stock);
        // Используем метод save() из JpaRepository
        return productRepository.save(newProduct);
    }

    @Transactional
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Получение продукта по ID
    @Transactional(readOnly = true) // Оптимизация: только для чтения данных
    public Optional<Product> getProductById(Long id) {
        // Используем метод findById() из JpaRepository
        return productRepository.findById(id);
    }

    // Получение всех продуктов
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        // Используем метод findAll() из JpaRepository
        return productRepository.findAll();
    }

    // Поиск продуктов по имени (partial, case-insensitive)
    @Transactional(readOnly = true)
    public List<Product> findProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    // Обновление продукта
    @Transactional
    public Product updateProductPrice(Long id, BigDecimal newPrice) {
        // Сначала находим сущность
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Продукт с ID " + id + " не найден"));

        // Изменяем поле
        product.setPrice(newPrice);

        // Сохраняем измененную сущность.
        // Метод save() также используется для обновления, если объект имеет существующий ID.
        return productRepository.save(product);
    }

    // Удаление продукта
    @Transactional
    public void deleteProduct(Long id) {
        // Используем метод deleteById() из JpaRepository
        productRepository.deleteById(id);
    }


}