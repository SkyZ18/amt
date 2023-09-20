package com.api.article_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "article")
public class ArticleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "article_id")
    public Long id;

    @Column(name = "article_name")
    public String name;

    @Column(name = "article_description")
    public String description;

    @Column(name = "article_quantity")
    public Long quantity;
}
