package com.github.shionit.chronos.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.ISBN;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * タイトル
   */
  @NotBlank
  @Length(max = 256)
  private String title;

  /**
   * ISBNコード
   */
  @ISBN
  private String isbn;

  /**
   * 書籍URL
   */
  @URL
  @Length(max = 256)
  private String url;

  /**
   * 発売日
   */
  @PastOrPresent
  private Date publishedDate;

  /**
   * 登録パラメータ
   */
  @NoArgsConstructor
  @Data
  public static class CreateBook {
    /**
     * タイトル
     */
    @NotBlank
    @Length(max = 256)
    private String title;

    /**
     * ISBNコード
     */
    @ISBN
    private String isbn;

    /**
     * 書籍URL
     */
    @URL
    @Length(max = 256)
    private String url;

    /**
     * 発売日
     */
    @PastOrPresent
    private Date publishedDate;

    /**
     * 書籍エンティティを生成する。
     * @return 書籍
     */
    public Book toEntity() {
      final Book book = new Book();
      book.title = title;
      book.isbn = isbn;
      book.url = url;
      book.publishedDate = publishedDate;
      return book;
    }
  }
}
