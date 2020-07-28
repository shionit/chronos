package com.github.shionit.chronos.usecase;

import com.github.shionit.chronos.model.Book;
import com.github.shionit.chronos.model.repository.BookRepository;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 書籍管理サービス
 */
@Service
@RequiredArgsConstructor
public class BookService {

  /**
   * BookRepository
   */
  private final BookRepository bookRepository;

  /**
   * mock data
   */
  private static final Map<Long, Book> MOCK_BOOKS = ImmutableMap.of(
//      1L, Book.builder().id(1L).title("This is me.").isbn("123-444-56").build(),
//      2L, Book.builder().id(2L).title("Hello world").isbn("246-777-89").build(),
//      3L, Book.builder().id(3L).title("Apple pen").isbn("369-000-54").build()
  );

  /**
   * 書籍を取得する。
   *
   * @return 書籍のリスト
   */
  public List<Book> getBooks() {
    return Lists.newArrayList(bookRepository.findAll());
  }

  /**
   * 指定したIDの書籍を取得する。
   *
   * @param id 書籍ID
   * @return 書籍
   */
  public Optional<Book> getBook(Long id) {
    return bookRepository.findById(id);
  }
}
