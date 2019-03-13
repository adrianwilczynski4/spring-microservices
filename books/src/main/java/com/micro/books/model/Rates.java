package com.micro.books.model;


import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class Rates  {

    public Rates(Long id, Double rate, Long bookid) {
        this.id = id;
        this.rate = rate;
        this.book = book;
    }

    private Long id;

    private Double rate;


    private Long book;


}
