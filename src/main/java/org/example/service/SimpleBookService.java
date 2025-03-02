package org.example.service;

import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SimpleBookService implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public SimpleBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String getBook(int id) {
        return "Simple service: " + bookRepository.findBookById(id);
    }
}