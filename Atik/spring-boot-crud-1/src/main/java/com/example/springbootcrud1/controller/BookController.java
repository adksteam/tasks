package com.example.springbootcrud1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud1.model.Book;
import com.example.springbootcrud1.service.BookService;


@RestController
public class BookController 
{
	@Autowired
	BookService bookService;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/books")
	private List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	private Optional<Book> getBooks(@PathVariable("id") int id)
	{
		return bookService.getBookById(id);
	}
	
	@GetMapping("/book/author/{authorName}")
	private List<Book> getBookByAuthor(@PathVariable("authorName") String author)
	{
		return bookService.getBookByAuthor(author);
	}
	
	@GetMapping("/book/name/{bookname}")
	private List<Book> getBookByName(@PathVariable("bookname") String bookname)
	{
		return bookService.getBookByName(bookname);
	}
	
	@PostMapping("/book")
	private int saveBook(@RequestBody Book book)
	{
		System.out.println(book.toString());
		bookService.save(book);
		return book.getBookid();
	}
	
}

