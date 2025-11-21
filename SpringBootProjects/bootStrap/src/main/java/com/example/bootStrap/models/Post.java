package com.example.bootStrap.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "post")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headerTitle;
    private String subTitle;
    private String headerImageUrl;
    private String subImageUrl;
    private String content;

    @ManyToOne
    private User author;

    private LocalDate createDate;
    private LocalDate updateDate;
    private Boolean isPublished;
}
