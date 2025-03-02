package org.example.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {
    private final Map<Integer, String> books = new HashMap<>();

    public BookRepository() {
        books.put(1, "Spring in action");
        books.put(2, "Effective Java");
    }

    public String findBookById(int id) {
        return books.getOrDefault(id, "Book not found");
    }
}