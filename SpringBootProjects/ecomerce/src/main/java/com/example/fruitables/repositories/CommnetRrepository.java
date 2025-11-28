package com.example.fruitables.repositories;

import com.example.fruitables.models.Category;
import com.example.fruitables.models.Comment;
import com.example.fruitables.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommnetRrepository extends JpaRepository<Comment, Long> {
}
