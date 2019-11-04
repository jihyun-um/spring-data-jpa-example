package com.jihyunum.spring.data.jpa.example.repository;

import com.jihyunum.spring.data.jpa.example.ExampleApplication;
import com.jihyunum.spring.data.jpa.example.model.Author;
import com.jihyunum.spring.data.jpa.example.model.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ExampleApplication.class)
class ReviewRepositoryTest {

    @Autowired
    ReviewRepository repository;

    @Test
    public void findAllByBookId() {
        List<Review> reviews = repository.findAllByBookId(20001L);
        assertThat(reviews).isNotNull();
        assertThat(reviews.size()).isEqualTo(2);
    }

}
