package com.example.studentRaytings.repositories;



import com.example.studentRaytings.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Student, Long> {

    // Spring Data JPA metod konvensiyası: Email-ə görə istifadəçi tapmaq
    Optional<Student> findByEmail(String email);
}