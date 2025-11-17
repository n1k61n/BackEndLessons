package com.example.emin.models.languages;

import com.example.emin.models.Article;
import jakarta.persistence.*;

@Entity
public class ArticleLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String photoUrl;

    private String langCode;

    @ManyToOne
    private Article article;
}
