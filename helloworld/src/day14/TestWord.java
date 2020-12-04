package day14;

public class TestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(4,0,null );
	}

	public static void div(int a, int b,int[] arr){
		int c = 0;
		try{
			//c = a/b;
			 System.out.println("数组的长度："+ arr.length); 
			 c = a/b;   
		}catch(ArithmeticException e){   
			System.out.println("出了算术异常...");
			e.printStackTrace();
		//}catch(NullPointerException e){
			//System.out.println("出现了空指针异常....");
		}catch(Exception e){    
			System.out.println("我是急诊室,能治百病...");

		}
		System.out.println("结果："+ c);
	
	}

}
