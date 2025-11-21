package com.example.bootStrap.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contacts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headerTitle;
    private String subTitle;
    private String imageUrl;

    private String name;
    private String email;
    private String phoneNumber;
    private String message;
    private String description;


}
