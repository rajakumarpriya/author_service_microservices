package com.dbook.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbook.book.entity.Book;
import com.dbook.book.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Book getBookByName(String name) {
        return repository.findByTitle(name);
    }

    public String deleteBook(int id) {
        repository.deleteById(id);
        return "Book removed !! " + id;
    }

    public Book updateBook(Book book) {
        Book existingBook = repository.findById(book.getId()).orElse(null);

        existingBook.setTitle(book.getTitle());
        existingBook.setCategory(book.getCategory());
        existingBook.setAuhtor(book.getAuhtor());
        existingBook.setAuhtorid(book.getAuhtorid());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setPublished_date(book.getPublished_date());
        existingBook.setChapter(book.getChapter());
        existingBook.setActive_status(book.getActive_status());
        existingBook.setPrice(book.getPrice());
        return repository.save(existingBook);
    }


}
