package com.example.studentRaytings.repositories;


import com.example.studentRaytings.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Spring Data JPA avtomatik olaraq CRUD metodlarını (save, findById, findAll) təmin edir.
    // Additional custom methods for Student repository (if needed) can go here.
}