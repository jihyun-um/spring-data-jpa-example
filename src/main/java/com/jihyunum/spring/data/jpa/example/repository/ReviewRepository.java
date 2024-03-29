package com.jihyunum.spring.data.jpa.example.repository;

import com.jihyunum.spring.data.jpa.example.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByBookId(Long bookId);
}
