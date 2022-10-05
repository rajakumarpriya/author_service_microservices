package com.dbook.author.controller;

import com.dbook.author.entity.Author;
import com.dbook.author.service.AuthorService;
import com.dbook.author.service.JwtUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

	@Autowired
	public JwtUserDetailsService jwtservice;
	
    @Autowired
    private AuthorService service;

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return service.saveAuthor(author);
    }

    @GetMapping("/authors")
    public List<Author> findAllAuthors() {
        return service.getAuthors();
    }

    @GetMapping("/authorById/{id}")
    public Author findAuthorById(@PathVariable int id) {
        return service.getAuthorById(id);
    }

    @GetMapping("/author/{name}")
    public Author findAuthorByName(@PathVariable String name) {
        return service.getAuthorByName(name);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author) {
        return service.updateAuthor(author);
    }

   
}
