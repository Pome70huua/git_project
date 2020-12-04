package day12;

public class Student {
    private int id;
    private String grade;
    private String name;
    
     Student(int id,String grade,String name){
    	 this.id =id;
    	 this.grade=grade;
    	 this.name=name;
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + ", name=" + name + "]";
		
	}
	}
