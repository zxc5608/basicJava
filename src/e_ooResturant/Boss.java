package e_ooResturant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		Alba alba=new Alba();
		
		String[]order = alba.order();
		
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는중......완성!");
		
		String[] foods={"완성된 짜장면과, 완성된탕수육"};
		System.out.println(Arrays.toString(foods));
		
		alba.serve(foods);
		
		alba.pay(order);
	}

}
