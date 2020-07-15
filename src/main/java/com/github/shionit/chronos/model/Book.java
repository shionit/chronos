package com.github.shionit.chronos.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * 書籍エンティティ
 */
@Data
@Builder
public class Book {

  /**
   * 書籍ID
   */
  @NonNull
  private Long id;

  /**
   * タイトル
   */
  private String title;

  /**
   * ISBNコード
   */
  private String isbn;

  /**
   * 書籍URL
   */
  private String url;
}
