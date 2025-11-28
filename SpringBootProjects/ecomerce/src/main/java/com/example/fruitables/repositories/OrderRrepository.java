package com.example.fruitables.repositories;

import com.example.fruitables.models.Coupon;
import com.example.fruitables.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRrepository extends JpaRepository<Order, Long> {
}

