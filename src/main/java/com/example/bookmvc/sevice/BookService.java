package com.example.bookmvc.sevice;

import com.example.bookmvc.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}

