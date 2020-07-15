package com.github.shionit.chronos.usecase;

import com.github.shionit.chronos.model.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 書籍管理サービス
 */
@Service
public class BookService {

  /**
   * mock data
   */
  private static final List<Book> MOCK_BOOKS;

  static {
    List<Book> books = new ArrayList<>();
    books.add(Book.builder().id(1L).title("This is me.").isbn("123-444-56").build());
    books.add(Book.builder().id(2L).title("Hello world").isbn("246-777-89").build());
    books.add(Book.builder().id(3L).title("Apple pen").isbn("369-000-54").build());
    MOCK_BOOKS = Collections.unmodifiableList(books);
  }

  /**
   * 書籍を取得する。
   *
   * @return 書籍のリスト
   */
  public List<Book> getBooks() {
    return Collections.unmodifiableList(MOCK_BOOKS);
  }

  /**
   * 指定したIDの書籍を取得する。
   *
   * @param id 書籍ID
   * @return 書籍
   */
  public Book getBook(Long id) {
    return MOCK_BOOKS.stream()
        .filter(b -> b.getId().equals(id))
        .findAny()
        .orElse(null);
  }
}
