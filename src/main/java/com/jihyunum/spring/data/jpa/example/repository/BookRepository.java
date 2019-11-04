package com.jihyunum.spring.data.jpa.example.repository;

import com.jihyunum.spring.data.jpa.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
}
