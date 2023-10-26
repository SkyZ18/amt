package com.api.article_api.token;

import com.api.article_api.models.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "token")
public class Token {

    @Id
    @GeneratedValue
    private Long id;

    private String token;

    @Enumerated(EnumType.STRING)
    private TokenType tokenType;

    private boolean expired;

    private boolean revoked;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
}
