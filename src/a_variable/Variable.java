package a_variable;

import java.util.Scanner;
 
//임포트는 패키지와 클래스사이  import는 스캐너의 위치를 알려준다
public class Variable {

	public static void main(String[] args) {
		 /*	
	      * 데이터의 종류
	      *-정수 : 10 -5
	      *-실수 : 3.15,-1.5
	      *-문자 :'a' , '3'
	      *-논리 : true, false
	      *
	      *프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름 을 붙여 놓았다
	      *(자료형/data type)
	      *
	      *기본형 타입 
	      * - 정수 : byte(1) short(2) * int(4) long (8)
	      * - 실수 :float(4) * double(8)
	      * - 문자 : char (2)
	      * - 논리 : boolean(1)
	      *      
	      *      
	      * 데이터 타입은 변수를 만들때 주로 사용한다.
	      * 
	      */

	// 상수 : 값이 변하지 않는 데이터 (예:10.-5)
	// 변수 : 값이 변하는 데이터 (예: x,y)
	// 변수를 만들고 변수를 조작해서 원하는 결과를 만들어 내는 것이 
	// 프로그래밍의 전부라 할 수 있다.

	// 변수를 만드는것: 변수선언
	// 변수를 만드는 방법 : 데이터타입 변수이름

		int name;
		
		//데이터타입을 선택할떄는 표현하고자하는 데이터에 맞는 
		//타입을 선택해주면 된다
		// 변수이름을 정할떄는 표현하고자 하는 데이터의 의미와 부합합는
		// 이름을 지어주면된다.
		double pi;

		//long name; // 한 블럭 ({}) 안에서 별수의 이름은 중복될수 없다. 
		
		//  = (대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장 
		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것 
		pi = 3.14;// 변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30;   // 보통 선언과 초기화를 동시에 한다.
		long l = 40L;   //접미사 L을 붙여야 long 타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다. 
		char c ='한';   // 따옴표안에 한글자만 넣어야한다.
		boolean b =true; // true , false
		
		// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 초기화 해주세요
		int aa = 22;
		long cc = 12L;
		byte vv = 11;
		short qq =12 ;
		float tt = 5.3f;
		char zz = 'v';
		double xx = 1.2;
		boolean uu = true;
		
		System.out.println(name);		
		//실행 단축키  ctrl+ f11
		 name = 100;
		 System.out.println(name);
		 //위에서 만든 8개의 변수에 새로운 값을 자정하고 출력해주세요.
		 
		 aa= 12;
		 System.out.println(aa);
		 cc =44L;
		 System.out.println(cc);
		 vv= 55;
		 System.out.println(vv);
		 qq= 45;
		 System.out.println(qq);
		 tt= 7.98f;
		 System.out.println(tt);
		 zz='g';
		 System.out.println(zz);
		 xx=3.4;
		 System.out.println(xx);
		 uu= false;
		 System.out.println(uu);
		 
		 
		 /*
		  * 타입의 선택기준
		  * 
		  * 정수
		  * - byte ,short : 메모리를 절약해야할때
		  * - int: 기본(-20억 +20억)
		  * - long : int 의 범위를 벗어날때
		  * 
		  * 실수 
		  * - float : 메모리절약
		  * - double : 기본
		  * 
		  */
		 
		 // 문자열
		 String str = "문자여러개..";
		 System.out.println(str);
		 
		 //형변환
		 //다른타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데
		 //이를 형변환(type casting)이라 한다.
		 
		 int small =10;
		 long big = 10L;
		 
		 small = (int)big;  //인트타입에 롱타입을 저장해야할때 형변환
		 big = small; // 표현범위가 작은(int)쪽에서 큰쪽(long)으로 형변환은 생략가능하다.
	     
		 /*
		  * 명명규칙
		  * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용 할 수 있다. 
		  * - 숫자로 시작할수없다
		  * - 예약어는 사용할수없다
		  * - [낙타식 표기법을 사용한다.(mySampleVariable)] 단어의 첫글자
		  *  클래스명의 첫글자는 대문자로 한다 (MySampleClass)]
		  */
		
		 /* 
		  * 상수 
		  * - 처음담긴 값을 변경할수 없는 그릇
		  * - 리터럴에 의미를 부여하기 위햐 사용한다.
		  */
		 final int MAX_NUMBER = 10; 
		 // MAX_NUMBER=100;//컴파일에러발생
		 
		 //출력
		  System.out.print("줄바꿈을 하지 않는다.");
		  System.out.print("줄바꿈을 하지 \n않는다."); 
		  System.out.println("줄바꿈을\t 한다."+ name);  //  \t tap(스페이스 4칸)
		  System.out.printf("문자열:%s,숫자 %d", "Hello",10);
		 //출력 포맷을 지정한다.
		
		  System.out.println();
		  System.out.println("A"+100);
		  System.out.println(10+20+"30");
		  System.out.println("10"+(20+30));  //문자열이 앞에있으면 뒤에값은 문자열로 바뀐다.
		  //괄호를 쳐주면 먼저연산
		
		  
		  // 입력
	  Scanner sc = new Scanner(System.in);// 입력받기위한 클래스
//		  // import 단축키 Ctrl + shift + o 
//		 System.out.println("아무거나입력해주세요>");
//		 String str2 = sc.nextLine();
//		System.out.println("입력받은 내용:"+str2);
//	
//		int nextInt =sc. nextInt();
//		double nextDouble= sc. nextDouble();
//		//이런것들이 있지만 버그로인해 사용하지않는다
		
//		System.out.println("int 입력>");
//		int nextInt= sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine =sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
//		System.out.println("int 입력>");
//		int number= Integer.parseInt(sc.nextLine());//인트타입으로 바꿔준다.
//		System.out.println(number);
//		Double.parseDouble(sc.nextLine());
	
		
		// 자신의 이름을 저장할 변수를 선언해주세요
		  String myname;
		
		// 위에서 선언한 변수를 초기 화 하기 위해 이름을 입력받아주세요
		  System.out.println("이름을 입력해주세요");
		  myname = sc.nextLine();
		  
		  //자신의 나이를 저장할 변수를 선언해주세요
		  int myage;
		  //위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요
		  System.out.println("나이를 입력해주세요");
		  myage = Integer.parseInt(sc.nextLine());
		// 위에서 입력받은 이름과 나이를 출력해주세요  
		  System.out.println("이름:"+myname+"/나이:"+myage);
		 
	}
		
	

}
    		