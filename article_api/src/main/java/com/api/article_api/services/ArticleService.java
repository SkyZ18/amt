package com.api.article_api.services;

import com.api.article_api.models.ArticleModel;
import com.api.article_api.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ResponseEntity<List<ArticleModel>> getArticles() {
        return ResponseEntity.ok(articleRepository.findAll());
    }

    public Optional<ArticleModel> findArticleById(Long id) {
        return articleRepository.findById(id);
    }

    public ResponseEntity<ArticleModel> saveArticle(ArticleModel articleModel) {
        return ResponseEntity.ok(articleRepository.save(articleModel));
    }

    public String deleteArticleById(Long id) {
        if(articleRepository.existsById(id)) articleRepository.deleteById(id);
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return "Deleted Successfully";
    }

    public Optional<ArticleModel> updateArticleById(Long id, ArticleModel articleModel) {
        if(articleRepository.existsById(id)) {
            articleModel.id = id;
            articleRepository.save(articleModel);
        } else throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return Optional.of(articleModel);
    }

    public ResponseEntity<ArticleModel> postArticleWithParameter(String name, String description, Long quantity) {
        ArticleModel articleModel = new ArticleModel();

        articleModel.name = name;
        articleModel.description = description;
        articleModel.quantity = quantity;

        return ResponseEntity.ok(articleRepository.save(articleModel));
    }

}
