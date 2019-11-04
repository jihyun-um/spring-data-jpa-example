package com.jihyunum.spring.data.jpa.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "reviews")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Book book;

    private int rating;

    @NotNull
    private String description;

}
