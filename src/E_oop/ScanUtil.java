package E_oop;

import java.util.Scanner;

public class ScanUtil {

	
	private static Scanner s =new Scanner(System.in);  //static을 붙이는 이유 객체생성을 사용하지 않고 하기위해
	
	//유틸리티 성향의 메서드인 경우 static 을 붙인다.
	public static String nextLine(){
		return s.nextLine();
	}
	
	public static int nextInt(){
		//Math.random();
		//Math.round(a);
		return Integer.parseInt(s.nextLine());
	}
	public static double nextDouble(){
		
		return Double.parseDouble(s.nextLine());
	}
	
	
}
