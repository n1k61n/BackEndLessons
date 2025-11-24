package com.example.studentRaytings.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
    @Column(name = "group_number")
    private String groupNumber;

    @Column(unique = true)
    private String email;
    private String password;
}