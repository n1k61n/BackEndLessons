package com.example.anime.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "app_user") // Avoid using 'user' as it's a reserved keyword in some databases
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash; // Store hashed passwords, never plaintext!

    @Column(name = "registration_date")
    private LocalDate registrationDate = LocalDate.now();

    @Column(name = "is_admin")
    private boolean isAdmin = false;
}