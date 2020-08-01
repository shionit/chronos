package com.github.shionit.chronos.usecase;

import com.github.shionit.chronos.model.Book;
import com.github.shionit.chronos.model.repository.BookRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;
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
   * 書籍を取得する。
   *
   * @return 書籍のリスト
   */
  public MutableList<Book> getBooks() {
    return Lists.mutable.ofAll(bookRepository.findAll());
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
