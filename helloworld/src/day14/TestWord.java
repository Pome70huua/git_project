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
			 System.out.println("����ĳ��ȣ�"+ arr.length); 
			 c = a/b;   
		}catch(ArithmeticException e){   
			System.out.println("���������쳣...");
			e.printStackTrace();
		//}catch(NullPointerException e){
			//System.out.println("�����˿�ָ���쳣....");
		}catch(Exception e){    
			System.out.println("���Ǽ�����,���ΰٲ�...");

		}
		System.out.println("�����"+ c);
	
	}

}
