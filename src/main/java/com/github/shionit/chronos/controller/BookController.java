package com.github.shionit.chronos.controller;

import com.github.shionit.chronos.model.Book;
import com.github.shionit.chronos.usecase.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 書籍のコントローラ
 *
 * Created by @shionit on 2020/05/30.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/book")
public class BookController {

    /** BookService */
    private final BookService bookService;

    /**
     * 書籍の一覧を取得する
     * @return 本のリスト
     */
    @GetMapping("/")
    public List<Book> getBooks() {
        log.info("getBooks called");
        return bookService.getBooks();
    }

    /**
     * 書籍を取得する
     * @param id 書籍ID
     * @return 書籍
     */
    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        log.info("getBook called. param {}", id);
        return bookService.getBook(id);
    }
}
