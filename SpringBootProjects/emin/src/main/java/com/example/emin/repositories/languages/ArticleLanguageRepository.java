package com.example.emin.repositories.languages;


import com.example.emin.models.languages.ArticleLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleLanguageRepository extends JpaRepository<ArticleLanguage, Long> {

    List<ArticleLanguage> findByLang(String lang);

    Optional<ArticleLanguage> findByArticleIdAndLang(Long articleId, String lang);
}
