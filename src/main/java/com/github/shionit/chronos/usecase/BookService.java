package com.github.shionit.chronos.usecase;

import com.github.shionit.chronos.model.Book;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 書籍管理サービス
 */
@Service
@RequiredArgsConstructor
public class BookService {

  /**
   * mock data
   */
  private static final Map<Long, Book> MOCK_BOOKS;

  static {
    final Map<Long, Book> books = new ConcurrentHashMap<>();
    books.put(1L, Book.builder().id(1L).title("This is me.").isbn("123-444-56").build());
    books.put(2L, Book.builder().id(2L).title("Hello world").isbn("246-777-89").build());
    books.put(3L, Book.builder().id(3L).title("Apple pen").isbn("369-000-54").build());
    MOCK_BOOKS = Collections.unmodifiableMap(books);
  }

  /**
   * 書籍を取得する。
   *
   * @return 書籍のリスト
   */
  public List<Book> getBooks() {
    return Lists.newArrayList(MOCK_BOOKS.values());
  }

  /**
   * 指定したIDの書籍を取得する。
   *
   * @param id 書籍ID
   * @return 書籍
   */
  public Book getBook(Long id) {
    return MOCK_BOOKS.get(id);
  }
}
