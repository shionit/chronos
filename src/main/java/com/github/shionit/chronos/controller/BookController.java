package com.github.shionit.chronos.controller;

import com.github.shionit.chronos.model.Book;
import com.github.shionit.chronos.usecase.BookService;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by @shionit on 2020/05/30.
 */
@RestController
@RequestMapping("/api/book")
@Setter
public class BookController {

    /** logger */
    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Book> getBooks() {
        log.info("getBooks called");
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        log.info("getBook called. param {}", id);
        return bookService.getBook(id);
    }
}
