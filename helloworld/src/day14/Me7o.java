package day14;

public class Me7o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=0;
			int b=10;
			int c=b/a;
			System.out.println(c);
			
			J15 j = null;
			j.age(1);
			
			int h[] =new  int [2];
			System.out.println(h[3]);					
		}
		catch(ArithmeticException e){
			System.out.println("出现算术异常："+e);
		}
		catch(NullPointerException e1) {
			System.out.println("出现空指针异常："+e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("出现数组越界异常："+e2);
		}
}

	}

