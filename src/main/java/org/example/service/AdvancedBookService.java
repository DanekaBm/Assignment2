package org.example.service;

import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("advancedBookService")
public class AdvancedBookService implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public AdvancedBookService(@Qualifier("bookRepository") BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String getBook(int id) {
        return "Advanced service: " + bookRepository.findBookById(id);
    }
}