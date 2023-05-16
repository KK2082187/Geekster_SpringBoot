package com.geekster.Mapping.Controller;

import com.geekster.Mapping.Model.Book;
import com.geekster.Mapping.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping(value = "book")
    public void addBook(@RequestBody Book book){
        bookService.aBook(book);
    }
    @GetMapping(value = "getBook")
    public void getBook(){
        bookService.getbook();
    }
}
