package I_api;

import java.util.Scanner;

public class setcomma {

	public static void main(String[] args) {
		
		
		//숫자를 입력받아 입력받은 숫자에 3자리마다 콤마 (,)를 붙여주세요ㅕ.
		//100,000,000  스트링 타입으로
		
		String num2= "";//문자열로 변환해준 방
		Scanner sc= new Scanner(System.in);//스캔
		System.out.println("숫자를 입력해주세요");
		String num = sc.nextLine(); //스캔
		int j=0; //세줄거
		for(int i = num.length() - 1; i>=0 ;i--){//뒤에서부터 거꾸로 세줄거
			num2= num.charAt(i) + num2;	    //문자열에 (특정인덱스에 위치한 문자반환)해주고 문자열	
			j++;  //1씩 증가를 해줘 읽게한다
			           //↓얘가없으면 첫번째 쉼표가 있을거야 
		if(j%3==0 && j!=num.length()){
			num2 = ","+num2;
			
			
		}
		
	}System.out.println(num2);
		
}
}
