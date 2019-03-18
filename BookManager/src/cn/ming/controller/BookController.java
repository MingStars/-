package cn.ming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ming.pojo.Book;
import cn.ming.pojo.User;
import cn.ming.service.BookService;
import cn.ming.service.UserService;

@Controller
public class BookController {
    @Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String doLogin(Model model,@RequestParam("name")String name,@RequestParam("password")String password) {
		System.out.println(name);
		User user=userService.getUserByName(name);
		if(user!=null) {
		if(user.getPassword().equals(password)) {
			return "redirect:/getAllBook";
		}else {
			model.addAttribute("info", "密码错误");
		return "welcome";
	}
	}
		model.addAttribute("info", "用户名错误");
		return "welcome";
	}
	@RequestMapping("/getAllBook")
	public String getAllBook(Model model,@RequestParam(value="pageSize",defaultValue="5")Integer pageSize,@RequestParam(value="pageIndex",defaultValue="1")Integer pageIndex) {
		
		if(pageSize%1!=0||pageSize<1) {
			pageSize=5;
		}
		Integer pageCount = bookService.getBookPageCount(pageSize);
		if(pageSize%1!=0||pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		
		List<Book> lis = bookService.getBookPage(pageIndex, pageSize);
		
		
		model.addAttribute("lis", lis);
		model.addAttribute("count",bookService.getBookCount());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageIndex",pageIndex);
		model.addAttribute("pageCount", pageCount);
		if (){

        }


		return "index";
	}
	@RequestMapping("doRemove")
	public String doRemove(Model model,Integer id) {
		Integer res = bookService.deleteBookById(id);
		if(res>0) {
		return "redirect:/getAllBook";
		}
		
		return "redirect:/getAllBook";
	}
	@RequestMapping("toInsert")
	public String toInsert() {

        
		return "add";
	}
	
	@RequestMapping("/doInsert")
	public String doInsert(Model model,Book book) {
		Integer res = bookService.addBookById(book);
		if(res>0) {
			return "redirect:/getAllBook";
			}
		return "redirect:/getAllBook";
		
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Model model,Integer id) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
		return "edit";
	}
	
	@RequestMapping("doUpdate")
	public String doUpdate(Model model,Book book) {
		System.out.println(book);
		
		Integer res = bookService.updateBookById(book);
		if(res>0) {
			return "redirect:/getAllBook";
			}
		return "redirect:/getAllBook";
	}
	
}
