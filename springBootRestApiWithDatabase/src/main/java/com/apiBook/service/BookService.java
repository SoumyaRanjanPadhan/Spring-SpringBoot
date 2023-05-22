package com.apiBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apiBook.Entity.Book;
import com.apiBook.dao.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	
	//get all book
	public List<Book> getAllBook() {
		List<Book> list=(List<Book>) this.bookRepo.findAll();
		return list;
	}
	
	//get single book
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookRepo.findById(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//add book
	public Book addBook(Book b) {
		Book book=bookRepo.save(b);
		return book;
	}
	
	//delete book
	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}
	
	//update book
	public void updateBook(Book book, int id) {
		book.setId(id);
		bookRepo.save(book);
	}
}
