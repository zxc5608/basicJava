package b_operater;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * -&&(AND) ,||(OR),!(NOT)
		 * 피연산자로 boolean 만 허용한다. 
		 */

		
		
		boolean b= 5 < 20 && 15 % 2 == 0 || 0 >= 5;
		// ||보다 &&의 우선순위가 높다. 
		// 비교연산과 논리연산이 같이있을떄 비교연산이 먼저 되고true false 를 먼저 얻은다음 
		// 둘중하나 트루  둘다 펄스여야됨  
		b=!(10<20); //조건식의 결과를 반대로 저장한다.
		System.out.println(b);
		
		// !는 숫자옆에 붙을수없다. 괄호를 쳐 논리 연산이 되었을댸
		
		
		// 효율적 연산 
		b= true && true;//true
		b= true && false;//false
		b=false && true;//false
		b= false && false;//false
		
		b= true || true;//true
		b= true || false;//true
		b=false || true;//true
		b= false || false;//false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다. 
		
		int a = 10;
		b= a < 5 && 0 <a++;          //음?
		System.out.println(a);
		
		//연습문제 
		
		//int 타입의 x y변수를 만들고 , 다음의 무장들을 코드로 작성해주세요
		int x= 1;
		int y= 2;
		
		//1. x가 y보다 크고 x가 10보다 작다
		System.out.println(x > y && x < 10);
		
		//2 x가 3의 배수이거나 , x가 5의 배수이다.
		System.out.println(x % 3 == 0 || x % 5 == 0);
	
	}

}
