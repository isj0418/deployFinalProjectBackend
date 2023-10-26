package com.example.sportsbatingproject.repository.article;

import com.example.sportsbatingproject.repository.article.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
  @Query(value = "SELECT * FROM news ORDER BY STR_TO_DATE(news_time, '%Y-%m-%d %H:%i:%s') DESC", nativeQuery = true)
  Page<Article> findAllByOrderByNewsTimeDesc(Pageable pageable);
}
