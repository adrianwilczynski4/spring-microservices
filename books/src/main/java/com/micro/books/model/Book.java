package com.micro.books.model;

import lombok.*;


@Getter
@Setter
public class Book {


    public Book(Long id, String title, String description, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        Author = author;
    }

    private Long id;

    private String title;

    private String description;

    private String Author;

    private Long rateId;





}
