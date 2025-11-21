package com.example.bootStrap.repostories;

import com.example.bootStrap.models.About;
import com.example.bootStrap.models.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
