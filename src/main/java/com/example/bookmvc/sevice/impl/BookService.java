package com.example.bookmvc.sevice.impl;

import com.example.bookmvc.entity.Book;
import com.example.bookmvc.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements com.example.bookmvc.sevice.BookService {

    public final BookRepo bookRepo;
    @Override
    public Book save(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }
}
