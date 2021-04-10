package E_oop;

public class Static {
	
	/*
	 * static을 붙이면 프로그램 실행시 메모리에 올라간다
	 * 객체생성을 하지 않아도 사용할수있다
	 * static을 붙인 변수는 객체간에 변수의 값을 공유한다
	 * static이 붙은 멤버의 명칭: 클래스 변수, 클래스메서드
	 * static이 붙지 않은  멤버의 명칭 : 인스턴스 변수 ,인스턴스메서드
	 * 
	 */
	//값을 공유하기 위해 static을 붙인다.
	static int var;

	public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();

		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000);
		
		//////////////////////////////////////////////////////
		
		System.out.println("문자열입력>");
		String str=ScanUtil.nextLine();  //스캔 입력 
		System.out.println(str);
		
		System.out.println("숫자입력:");
		int num=ScanUtil.nextInt();
		System.out.println(num);
		
		
		
		
		
		
		
		
	}

}

	class Human{
		
		int account;
		
		void saveMoney(int money){
			account += money;
			System.out.println("통장잔고 :"+account);
		}
		
		static int dateAccount;   //값이 공유되서  합쳐졌따
	
		void saveDateMoney(int money){
			dateAccount+=money;
			System.out.println("데이트 통장잔고:"+dateAccount);
		}
	
	}
