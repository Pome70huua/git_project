package Example;
public class Order {
	public int orderNumber(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8) {  //��8������������	
				int[] arr=new int[] {a1,a2,a3,a4,a5,a6,a7,a8};		
				for(int j = arr.length-1; j>=1 ; j--) {   //��С�������ð���㷨
				     if(arr[j]<arr[j-1]) { 
					 int temp ;    
				     temp = arr[j]; 
				     arr[j] = arr[j-1]; 
				     arr[j-1] = temp;  
				    }
				  }
					return arr[0];		 //��8����ֵ����Сֵ����
			}
              public int max(int a,int b) {
            	  if (a>b)return a;
            	  else return b;
              }
}

