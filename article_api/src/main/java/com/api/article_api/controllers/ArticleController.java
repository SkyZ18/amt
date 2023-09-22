package com.api.article_api.controllers;

import com.api.article_api.models.ArticleModel;
import com.api.article_api.services.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @GetMapping("/articles")
    public ResponseEntity<List<ArticleModel>> getArticles() {
        return articleService.getArticles();
    }

    @GetMapping("/articles/{id}")
    public Optional<ArticleModel> findArticlesById(@PathVariable("id") Long id) {
        return articleService.findArticleById(id);
    }

    @PostMapping("articles/{name}&{description}&{quantity}")
    public ResponseEntity<ArticleModel> postArticle(@PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("quantity") Long quantity) {
        return articleService.postArticleWithParameter(name, description, quantity);
    }

    @DeleteMapping("/delete/article/{id}")
    public String deleteArticle(@PathVariable("id") Long id) {
        return articleService.deleteArticleById(id);
    }

    @PutMapping("/update/article/{id}")
    public Optional<ArticleModel> updateArticle(@PathVariable("id") Long id, @RequestBody ArticleModel articleModel) {
        return articleService.updateArticleById(id, articleModel);
    }
}
