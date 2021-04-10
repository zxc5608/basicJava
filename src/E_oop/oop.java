package E_oop;

public class oop {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 (Object Oriented programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 쉽다
		 * 
		 */
		//샘플클래스 타입의 변수를 만들어준다
		SampleClass sc = new SampleClass();// 객체를 생선한것
		
		System.out.println(sc.field);
		
		sc.method1();  //메서드 1번호출

		String returnValue = sc.method2(5);  //스트링으로 입력값을받아준다. 스트링타입의 결과물
		
		System.out.println(returnValue);
		//1
		System.out.println(sc.method2(10));
		//2
		
		
		sc.flowTest1(); //하면 호출이된다
		
		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
		//객체가 저장된변수를 통해 메서드를 호출해주세요
		// 파라미터가 있는 메서드는 타입에 맞게 갑을 넘겨주시고
		// 리턴타입이 있는 메서드는 리턴받은 값을 출력해주세여
		ClassMaker s = new ClassMaker();
		
		s.method3();
		System.out.println(s.method4());// 리턴타입있으면 출력
		s.method5("aa");				//파라미터 타입 있으면 이렇게
		System.out.println(s.method6(2,3)); 
				
	
		
		Calculator c = new Calculator();
		
		double a = c.plus(123456,654321);
		System.out.println(a);
		
		a = c.gop(a,123456);
		System.out.println(a);
		
		a = c.na(a,123456);
		System.out.println(a);
		
		a = c.mius(a,654321);
		System.out.println(a);
		
		a =c.nn(a,123456);
		System.out.println(a);
		
		
		
		
	/*
	 * 식당 예제와 같은 어떤 대상을 잡아 클래스를 구성해주세요
	 * 사장님과 알바의 관계같은 명령을 주고 받는 관계가 있는 대상이 적합합니다
	 * 메서드의 내용은 구체적이지 않아도 괜찮습니다.
	 * 파라미터와 리턴타입 위주로 만들어주세요
	 * 클래스에 메서드를 만들어보면서 파라미터와 리턴타입을 생각해보는것이 중요합니다
	 * 만들어진 클래스를 main메서드에서 사용해주세요	
	 */
	
		
		
	}

	}



