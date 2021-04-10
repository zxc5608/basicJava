package e_ooResturant;

import java.util.Arrays;

public class hostman {

	public static void main(String[] args) {
		Washing washing= new Washing();
		
		String[]order= washing.order(); 
		System.out.println(Arrays.toString(order));
		
		System.out.println("세탁중>>>>>>>>>세탁완료");
		String[] setac={"완성된 세탁물 "};
		System.out.println(Arrays.toString(setac));
		
		washing.wash(setac);
		
		washing.door();
		
	}

}
