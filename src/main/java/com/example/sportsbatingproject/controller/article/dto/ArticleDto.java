package com.example.sportsbatingproject.controller.article.dto;

import com.example.sportsbatingproject.repository.article.entity.Article;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ArticleDto {
  private Long id;
  private String title;
  private String content;
  private String url;
  private String news_content;
  private String press;
  private String news_time;
  private String image_url;

  public static ArticleDto toArticleDTO(Article articleEntity) {
    ArticleDto articleDTO = new ArticleDto();
    articleDTO.setId(articleEntity.getId());
    articleDTO.setTitle(articleEntity.getTitle());
    articleDTO.setContent(articleEntity.getContent());
    articleDTO.setUrl(articleEntity.getUrl());
    articleDTO.setNews_content(articleEntity.getNewsContent());
    articleDTO.setPress(articleEntity.getPress());
    articleDTO.setNews_time(articleEntity.getNewsTime());
    articleDTO.setImage_url(articleEntity.getImageUrl());
    return articleDTO;
  }
}