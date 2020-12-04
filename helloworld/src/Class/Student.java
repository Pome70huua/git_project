package Class;

public class Student {
	private int id;
	private String name;
	private String sid;
	private String class_name;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSid(String sid) {
		this.sid=sid;
	}
	public void setclass_name(String class_name) {
		this.class_name=class_name;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getSid() {
		return this.sid;
	}
	public String getBanji() {
		return this.class_name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", sid=" + sid + ", class_name=" + class_name + "]";
	}
}

