package com.micro.books.repository;


import com.micro.books.model.Rates;

import java.util.List;

public interface RateRepository {


    List<Rates> getAll();


    Rates rateForBook(Long bookId);

    Rates addRateForBook(Rates rate);

    List<Rates> removeRateForBook(Long bookId);


}
