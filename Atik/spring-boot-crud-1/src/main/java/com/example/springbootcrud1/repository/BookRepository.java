package com.example.springbootcrud1.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootcrud1.model.Book;



public interface BookRepository extends CrudRepository<Book,Integer> 
{
	List<Book> findByAuthorContainingIgnoreCase(String author);
	
	List<Book> findByBooknameContainingIgnoreCase(String bookname);
}
