package com.infsis.proyectoSpringBoot.Servicies;

import com.infsis.proyectoSpringBoot.DTOs.ArticleDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete(Integer articleId);
}
