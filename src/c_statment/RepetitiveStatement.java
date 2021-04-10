package c_statment;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * -for문
		 * -while문
		 * -do while 문
		 * 
		 *
		 * -for문 (초기화; 조건식; 증감식){
		 * -포함하고 있는 문장들을 정해진 횟수만큼 해주는 문장
		 */

		
//		
//		for(int i=1;i<=10;i++){
			//초기화 : 조건식과 증감식에 사용할 변수초기화
			//조건식: 연산결과가 true이면 블럭안의 내용을 수정한다
			//증감식: 변수를 증가 / 감소시켜 반목문을 제어한다
//			System.out.println(i+"번째 반복");
//			
			
		
			//초기화한 변수를 블럭안에서 사용할 수 있다.
			
			
			//규칙이 있는문장들을 효율적으로 작성하기 위해 반복문을 사용한다
			
//			int sum=0;  //1부터 10까지 합계저장
//			
//			for(int i=1;i<=10;i++){
//				sum+=i;
//			}
//			System.out.println(sum);
//			
//			
//			sum=0;
//			
//			for(int i =100;i>=1;i--){
//				sum+=i;
//				System.out.println(sum);
//			}
//			System.out.println(sum);
			
			
			//1부터 100까지 짝수의 합을 출력해주세요
//			
//			int sum=0;
//
//		for (int i = 2; i <= 100; i += 2) {
//			sum += i;
//		 }
//		  System.out.println(sum);
//
//		  
//		  sum=0;
//
//			for (int i = 2; i <= 100; i++) {
//				if(i%2==0){
//				sum += i;
//			 }
//			  System.out.println(sum);
//		  
//		  }
//			
//		  //1부터 100까지 홀수의 합을 구해주세요
//		  sum= 0;
//		  for(int i = 1; i<=100;i+=2){
//			  sum+=i;
//		  
//		  }
//		System.out.println(sum);
//		// if 문을 이용한 홀수
//		 sum=0;
//
//			for (int i = 1; i <= 100; i++) {
//				if(i%2==1){
//				sum += i;
//			 }
//			  System.out.println(sum);
//		  
//		  }
//			
//			
//	// 구구단 출력
//			/*
//			 * 2*1=2
//			 * 2*2=4
//			 */
//			sum=0;
//			for(int i= 1; i<=9;i++){
//				
//				System.out.println("2 * "+ i +" = "+i*2);
//				
//			}
//			
//			sum =0;
//			for(int i=1;i<=9;i++ ){
//				System.out.println("7* "+i+" = "+i*7);
//			}
//			
//			//2단부터 9단까지 반복
//			
//			for(int i=1;i<=9;i++){    //여기는 2단부터 9단까지 의 룹
//				
//				for(int j=1; j<=9;j++){
//					
//					System.out.println(i+" * "+ j+" = "+i*j);
//					
//				}
//				
//				
//			}
//			
//	
//			
//			//구구단 전체를 가로로 출력해주세요
//			
//			/*
//			 * 2*2=2   3*1=3  4*1=4
//			 * 2*2=4
//			 */
//			
//			for(int i=1;i<=9;i++){
//				for(int j=2;j<=9;j++){
//					
//					System.out.print("  "+j+" * "+ i+" = "+i*j+"\t");
//				}
//				System.out.println("");
//			}
//	
//	
//	/*
//	 * 
//	 * while문
//	 * while (조건식){}
//	 * 포함하고있는 문장들을 조건식이 만족하는 동안 반복하는문장
//	 * 반복횟수가 정확하지 않는경우에 주로사용
//	 * 
//	 * 	 
//	 * 
//	 * 
//	 * */
//			
//			int a= 1;
//			//a에 2씩 몇번 곱해야 1000이상이 되는지 알아보자
//			
//			int count =0;
//			while(a<1000){
//				a *= 2;
//				count++;
//				System.out.println(count+":"+a);
//				
//			}
//	
//	
//			/*do-while문
//			 * - do{}while(조건식);
//			 * - 최소한 한번의 수행을 보장한다.
//			 * 
//			 *//////////////////////////////
//			
//			//숫자 맞추기 게임
//			
////			int answer=(int)(Math.random()*100)+1;// 1~100랜덤수
////			int input= 0;
////		Scanner s= new Scanner(System.in);
////			do{
////			System.out.println("1~100사이의 수를 입력해주세요");
////				input = Integer.parseInt(s.nextLine());
////				 
////				if(answer<input){
////					System.out.println(input+"보다 작습니다");
////					
////				}else if(input<answer){
////					System.out.println(input+"보다 큽니다");
////					
////				
////				}else {
////					System.out.println("정답입니다");
////				}
////			}while(input != answer);
////			
//			
//			
//			
//		//문제 	while문으로 구구단을 만들어라
		
		
		
		
		
		
		
		
		
		
		
		
		
//			
//		
//		int i=1;
//		while (i <= 9) {
//			int j = 2;
//			while (j <= 9) {
//
//				System.out.print(j + " * " + i + " = " + i * j + "\t");
//				j++;
//				}
//			System.out.println();
//			i++;
//		}
//			
//	
//		//이름붙은 반복문
//		
//		outer : for(i=2;i<=9;i++){  
//			for(int j=1;j<=9;j++){
//				if(j==5){
//					
//					break;//가장 가까 운 반복문 하나를 빠져나간다(전체 1234
//					
//					//break outer; // outer이라는 반복문을 빠져나간다 2단 1234
//					//continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다 현재를건너뛴다 (전체의 5만 건너뛴다)
//					
//					//continue outer;// outer라는 이름의 현재 반복회차를 빠져나ㅣ간다.(전체1234만 나온다 
//					// 브레이크와 컨티뉴의 차이 
//				}
//				System.out.println(i+" * "+j+" = "+i*j);
//			} 
//			System.out.println();
//		}
			
		
			
			
	
					
	
		
			
		
	
			for(int i=1;i<=5;i++){
				for(int j=5;j>=i;j--){
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			
			
			
	}
}
	
			
		

			
	
	


