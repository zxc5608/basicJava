package h_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionhandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러: 컴파일 시에 발생되는 에러 (빨간줄_)
		 * - 논리적에러 : 실행은되지만, 의도와는 다르게 동작하는것(버그)
		 * - 런타임 에러: 실행 시에 발생되는 에러
		 * 
		 * 
		 * 런타임에러
		 * -런타임에러 발생시 위치에서 프로그램이 비정상적으로 종료된다
		 * -에러 : 프로그램 코드에 의해 수습될 수없는 심각한 오류(처리불가)
		 * -예외  : 프로그램 코드에ㅔ 의해서 수습될수있는 다소 미약한 오류(처리 가능)
		 * 
		 * 예외
		 * -모든 예외는 Exception클래스의 자식클래스이다
		 * -RuntimeException 클래스와 그 자식들은 예외 처리가 강제되지 않는다
		 * -(RuntimeException클래스와 그 자식들을 제외한 Exception) 클래스의 자식들은
		 * 예외처리가 강제된다
		 * 
		 * 예외처리 (try-catch)
		 * 예외 처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할수있다
		 * try{}catch(Exception e){}
		 * try 블럭안의 내용을 실행중 예외가 발생하면 catch로 넘어간다
		 * catch의 ()안에는 처리할 예외를 지정해줄수 있다
		 * 여러 종류의 예외를 처리할수 있도록 catch는 하나이상 올수있다
		 * 발생한 예외와 일치하는 catch블럭안의 내용ㅇ이 수행된후 try -catch를 빠져나간다
		 * 발생한 예외와 일치하는catch가 없을경우 예외는 처리되지않는다
		 */
		
		//예외가 발생할만한 코드작성
		
		try{
		
			
		int result = 10 / 0;                    //아무것도 실행되지 않는다  왜냐면 36번 라인에서 예외가 발생되서 코드가실행되지 않고 캐치로 넘어온다 
		System.out.println(result);   //↓인덱스가 범위를 벗어났다
		
		
		}catch(ArithmeticException | IndexOutOfBoundsException e){
			   //↑예외의 객체가생성된다 ☆여기서는 콤마말고 |를 사용한다  위 변수는 둘중에 하나가 타입이된다.
			e.printStackTrace();  //예외메시지를 출력한다
			 
			  //↓ 널을 참조했다. 
	    }catch(NullPointerException e){	//& 캐치를 추가하는 방법
			String str =null;
			System.out.println(str.length()); //널안에서 랭스를 호출하고있는데 널은 랭스가 없다
		
	    }catch(Exception e){       //Exception은 모든 예외의 부모클래스 
	    	
	    }
		
		test1();         //예외 메시지를 읽고 예외가 어느위치에 발생됬는지 찾아라
		
		/*
		 * JVM 
		 * - Method Area
		 * - Call Stack :현재 호출되어있는 메서드
		 * - Heap
		 */
	}

	private static void test1() {
		test2();		
	}

	private static void test2() {
//		System.out.println(10/0);
		
		try {
			new FileInputStream("");   //자동완성으로만들면 임포트가 자동으로된다
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
