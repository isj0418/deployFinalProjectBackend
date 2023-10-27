package com.example.sportsbatingproject.repository.article.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "news")
public class Article  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "title")
  private String title;
  @Column(name = "content")
  private String content;
  @Column(name = "url")
  private String url;
  @Column(name = "news_content")
  private String newsContent;
  @Column(name = "press")
  private String press;
  @Column(name = "news_time")
  private String newsTime;
  @Column(name = "image_url")
  private String imageUrl;


}