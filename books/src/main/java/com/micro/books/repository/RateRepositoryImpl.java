package com.micro.books.repository;

import com.micro.books.model.Rates;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Scope(WebApplicationContext.SCOPE_SESSION)
public class RateRepositoryImpl implements RateRepository {


    private  List<Rates>  allRates= new ArrayList<>(

            Arrays.asList(new Rates[]{
                    new Rates(1L,2.11,1L),
                    new Rates(2L,2.11,2L),
                    new Rates(3L,3.11,3L)

            })


    );


    private Long maxId;

    private void setMaxId(){


       this.maxId= this.allRates.stream().sorted(Comparator.comparingLong(Rates::getId).reversed())
               .findFirst().get().getId();
    }

    @Override
    public List<Rates> getAll() {

        return this.allRates;
    }

    @Override
    public Rates rateForBook(Long bookId) {


        return this.allRates.stream().filter(e->e.getId().equals(bookId)).findFirst().orElse(null);
    }

    @Override
    public Rates addRateForBook(Rates rate) {
        setMaxId();
        Rates rates = new Rates(this.maxId+1, rate.getRate(), rate.getBook());
        this.allRates.add(rates);

        return rates;
    }
    @Override
    public List<Rates> removeRateForBook(Long bookId) {

        this.allRates=this.allRates.stream().filter(e->!e.getBook().equals(bookId)).collect(Collectors.toList());

        setMaxId();
        return this.allRates;
    }
}
