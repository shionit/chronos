package com.github.shionit.chronos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 書籍エンティティ
 */
@Data
@Entity
@NoArgsConstructor
public class Book {

  /**
   * 書籍ID
   */
  @NonNull
  @Id
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
