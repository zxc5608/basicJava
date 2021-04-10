package I_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규 표현식: 문자열의 패턴을 검사하는 표현식
		 *  
		 *  ^ 뒷문자로 시작 (캐럿)
		 *  
		 *  $ 앞문자로 시작
		 *  . 임의의 문자(줄바꿈 제외)
		 *  * 앞문자가 0개이상
		 *  + 앞문자가 1개이상
		 *  ? 앞문자가 없거나 1개
		 *  [] 문자의 집합이나 범위([a-z]:a부터 z까지 [^a-z]:a부터 z가 아닌것
		 *  {} 앞문자의 개수 ({2}:2개 .{2,4}:2개이상 4개 이하)
		 *  () 그룹화(1개의문자처럼 인식)
		 *  | or연산
		 *  \s 공백 ,탭 ,줄바꿈
		 *  \S 공백 ,탭 줄바꿈이 아닌문자
		 *  \w 알파벳이나 숫자
		 *  \W 알파벳이나 숫자가 아닌 문자
		 *  \d 숫자
		 *  \D 숫자가 아닌 문자
		 *  (?i) 뒷문자의 대소문자 구분안함
		 *  \ 정규표현식에 사용되는 특수문자표현
		 */
		
		String str= "abc123";
		//문자열을 검사할 정규표현식
//		String regex ="[a-z]{3}[0-9]{1,3}";//공백이 없어야 된다 
//		String regex="[a-z0-9]+";
//		String regex ="\\w*"; // *앞에있는 문자가 0개이상 
//		String regex= ".*"; //정규표현식은 넓은 범위보다 좁은범위가 더좋다 
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		
		//아이디, 전화번호 , 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요
		
		String id= "hd109-608";
		String PHONE="01034045608";
		String email="hd109608@naver.com";
		
		String regex1= "[a-z0-9-_]{5-20}";
		String regex2 ="^0\\d{1,3}-\\d{3,4}-\\d{4}";
		String regex3 = "[a-z0-9-_]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))";
		
	
	
		Pattern p = Pattern.compile(regex3);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
		
				
				//5에서 20문자의 영문 소문자와 숫자 특수기호 (-)(_)만 사용할수있다
		System.out.println("아이디 : ");
		 String a = sc.nextLine();
		 
		 String regex1 = "[a-z0-9_-]{5,20}";
		 
		 Pattern p =Pattern.compile(regex1);
		 Matcher m = p.matcher(a);
		 System.out.println(m.matches());
		 
		 System.out.println("전화번호 : ");
		 String b = s.nextLine();
		 
		 String regex11 = "^0\\d{1,3}-\\d{3,4}-\\d{4}";   // 역슬래시\는 2개(\\)를 써야 하나의 \가 됨
		 
		 Pattern pw = Pattern.compile(regex11);
		 Matcher e = pw.matcher(b);
		 System.out.println(e.matches());
		 
		 System.out.println("이메일 : ");
		 String c = s.nextLine();
		 
		 String regex2 = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))";
		 
		 Pattern em = Pattern.compile(regex2);
		 Matcher h = em.matcher(c);
		 System.out.println(h.matches());
	}

}
