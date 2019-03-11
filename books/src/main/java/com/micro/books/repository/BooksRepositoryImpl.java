package com.micro.books.repository;

import com.micro.books.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BooksRepositoryImpl  implements BooksRepository {
    @Override
    public List<Book> getBooksList() {

       return new ArrayList<>(
                Arrays.asList(new Book[]{
                        new Book(1L,"Krzyzacy","proza","Sienkiewicz"),
                        new Book(2L,"Ferdydurke","proza","Gombrowicz"),
                        new Book(3L,"Tajemnica twierdzy szyfrow","proza","Woloszanski")
                })
        );


    }

    @Override
    public Book finById(Long bookId) {
        return new Book(bookId,"Pan Tadeus","poezja","Adam Mickiewicz");


    }
}
