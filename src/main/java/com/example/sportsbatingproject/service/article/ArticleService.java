package com.example.sportsbatingproject.service.article;

import com.example.sportsbatingproject.controller.article.dto.ArticleDto;
import com.example.sportsbatingproject.repository.article.ArticleRepository;
import com.example.sportsbatingproject.repository.article.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleService {
  private final ArticleRepository articleRepository;

  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  public Page<ArticleDto> findPage(Pageable pageable) {
    Page<Article> articlePage = articleRepository.findAllByOrderByNewsTimeDesc(pageable);
    return articlePage.map(ArticleDto::toArticleDTO);
  }

  public ArticleDto findArticleById(Long id) {
    Article articleEntity = articleRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("뉴스 기사를 찾을 수 없습니다: " + id));
    return ArticleDto.toArticleDTO(articleEntity);
  }

  public List<ArticleDto> findLatestArticles(int count) {
    Pageable pageable = PageRequest.of(0, count, Sort.by(Sort.Direction.DESC, "newsTime"));
    Page<Article> latestArticlesPage = articleRepository.findAll(pageable);
    return latestArticlesPage.getContent().stream()
        .map(ArticleDto::toArticleDTO)
        .collect(Collectors.toList());
  }
}