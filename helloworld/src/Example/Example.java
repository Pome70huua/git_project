package Example;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Order or = new Order();
        or.orderNumber(8,12,56,48,79,5,9,88);
        or.max(5, 8);
    
		System.out.println(or.orderNumber(8,12,56,48,79,5,9,88));
		System.out.println(or.max(5, 8));

	}

}
