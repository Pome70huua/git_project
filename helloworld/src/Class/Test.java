package Class;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student user1=new Student();
		Student user2=new Student();
		Student user3=new Student();
		user1.setId(1001);
		user2.setId(1002);
		user3.setId(1003);
		user1.setName("����");
		user2.setName("�");
		user3.setName("��С��");
		user1.setSid("20180217061");
		user2.setSid("20180217062");
		user3.setSid("20180217063");
		user1.setclass_name("18����������2��");
		user2.setclass_name("18����������2��");
		user3.setclass_name("18����������2��");
		List<Student> list =new ArrayList<Student>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		}
	}

}
