package org.example;

import org.example.repository.BookRepository;
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
}