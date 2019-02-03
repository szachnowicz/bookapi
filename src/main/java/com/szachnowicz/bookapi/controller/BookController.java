package com.szachnowicz.bookapi.controller;

import com.szachnowicz.bookapi.model.Book;
import com.szachnowicz.bookapi.repo.BookRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(bookRepo.findAll(), HttpStatus.OK);
    }

}
