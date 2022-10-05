package com.dbook.author.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbook.author.entity.DAOUser;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	//@Query(value = "SELECT e.username FROM DAOUser e where e.username='demo' and id=1")
	UserDao findByUsername(String username);
	
	//@Query(value = "SELECT e.username FROM DAOUser e where e.username='demo' and id=1")
	List<DAOUser> findAll();
	
}
