package day13;

import java.sql.Date;

public interface UserOrderMapper {

	String selectByBookId(int id);
	String selectByBookDate(Date date);
	String selectByBookName(String name);
	int deleteByBookId(Integer id);
	int updateByBookId(Integer id);
	int insert(Book book);
	
	String selectByStudentId(int id);
	String selectByStudentAddress(Address address);
	String selectByStudentName(String name);
	int deleteByStudnetId(Integer id);
	int updateByStudentId(Integer id);
	int insert(Student student);
}
