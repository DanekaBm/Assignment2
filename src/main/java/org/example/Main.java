package org.example;

import org.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        BookService simpleService = context.getBean("simpleBookService", BookService.class);
        BookService advancedService = context.getBean("advancedBookService", BookService.class);

        System.out.println(simpleService.getBook(1));
        System.out.println(advancedService.getBook(2));

        LazyBean lazyBean = context.getBean(LazyBean.class);

        context.close();
    }
}