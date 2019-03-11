package com.micro.books.controller;

import com.micro.books.repository.BooksRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("books")
@RestController
public class BooksController {

    @Autowired
    BooksRepository repository;

    @GetMapping("all")
    public ResponseEntity<?> getAllBooks(){



        return ResponseEntity.ok(repository.getBooksList());
    }




    @GetMapping
    public ResponseEntity<?> findBookById(@RequestParam("bookid") Long bookid){


        return ResponseEntity.ok(repository.finById(bookid));
    }
}
