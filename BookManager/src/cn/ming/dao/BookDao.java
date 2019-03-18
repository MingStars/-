package cn.ming.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.ming.pojo.Book;

public interface BookDao {

	@Select("SELECT * FROM book")
	public List<Book> getBookAll();
	@Select("SELECT * FROM book where id=#{id}")
	public Book getBookById(Integer id);
	@Delete("delete  FROM book where id=#{id}")
	public Integer deleteBookById(Integer id);
	@Update("update book set name=#{name},author=#{author},publish=#{publish},publishdate=#{publishdate},page=#{page},price=#{price},content=#{content} where id=#{id} ")
	public Integer updateBookById(Book book);
	@Insert("insert into book (name,author,publish,publishdate,page,price,content) values (#{name},#{author},#{publish},#{publishdate},#{page},#{price},#{content})")
	public Integer addBookById(Book book);
	@Select("select * from book limit #{num1},#{num2}")
	public List<Book> getBookPage(@Param("num1")Integer num1,@Param("num2")Integer num2);
		
	@Select("select count(1) from book")
	public Integer getBookCount();
	
}
