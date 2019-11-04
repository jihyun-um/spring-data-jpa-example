package com.jihyunum.spring.data.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "writers")
public class Writer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.LAZY, mappedBy="writer")
    private Book book;

}