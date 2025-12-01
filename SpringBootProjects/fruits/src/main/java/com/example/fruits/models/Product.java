package com.example.fruits.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Double price; // Vahid qiyməti

    private String unit; // Məsələn: "kq", "ədəd", "qutu"

    private String imageUrl; // Vebsaytda göstərilən məhsulun şəkli

    // Məhsulun hansı Kateqoriyaya aid olduğunu göstərir
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


}