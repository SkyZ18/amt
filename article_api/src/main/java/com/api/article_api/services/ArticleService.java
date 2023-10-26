package com.api.article_api.services;

import com.api.article_api.models.ArticleModel;
import com.api.article_api.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
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

    public HttpStatusCode deleteArticleById(Long id) {
        if(articleRepository.existsById(id)) {
            articleRepository.deleteById(id);
            return HttpStatus.ACCEPTED;
        }
        else return HttpStatus.NOT_FOUND;
    }

    public Optional<ArticleModel> updateArticleById(Long id, ArticleModel articleModel) {
        if(articleRepository.existsById(id)) {
            articleModel.id = id;
            articleRepository.save(articleModel);
        } else throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return Optional.of(articleModel);
    }

    public HttpStatusCode postArticleWithParameter(ArticleModel articleModel) {
        if(
                articleModel.getId() != null
                && !Objects.equals(articleModel.getName(), "")
                && !Objects.equals(articleModel.getDescription(), "")
                && articleModel.getQuantity() != null)
        {
            articleRepository.save(articleModel);
            return HttpStatus.CREATED;
        } else {
            return HttpStatus.BAD_REQUEST;
        }
    }

    public HttpStatusCode deleteAllDataInDatabase() {
        articleRepository.deleteAll();
        return HttpStatus.OK;
    }

}
