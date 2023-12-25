package com.example.bookmvc.controller;

import com.example.bookmvc.entity.Book;
import com.example.bookmvc.sevice.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/bookRegister")
    public String getRegisterPage() {
        return "book_register";
    }

    @GetMapping("/myBooks")
    public ModelAndView getMyBooks() {
        List<Book> all = bookService.findAll();
        return new ModelAndView("my_books","book",all);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/myBooks";
    }
}
