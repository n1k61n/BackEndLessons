package com.example.fruitables.models;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
=======
import java.time.LocalDateTime;

import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties.Apiversion.Use;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    private LocalDateTime orderDate;
    
    private Double totalPrice;


    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    
    @ManyToOne
    @JoinColumn (name = "user_id")  
    private User user;

    
>>>>>>> 134365bff4f968ae47ace3baed81d2b596f130a1
}
