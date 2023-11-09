package com.api.article_api.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "article")
public class ArticleModel {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public String description;

    public Long quantity;
}
