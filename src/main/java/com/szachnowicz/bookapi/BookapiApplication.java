package com.szachnowicz.bookapi;

import com.szachnowicz.bookapi.model.Book;
import com.szachnowicz.bookapi.model.User;
import com.szachnowicz.bookapi.repo.BookRepo;
import com.szachnowicz.bookapi.repo.UserIBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BookapiApplication implements CommandLineRunner {

    @Autowired
    UserIBatisRepository repository;

    @Autowired
    BookRepo bRepo;


    public static void main(String[] args) {

        SpringApplication.run(BookapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Book> all = bRepo.findAll();
        all.forEach(System.out::println);



    }
}

