package com.jihyunum.spring.data.jpa.example.repository;

import com.jihyunum.spring.data.jpa.example.ExampleApplication;
import com.jihyunum.spring.data.jpa.example.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ExampleApplication.class)
class AuthorRepositoryTest {

    @Autowired
    AuthorRepository repository;

    @Test
    public void findAll() {
        List<Author> authors = repository.findAll();
        assertThat(authors).isNotNull();
    }

    @Test
    public void findByName() {
        Optional<Author> author = repository.findByName("Robert Martin");
        assertThat(author).isPresent();
    }

}
