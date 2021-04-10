package b_operater;

import java.util.Scanner;  //ctrl+shift+ O

public class Simplecalculator {

	public static void main(String[] args) {
		
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		double num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("숫자를 입력하세요");
//		double num2 = Integer.parseInt(sc.nextLine());
//		System.out.println("연산자를 입력하세요");
//		String cal = sc.nextLine();
//		
//		String result = cal.equals("+")?(num1+num2)+"":cal.equals("-")?(num1-num2)+"":cal.equals("*")?(num1*num2)+"":cal.equals("/")?(num1/num2)+"":"확인불가";
//					     // 조건식 	?	
//						//   참                          참
//						// 거짓 							    거짓
//		System.out.println(num1+cal+num2+"="+result);
		
		
		
		
	Scanner sc =new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	double num1= Integer.parseInt(sc.nextLine());
	System.out.println("두번째 숫자를 입력해주세요");
	double num2 =Integer.parseInt(sc.nextLine());
	System.out.println("연산자를 입력해주세요");
	String bb = sc.nextLine();
	
	String res= bb.equals("+")?(num1+num2)+"" 
			   :bb.equals("-")?(num1-num2)+""
		       :bb.equals("*")?(num1*num2)+""
			   :bb.equals("/")?(num1/num2)+"":"연산자 오류";
	System.out.println(num1+bb+num2+"="+ res);
	
			
	
		
	}
	}


