package com.github.shionit.chronos.controller;

import com.github.shionit.chronos.model.Book;
import com.github.shionit.chronos.model.Book.CreateBook;
import com.github.shionit.chronos.usecase.BookService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 書籍のコントローラ
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/book")
public class BookController {

  /**
   * BookService
   */
  private final BookService bookService;

  /**
   * 書籍の一覧を取得する
   *
   * @return 書籍のリスト
   */
  @GetMapping("/")
  public List<Book> getBooks() {
    log.info("getBooks called");
    return bookService.getBooks();
  }

  /**
   * 書籍を取得する
   *
   * @param id 書籍ID
   * @return 書籍
   */
  @GetMapping("/{id}")
  public Optional<Book> getBook(@PathVariable("id") Long id) {
    log.info("getBook called. param {}", id);
    return bookService.getBook(id);
  }

  /**
   * 書籍を登録する
   *
   * @param bookParam 書籍登録パラメータ
   * @return 登録済み書籍
   */
  @PostMapping("/create")
  public Book updateBook(@Valid CreateBook bookParam) {
    log.info("updateBook called. param:" + bookParam);
    return bookService.saveBook(bookParam);
  }
}
