package com.micro.books.controller;

import com.micro.books.model.Rates;
import com.micro.books.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RequestMapping("rates")
@RestController
public class RatesController {


    @Autowired
    RateRepository rateRepository;


    @GetMapping("all")
    public ResponseEntity<?> getAllBooksWithRates(){


        return ResponseEntity.ok(rateRepository.getAll());
    }

    @GetMapping()
    public ResponseEntity<?> getRateForBook(@RequestParam Long bookId){


        return ResponseEntity.ok(rateRepository.rateForBook(bookId));
    }

    @Secured("ROLE_ADMIN")
    @PostMapping
    public ResponseEntity<?> addRateForBook(@RequestBody Rates rate){


        rateRepository.addRateForBook(rate);

        return ResponseEntity.ok(rate);
    }
    @Secured("ROLE_ADMIN")
    @DeleteMapping
    public ResponseEntity<?> removeRateForBook(@RequestParam Long bookId){
        rateRepository.removeRateForBook(bookId);


        return getAllBooksWithRates();


    }
}
