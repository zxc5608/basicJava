package b_operater;
import java.util.Scanner;
public class Etc {

	public static void main(String[] args) {
		/*
		 *  비트연산자        비트란 컴퓨터가 표현하는 가장 작은단위 
		 * - |, &,^, ~, <<, >>    // 1byte : 01010101 0이나 1이 8개가 있는것
		                          // 각 하나하나가 bit 라고 한다
		 * - 비트단위로 연산한다
		 * 
		 *  기타연산자
		 * - (참조연산자):특정 범위 내에 속해잇는 멤버를 지칭할때 사용한다
		 * - (type): 형변환
		 * - ?:(삼향연산자): 조건식 ? 조건식 이 참일경우 : 조건식이 거짓일 경우 ★중요
		 * 					트루 			트루
		 * 					펄스							펄스 
		 * 
		 */	 

		
		System.out.println(10 | 15); // 둘다 0인경우 0그외 1
		//10: 00001010
		//15: 00001111
		// 둘을 연산한결과    00001111
		
		int x= 10;
		int y = 20;
		int result = (x < y) ? x:y;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2여 자
		
	
		
		
		
		
		
		
		
		
		
		
		int regNo=1;		                          // import의 단축키를 넣고 sc.nextline rr
		String gender = (regNo==1)? "남자":"여자";
		System.out.println("당신의 성별은"+gender+"입니다");
		
		
		gender= regNo ==1 ?"남자 ": (regNo==2 ?"여자":"확인불가");//삼항연산자를 2번 넣은경우 
		System.out.println("당신의 성별은"+gender+"입니다");
		
		
		//연습문제  임의의 2개의 숫자를 입력 받고, 둘중 더큰 숫자를 출력해주세요
		
		
		Scanner.sc = new Scanner(System.out);
		System.out.println("첫번째 숫자");
		int a= Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자");
		int b=Integer.parseInt(sc.nextLine());
		int res=
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째숫자");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째숫자");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		System.out.println(num1>num2?num1:num2);
	
	
		// 숫자를 입력받고,그숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요
		// 그외의 숫자를 입력하면 확인불가를 출력해주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num1 = Integer.parseInt(sc.nextLine());
		//System.out.println(num1==1?"남자":(num1==2?"여자":(num1==3?"남자":(num1==4?"여자":"확인불가"))));
		//노가다식 내가 쓴 답
		
		gender= num1==1||num1==3?"남자":(num1==2||num1==4?"여자":"확인불가");
		System.out.println(gender);
		
		
		
	
	}

}
