package day11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Network net1=new Network();
      net1.name="托尼";
      net1.id=7;
      net1.department="硬件开发与维护部";
      
      System.out.println(net1.name+ net1.id+net1.department);
      
      
      
      Employee  HV_people=new  Employee();
          HV_people.name="约翰";
          HV_people.id=6;
          HV_people.department="网络维护部";
          
          System.out.println(HV_people.name+  HV_people.id+HV_people.department);
          HV_people.comply();
          HV_people. work();
          net1. major();
          
          
	}

}
