package org.example;

import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.example.service.AdvancedBookService;
import org.example.service.SimpleBookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class LibraryConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService simpleBookService(BookRepository bookRepository) {
        return new SimpleBookService(bookRepository);
    }

    @Bean
    public BookService advancedBookService(BookRepository bookRepository) {
        return new AdvancedBookService(bookRepository);
    }
}