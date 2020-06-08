package com.github.shionit.chronos.usecase;

import com.github.shionit.chronos.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by @shionit on 2020/06/06.
 */
@Service
public class BookService {

    private static final List<Book> mockBooks;

    static {
        List<Book> books = new ArrayList<>();
        books.add(Book.builder().id(1L).title("This is me.").isbn("123-444-56").build());
        books.add(Book.builder().id(2L).title("Hello world").isbn("246-777-89").build());
        books.add(Book.builder().id(3L).title("Apple pen").isbn("369-000-54").build());
        mockBooks = books;
    }

    /**
     * 書籍を取得する。
     *
     * @return 書籍のリスト
     */
    public List<Book> getBooks() {
        return Collections.unmodifiableList(mockBooks);
    }

    /**
     * 指定したIDの書籍を取得する。
     *
     * @param id 書籍ID
     * @return 書籍
     */
    public Book getBook(Long id) {
        return mockBooks.stream()
                .filter(b -> b.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
