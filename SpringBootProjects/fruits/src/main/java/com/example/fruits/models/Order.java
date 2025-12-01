package com.example.fruits.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Hansı Müştəriyə aid olduğunu göstərir
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private LocalDateTime orderDate = LocalDateTime.now();

    @Column(nullable = false)
    private Double totalAmount; // Sifarişin ümumi məbləği

    private String shippingAddress; // Sifariş verilərkən təyin edilən çatdırılma ünvanı

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // Məsələn: YENİ, ÖDƏNİLDİ, GÖNDƏRİLİR

}

