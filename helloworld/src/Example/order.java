package Example;
public class Order {
	public int orderNumber(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8) {  //对8个数进行排序	
				int[] arr=new int[] {a1,a2,a3,a4,a5,a6,a7,a8};		
				for(int j = arr.length-1; j>=1 ; j--) {   //从小到达进行冒泡算法
				     if(arr[j]<arr[j-1]) { 
					 int temp ;    
				     temp = arr[j]; 
				     arr[j] = arr[j-1]; 
				     arr[j-1] = temp;  
				    }
				  }
					return arr[0];		 //把8个数值的最小值返回
			}
              public int max(int a,int b) {
            	  if (a>b)return a;
            	  else return b;
              }
}

