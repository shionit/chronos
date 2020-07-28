package com.github.shionit.chronos.model.repository;

import com.github.shionit.chronos.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
