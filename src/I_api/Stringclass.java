package I_api;

import java.lang.Character.Subset;
import java.util.Arrays;

public class Stringclass {

	public static void main(String[] args) {
		/*
		 * String
		 * -여러개의 문자를 사용하기 쉽게 만들어놓은 클래스
		 *
		 * String 의 주요 메서드
		 * 
		 * -equals():문자열의 내용이 같은지 반환한다
		 * -length(): 문자열의 길이를 반환한다
		 * -charAt(): 특정 인덱스에 위치한 문자를 반환한다
		 * 
		 * -substring(): 문자열의 특정 부분을 잘라서 반환한다
		 * -indexOf(); 문자열 내의( 특정 문자)의 인덱스를 반환한다
		 * -contains():문자열이 특정 문자열을 포함 하고있는지 반환한다 (여부 블린으로)
		 * -split(): 문자열을 특정 문자를 기준으로 나누어 배열형태로 변환한다
		 * -trim(): 문자열 앞뒤의 공백을 제거해 반환한다
		 * -valueOf(): 다른 타입의 데이터를 문자열로 변환해 반환한다
		 * -replace (): 문자열  내의 특정문자를 다른문자로 변경한다.
		 */
	
		//equals():문자열의 내용이 같은지 반환한다
		boolean equals ="문자열".equals("문자열");
		System.out.println(equals);
		
		
		String str1= "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
		//1번에서 2번을 비교하는것
//		System.out.println(str2.equals(str1));
		//널에서는 equals를 찾을수 없다 
		//null이 있을수 있는 경우에는 앞에두지말고 뒤에다 둔다.
		
		String str ="12345";
		int length = str.length(); //문자열내용의 길이를 반환
		for(int i= 0;i<length;i++){
			char charAt=str.charAt(i);
			System.out.println(charAt);
			
		}
		
		
		
		
		
		//문자열 뒤집기
	   String rev="";
	  for(int i=str.length() - 1; 0 <=i ;i--){
			rev +=str.charAt(i);
		}
		System.out.println(rev);
		
		str="0123456789";
		String sub1=str.substring(3); //3번 인덱스부터 잘라서 반환한다
		System.out.println(sub1);
		String sub2=str.substring(5,8);
		//5번 인덱스부터 8번 인덱스 전 까지 잘라서 반환한다  (8번은 포함되지 않는다.)
		System.out.println(sub2);
		
		str="수박 오렌지 귤 블루베리";
		int index =str.indexOf("오렌지");// 오렌지의 시작 인덱스를 반환한다.
		System.out.println(index);  //3번인덱스에서 시작이된다
		
		
		//서브스트링과 인덱스는 같이 사용하는 경우가 많다
		//substring과 indexOf를 조합해서 문자열 자르기
		
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
			    "블루베리 3000원"
				};
		
		for(int i=0;i<menu.length;i++){
			String aa=menu[i].substring(0,menu[i].indexOf(" "));
			//System.out.println(aa);
		}
		//가격만 잘라서int 타입 변수에 저장해주세요
		for(int i=0;i<menu.length;i++){
			int price=Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원")));
			System.out.println(price);
		}
		
		
		//contains():문자열이 특정 문자열을 포함 하고있는지 반환한다 (여부 블린으로)
		
		str ="abcd";
		boolean contains= str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
		for(int i=0;i<menu.length;i++){
			if(menu[i].contains("오렌지")){  //오렌지라는 단어를 찾아서
				System.out.println("오렌지는"+i+"번 인덱스에 있습니다");
				
			}
		}
		
		str="a/b/c";
		String[] split =str.split("/");
		System.out.println(Arrays.toString(split));
		
		//메뉴명과 가격나누기
		for(int i=0; i< menu.length;i++){
			String[] m=menu[i].split(" ");
			System.out.println("메뉴명:"+m[0]+"/가격"+m[1]);
		}
	//trim(): 문자열 앞뒤의 공백을 제거해 반환한다
		str="   문자열      ";
		String trim=str.trim();
		System.out.println("["+str+"]->["+trim+"]");
		//사용자가 실수로 아이디나 비밀번호 앞뒤에 공백이 들어가는 것을 방지하기 위해 사용할수잇다
		String id= "myid";
		String passward ="mypassward";
		System.out.println(id);
		System.out.println(passward);
		System.out.println(id.trim());
		System.out.println(passward.trim());
		
		
		//valueOf(): 다른 타입의 데이터를 문자열로 변환해 반환한다
		//인트타입을 스트링타입으로
		int number = 10;
		str=number+"";
		str=String.valueOf(number);
		
		//replace (): 문자열  내의 특정문자를 다른문자로 변경한다.
		str="123456789";
		str=str.replace("3","짝");
		System.out.println(str);
		str= str.replace("6", "짝");
		str= str.replace("9", "짝");
		System.out.println(str);
		
		
		str="banana";
		str=str.replace("a", "u");
		System.out.println(str);
		
		
		
		
	}                     
	
}
