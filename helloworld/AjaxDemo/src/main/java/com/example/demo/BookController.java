package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@GetMapping("/book_id")
	@ResponseBody
	public Book book(int id){
		if(id==1){
			Book book1 = new Book();
			book1.setId(1);
			book1.setAuthor("曹雪芹");
			book1.setName("红楼梦");
			book1.setPrice(30f);
			book1.setIntroduce("《红楼梦》（又名《石头记》《金玉缘》），中国古典四大名著之首，清代作家曹雪芹创作的章回体长篇小说，它也是一部具有世界影响力的人情小说作品，举世公认的中国古典小说巅峰之作，中国封建社会的百科全书，传统文化的集大成者。");
			return  book1;
		}else if(id==2) {
			Book book2 = new Book();
			book2.setId(2);
			book2.setAuthor("罗贯中");
			book2.setName("三国演义");
			book2.setPrice(68f);
			book2.setIntroduce("《三国演义》（全名为《三国志通俗演义》，又称《三国志传》）"
					+ "是中国古典四大名著之一，亦是中国第一部长篇历史章回小说，"
					+ "作者一般被认为是元末明初的罗贯中");
			return  book2;
		}else if(id==3) {
			Book book3 = new Book();
			book3.setId(3);
			book3.setAuthor("吴承恩");
			book3.setName("西游记");
			book3.setPrice(60f);
			book3.setIntroduce(""
					+ "中国四大名著、四大奇书之一。清代多位学者提出《西游记》作者是明代吴承恩。"
					+ "这部小说以“唐僧取经”这一历史事件为蓝本，通过作者的艺术加工，深刻地描绘了当时的社会现实。"
					+ "全书主要描写了孙悟空出世及大闹天宫后，遇见了唐僧、猪八戒和沙僧三人，西行取经，一路降妖伏魔，"
					+ "经历了九九八十一难，"
					+ "终于到达西天见到如来佛祖，最终五圣成真的故事。");
			return  book3;
		}else{
			Book book4 = new Book();
			book4.setAuthor("施耐庵");
			book4.setName("水浒传");
			book4.setPrice(45f);
			book4.setIntroduce("《水浒传》是以白话文写成的章回小说，列为中国古典四大文学名著之一，"
					+ "六才子书之一。其内容讲述北宋山东梁山泊以宋江为首的绿林好汉，由被逼落草，发展壮大，"
					+ "直至受到朝廷招安，东征西讨的历程。作者历来有争议，"
					+ "一般认为是施耐庵所著，而罗贯中则做了整理，金圣叹删修为七十回本。");
			return  book4;
		}
		
	}
	
	@GetMapping("/book")
	@ResponseBody
	public Book book(HttpServletRequest quest,HttpServletResponse response){
		Book book = new Book();
		book.setAuthor("吴承恩");
		book.setName("西游记");
		book.setPrice(30f);
		return book;
	}
	@GetMapping("/allbook")
	@ResponseBody
	public String allbook(HttpServletRequest quest,HttpServletResponse response){
		String jsonStr = "{\"allnum\":4}";
		return jsonStr;
	}
	
	//
	@GetMapping("books")
 public ModelAndView books(){
		List<Book> list = new ArrayList<Book>();
		Book book1 = new Book();
		book1.setId(1);
		book1.setAuthor("曹雪芹");
		book1.setName("红楼梦");
		book1.setPrice(30f);
		list.add(book1);
		Book book2 = new Book();
		book2.setId(2);
		book2.setAuthor("罗贯中");
		book2.setName("三国演义");
		book2.setPrice(68f);
		list.add(book2);
		Book book3 = new Book();
		book3.setId(3);
		book3.setAuthor("吴承恩");
		book3.setName("西游记");
		book3.setPrice(60f);
		list.add(book3);
		Book book4 = new Book();
		book4.setId(4);
		book4.setAuthor("施耐庵");
		book4.setName("水浒传");
		book4.setPrice(45f);
		list.add(book4);
		ModelAndView mv = new ModelAndView();
		mv.addObject("bookList",list);
		mv.setViewName("book_list");
		return mv;
	}
	@GetMapping("books1")
	@ResponseBody
	 public List<Book> books1(){
			List<Book> list = new ArrayList<Book>();
			Book book1 = new Book();
			book1.setAuthor("曹雪芹");
			book1.setName("红楼梦");
			book1.setPrice(30f);
			list.add(book1);
			Book book2 = new Book();
			book2.setAuthor("罗贯中");
			book2.setName("三国演义");
			book2.setPrice(68f);
			list.add(book2);
			Book book3 = new Book();
			book3.setAuthor("吴承恩");
			book3.setName("西游记");
			book3.setPrice(60f);
			list.add(book3);
			Book book4 = new Book();
			book4.setAuthor("施耐庵");
			book4.setName("水浒传");
			book4.setPrice(45f);
			list.add(book4);
			ModelAndView mv = new ModelAndView();
			mv.addObject("bookList",list);
			mv.setViewName("book_list");
			return list;
		}
}
