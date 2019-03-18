package cn.ming.service;

import java.util.List;


import cn.ming.pojo.Book;

public interface BookService {

	public List<Book> getBookAll();
	
	public Book getBookById(Integer id);
	
	public Integer deleteBookById(Integer id);
	
	public Integer updateBookById(Book book);
	
	public Integer addBookById(Book book);
	
	public List<Book> getBookPage(Integer num1,Integer num2);
	
	public Integer getBookCount();
	
	public Integer getBookPageCount(Integer pageNum);
}
