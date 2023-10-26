package com.example.sportsbatingproject.controller.article;

import com.example.sportsbatingproject.controller.article.dto.ArticleDto;
import com.example.sportsbatingproject.service.article.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
  private final ArticleService articleService;

  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @GetMapping("/api/articles")
  public Page<ArticleDto> listArticlesByPage(
      @RequestParam(defaultValue = "1") int page,
      @RequestParam(defaultValue = "9") int size) {
    Pageable pageable = PageRequest.of(page - 1, size);
    return articleService.findPage(pageable);
  }

  @GetMapping("/api/articles/{id}")
  public ArticleDto getArticleById(@PathVariable Long id) {
    return articleService.findArticleById(id);
  }

  @GetMapping("/api/articles/latest")
  public List<ArticleDto> getLatestArticles(@RequestParam(defaultValue = "5") int count) {
    return articleService.findLatestArticles(count);
  }
}