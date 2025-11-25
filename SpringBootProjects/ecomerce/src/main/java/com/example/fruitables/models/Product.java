package com.example.fruitables.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true, length = 10)
    private String barcode;
    @Column(precision = 12, scale = 2)
    private BigDecimal price;
    @Column(precision = 12, scale = 2)
    private BigDecimal discount;
    private int stock;
    private String imageUrl;

    @Column(columnDefinition = "TEXT")
    private String description;
    private String shortDescription;

    @ManyToOne
    private Category category;
}
