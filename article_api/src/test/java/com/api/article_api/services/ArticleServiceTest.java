package com.api.article_api.services;

import com.api.article_api.models.ArticleModel;
import com.api.article_api.repositories.ArticleRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleServiceTest {

    String TEST_NAME = "TEST";
    String TEST_DESCRIPTION = "This is a test";
    Long TEST_QUANTITY = 1L;

    ArticleModel articleModel;
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    ArticleService articleService;

    @BeforeEach
    public void createSomeTestDataForTesting() {
        articleModel = ArticleModel.builder()
                .name(TEST_NAME)
                .description(TEST_DESCRIPTION)
                .quantity(TEST_QUANTITY)
                .build();
        articleRepository.save(articleModel);
    }

    @Test
    public void getAllTestArticlesFromDatabase() {
        HttpStatusCode expected = HttpStatus.OK;
        HttpStatusCode actual = articleService.getArticles().getStatusCode();
        assertEquals(expected, actual);
    }

    @Test
    public void createNewArticleWithParameter() {
        HttpStatusCode expected = HttpStatus.OK;
        HttpStatusCode actual = articleService.saveArticle(articleModel).getStatusCode();
        assertEquals(expected, actual);
    }

    @Test
    public void deleteNewlyCreatedArticle() {
        HttpStatusCode expected = HttpStatus.ACCEPTED;
        HttpStatusCode actual = articleService.deleteArticleById(articleModel.getId());
        assertEquals(expected, actual);
    }

    @Test
    public void throwErrorWhenArticleNotFoundWhileDelete() {
        HttpStatusCode expected = HttpStatus.NOT_FOUND;
        HttpStatusCode actual = articleService.deleteArticleById(1L);
        assertEquals(expected, actual);
    }

    @AfterEach
    public void deleteAllTestData() {
        articleRepository.deleteAll();
    }

}