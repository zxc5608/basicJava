package c_statment;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		
	 Scanner s = new Scanner(System .in);
	    
	  int n1;
	  int n2;
	  int n3;
	    
	    while(true){                                                                    //while(true)는 무한반복
	    	 n1 = (int)(Math.random()*9)+1;                                           //Math 랜덤함수는 Math random ()*900+100//100에서 900까지의 랜덤
	    	 n2 = (int)(Math.random()*9)+1; 
	    	 n3 = (int)(Math.random()*9)+1; 
	    	
	    	if(!(n1==n2||n1==n3||n2==n3)){
	    		break;                                                           //!조건식의 결과를 반대로저장한다
	    		} 
	    		
	    }
	    
	    while(true){
	    	System.out.println("숫자 3가지를 입력해주세요");
	    	int a1= Integer.parseInt(s.nextLine());
	    	int a2= Integer.parseInt(s.nextLine());
	    	int a3= Integer.parseInt(s.nextLine());
	    
			if (n1==a1&& n2==a2 && n2==n3) { 
				System.out.println("정답입니다.");
				break;
			}
			if(a1==1&&a2==1&&a3==1){
				System.out.println(""+n1+n2+n3);
			}
		
			
			
			if (a1 == n1) {
				System.out.println("스트라이크");
			} else if (a1 == n2 || a1 == n3){
				System.out.println("볼");
			
			}
			
			
			if(a2 == n2) {
				System.out.println("스트라이크");
			} else if (a2 == n1 || a2 == n3){
				System.out.println("볼");
			}
		

		
		   if(a3==n3){
			System.out.println("스트라이크");
			}else if(a3==n1||a3==n2){
			System.out.println("볼");
			}
		  
	    }
	}
}	   

