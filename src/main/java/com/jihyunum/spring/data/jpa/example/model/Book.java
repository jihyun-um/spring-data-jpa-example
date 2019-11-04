package com.jihyunum.spring.data.jpa.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "books")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    private Author author;

    @OneToMany(mappedBy="book")
    private List<Review> reviews = new ArrayList<>();

}
