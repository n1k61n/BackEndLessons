package com.example.fruitables.repositories;

import com.example.fruitables.models.CartItem;
import com.example.fruitables.models.Cashback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashbackRrepository extends JpaRepository<Cashback, Long> {
}
