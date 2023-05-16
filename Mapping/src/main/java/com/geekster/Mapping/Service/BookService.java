package com.geekster.Mapping.Service;

import com.geekster.Mapping.Model.Book;
import com.geekster.Mapping.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;


    public void aBook(Book book) {
        iBookRepo.save(book);
    }

    public void getbook() {
        iBookRepo.findAll();
    }
}
