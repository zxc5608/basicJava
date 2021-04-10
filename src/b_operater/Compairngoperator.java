package b_operater;

public class Compairngoperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * -,<, >, <=, >=, ==, !=(다르다,같지않다)
		 * - 문자열비교 :equals()
		 */

		
		boolean b =10 <20;    //비교연산자의 연산결과는 boolean이다
		System.out.println(b);
		b = 10 <= 20 - 15;    //산술연산후 비교연산을 수행한다. 
		System.out.println(b);
		
		
		String str1="abc";
		String str2 ="abc";
		b= str1 == str2;  // 문자열의 내용이 아닌 주소(참조형 String)를 비교한것
		System.out.println(b);
	
		// String의 내용을 비교하기 위해서 는 equals()메서드를 사용한다
		b= str1.equals(str2);   //두개 내용 비교하는 함수 
		System.out.println(b);
		b=!str1.equals(str2);  //! 부정의 의미 (같지 않다)
		System.out.println(b);
		
		// int타입의 x와 y변수를 만들고 , 다음의 문장들을 코드로작성해주세요
		int x= 3;
		int y =2;
		//1. x가 y보다 크다
		System.out.println(x>y);
		//2. x +5와 y는 같다
		System.out.println(x+5 ==y);
		//3. y는 홀수이다
		System.out.println(y%2==1);
		//4. " 변수" 와 " 데이터는 같다.
		System.out.println("변수".equals("데이터"));
		
		

	
	}
	}