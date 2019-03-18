package cn.ming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ming.dao.BookDao;
import cn.ming.pojo.Book;
import cn.ming.service.BookService;
@Service
public class BookServiceImpl implements BookService{
  
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getBookAll() {
		
		return bookDao.getBookAll();
	}

	@Override
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(id);
	}

	@Override
	public Integer deleteBookById(Integer id) {
		// TODO Auto-generated method stub
		return bookDao.deleteBookById(id);
	}

	@Override
	public Integer updateBookById(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBookById(book);
	}

	@Override
	public Integer addBookById(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBookById(book);
	}

	

	@Override
	public List<Book> getBookPage(Integer pageIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		System.out.println(pageIndex+"dsdsd"+pageSize);
		Integer num2 = pageSize;
		Integer num1 = (pageIndex-1)*pageSize;
		
		return bookDao.getBookPage(num1, num2);
	}
	

	@Override
	public Integer getBookPageCount(Integer pageNum) {
		Integer num= bookDao.getBookCount()%pageNum;
		Integer pageCount = null;
		if(num==0) {
			 pageCount = bookDao.getBookCount()/pageNum;
		}else if (num>0) {
			 pageCount = (bookDao.getBookCount()/pageNum)+1;
		}
		return pageCount;
	}
	
	@Override
	public Integer getBookCount() {
		// TODO Auto-generated method stub
		return bookDao.getBookCount();
	}

	

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	
}
