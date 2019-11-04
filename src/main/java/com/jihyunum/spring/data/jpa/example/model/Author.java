package com.jihyunum.spring.data.jpa.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "authors")
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.LAZY, mappedBy="author")
    private Book book;

}
