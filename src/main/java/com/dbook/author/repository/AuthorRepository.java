package com.dbook.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbook.author.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findByUsername(String username);
}

