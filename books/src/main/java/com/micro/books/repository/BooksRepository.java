package com.micro.books.repository;

import com.micro.books.model.Book;

import java.util.List;

public interface BooksRepository {


    List<Book> getBooksList();

    Book finById(Long bookId);

}
