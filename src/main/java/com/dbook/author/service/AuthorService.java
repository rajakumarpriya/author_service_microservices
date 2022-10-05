package com.dbook.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbook.author.entity.Author;
import com.dbook.author.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public Author saveAuthor(Author author) {
        return repository.save(author);
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author getAuthorById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Author getAuthorByName(String name) {
        return repository.findByUsername(name);
    }

    public Author updateAuthor(Author author) {
        Author existingAuthor = repository.findById(author.getId()).orElse(null);
        existingAuthor.setUsername(author.getUsername());
        existingAuthor.setPassword(author.getPassword());
        existingAuthor.setRole(author.getRole());
        return repository.save(existingAuthor);
    }


}
