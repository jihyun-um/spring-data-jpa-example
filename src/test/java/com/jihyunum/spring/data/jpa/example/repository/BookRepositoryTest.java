package com.jihyunum.spring.data.jpa.example.repository;

import com.jihyunum.spring.data.jpa.example.ExampleApplication;
import com.jihyunum.spring.data.jpa.example.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ExampleApplication.class)
class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @Test
    public void findByTitle() {
        Optional<Book> book = repository.findByTitle("Clean Code: A Handbook of Agile Software Craftsmanship");
        assertThat(book).isPresent();
    }

}
