package com.api.article_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class ArticleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticleApiApplication.class, args);
	}

}
