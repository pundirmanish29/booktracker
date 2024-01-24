package com.booktracker.repository;

import com.booktracker.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods if needed
}

