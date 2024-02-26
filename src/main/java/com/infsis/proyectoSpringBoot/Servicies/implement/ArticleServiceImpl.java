package com.infsis.proyectoSpringBoot.Servicies.implement;

import com.infsis.proyectoSpringBoot.DTOs.ArticleDTO;
import com.infsis.proyectoSpringBoot.Models.Article;
import com.infsis.proyectoSpringBoot.Servicies.ArticleService;

import java.util.Optional;

public class ArticleServiceImpl implements ArticleService {
    public ArticleServiceImpl() {
        super();
    }

    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }
    private ArticleDTO articleDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }
    private Article DTOtoArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());
        return article;
    }
}
