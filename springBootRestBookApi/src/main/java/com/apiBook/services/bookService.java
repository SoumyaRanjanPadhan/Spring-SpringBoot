package com.apiBook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.apiBook.entities.Book;

@Component
public class bookService {
	
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"java","xyz"));
		list.add(new Book(54,"python","abc"));
		list.add(new Book(15,"javascript","def"));
		list.add(new Book(51,"c++","ghhi"));
		list.add(new Book(32,"swift","jkl"));
	}
	
	//get all books
	public List<Book> getAllBooks(){
		return list;
	}
	
	//get single book by id
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=list.stream()
					 .filter(e->e.getId()==id)
					 .findFirst()
					 .get();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}
	
	//add book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	
	//delete book
	public void deleteBook(int id) {
		list=list.stream()
				 .filter(e->e.getId()!=id)
				 .collect(Collectors.toList());
		
	}

	
	//update book
	public void updateBook(Book book, int id) {
		list=list.stream().map(b->{
			if(b.getId()==id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		
	}
	
	
	

}
