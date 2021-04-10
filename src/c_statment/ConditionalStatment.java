package c_statment;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {
//		/*
////		 * 조건문 -if문 swich문
////		 * 
////		 * if문 -if(조건식){}: 조건식의 결과가 true이면 블럭안의 문장을 수행한다 -else if(조건식){} : 다수의
////		 * 조건이 필요할때 if뒤에 추가된다 -else{}: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가된다.
////		 */
////
////		int a = 1;
////
////		if (a == 1) {
////			System.out.println("조건식의 연산결과가 true이면 수행된다.");
////		}
////		if (a == 0) {
////			System.out.println("조건식의 연산결과가 false이면 수행되지않는다."); // 얘네는 별개의조건
////		}
////		if (a == 1) {
////			System.out.println("a가 1인경우에 하고싶은거");// 한번실행되면 빠져나간다.
////		} else if (a == 2) {
////			System.out.println("a가 2인 경우에 하고싶은것");
////		} else if (a == 3) {
////			System.out.println("a가 3인 경우에 하고싶은것");
////		}else{
////			System.out.println("이외의 경우에 하고싶은것");
////		}
////		
////		
////		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
////		
////		int score=50;
////		
////		if(60<=score){
////			System.out.println("합격");
////		}else{
////			System.out.println("불합격");
////		}
////		
////		// 성적에 등급을  부여하는 프로그램을 작성해주세요
////		
////		score = 80;
////		
////		String grade = null;  
////		//null값이 없다라는의미를 사용하는데  초기화해준이유 변수라는것은 초기화를해야 사용할수있다.
////
////		if (90 <= score && score<=100) {
////			grade = "A";
////
////		} else if (80 <= score) {
////			grade = "B";
////
////		} else if (70 <= score) {
////			grade = "C";
////
////		} else if (60 <= score) {
////			grade = "D";
////
////		} else if (50 <= score) {
////			grade = "E";
////
////		} else {
////			grade = "F";
////		}
////		System.out.println(score+"점에대한 등급은"+grade+"입니다");
////		
////		
////		
////		
////		score = 99;
////		grade = null;
////
////		if (90 <= score) {
////			grade = "A";
////			if (97 <= score) {
////				grade += "+";
////			} else if (score <= 93) {
////				grade += "-";
////			}
////		} else if (80 <= score) {
////			grade = "B";
////			if (87 <= score) {
////				grade += "+";
////			} else if (83 <= score) {
////				grade += "-"; // grade=grade+"-"
////			}
////		} else if (70 <= score) {
////			grade = "C";
////			if (77 <= score) {
////				grade += "+";
////			} else if (73 <= score) {
////				grade += "-";
////			}
////		} else if (60 <= score) {
////			grade = "D";
////			if (67 <= score) {
////				grade = "+";
////			} else if (63 <= score) {
////				grade = "-";
////			}
////
////		} else {
////			grade = "F";
////		}
////		System.out.println(grade);
////	
////
////
////
////	/*
////	 * swich문
////	 * swich(int/String){case 1:brake;}
////	 * -조건식의 결과는 정수와 문자열만 (JDK1,7부터 문자열 허용) 허용한다
////	 * 조건식과 일치하는 case문 이후의 문장을 수행한다.
////	 */
////
////		a=1;
////		switch(a){
////		case 1:
////			System.out.println("a가 1인경우에 하고싶은것");
////			break;
////		case 2:
////			System.out.println("a가 2인경우에 하고싶은것");
////			break;
////		case 3:
////			System.out.println("a가 3인경우에 하고싶은것");
////			break;
////		default:
////			System.out.println("ark 1,2,3이 아닌 경우에 하고싶은것");
////			
////		}
////	
////	
////		String b="a";
////		switch(b)
////		{
////		case "a":
////			System.out.println("b가\"a\"인 경우에 하고싶은것");   //  \" <=문자열안에 쌍따옴표를 넣고싶을때 사용
////			break;
////		case "b":
////			System.out.println("b가\"b\"인 경우에 하고싶은것");
////		break;
////		default:
////			System.out.println("그외의 경우에 하고싶은것");
////			break;
////			
////		
////		}
////		
////		// 주어진 월에 해당하는 계절을 출력해봅시다.
////		int month =8;
////		String season = null;
////		switch(month){
////		case 3:case 4:case 5:
////			season="봄";
////			break;
////		case 6:case 7:	case 8:
////			season="여름";
////			break;
////		case 9:case 10:case 11:
////			season ="가을";
////			break;
////		case 12:case 1:case 2:
////			season="겨울";
////			break;
////	
////		}System.out.println(month+"월은"+season+"입니다");
////
////
////		
////		
////		
////		// 스위치 문을이용해서 점수의 등급을 매길거야
////		score = 99;
////		grade = null;
////		switch (score / 10) {
////		case 9:case 10:
////			grade = "A";
////			break;
////		case 8:
////			grade = "B";
////			break;
////		case 7:
////			grade = "C";
////			break;
////		case 6:
////			grade = "D";
////			break;
////		default:
////			grade = "F";
////		}
////		System.out.println(score+"점"+grade);
////
////		
////		//연습문제 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
////		
		Scanner sc= new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요"); 
//		int num = Integer.parseInt (sc.nextLine());
//		String grade1= null;
//		if(num==0){
//			grade1= "0";
//			
//		}else{
//			grade1=" 0이 아님";
//		}
//		System.out.println(grade1);
//		
//		// 스위치문
//		
//		switch(num){
//		case 0:
//			System.out.println("0입니다");
//			break;
//			default:			System.out.println("0이 아닙니다.");
//		}
//		
//		// 숫자를 입력받아 그숫자가 홀수인지 짝수인지 출력해주세요
//	
//		System.out.println("숫자를 입력해주세요"); 
//		int num1 = Integer.parseInt (sc.nextLine());
//		
//		if(num1%2 ==0){
//			System.out.println("짝");
//			
//		}else{
//			System.out.println("홀수");
//		}
//			
//	switch(num%2){
//		case 1:
//			System.out.println("짝수");
//	default:
//		System.out.println("홀수?");
//		}
//	
//	//정수 3개를 입력받아 총점 평균 등급을 확인하세요
//	
//	
//	System.out.println("점수를 입력해주세요 국,영,수 "); 
//	int num1 = Integer.parseInt (sc.nextLine());
//	int num2 = Integer.parseInt (sc.nextLine());
//	int num3 = Integer.parseInt (sc.nextLine());
//	String grade=null;
//	int sum = num1+num2+num3;
//	double avg= sum/3;
//	
//	 if(90<=avg){
//		 grade="A";
//	 }else if(80<=avg){
//		 grade="B";
//	 }else if(70<=avg){
//		 grade="C";
//	 }else if(60<=avg){
//		 grade="D";
//	 }else{
//		 grade="F";
//	 }
//	 System.out.println("합계"+sum);
//	 System.out.println("평균"+avg);
//	 System.out.println("등급"+grade);
//	 
	
	
	

// 숫자 4개를 입력받아 오름차순으로 출력해주세요

	System.out.println("숫자를 입력해주세요"); 
	int x = Integer.parseInt (sc.nextLine());
	System.out.println("숫자를 입력해주세요");
	int y = Integer.parseInt (sc.nextLine());
	System.out.println("숫자를 입력해주세요");
	int z = Integer.parseInt (sc.nextLine());
	System.out.println("숫자를 입력해주세요");
	if(x > y){
		int t=x;
		x=y;
		y=t;
		}else if(x>z){
			int c=x;
			x=z;
			z=c;
		}else if(y>z){
			int w=y;
			y=z;
			z=w;
		}else{
			
		}
		System.out.println(""+x+","+y+","+z);
		
			

	
		
		
	}
	}
	 
