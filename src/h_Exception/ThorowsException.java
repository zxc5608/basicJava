package h_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThorowsException {
	
	public static void main(String[] args) {
		/*
		 * 메서드에 예외 선언하기
		 * - 메서드 호출시 발생할 수있는 예외를 선언해줄수 있다
		 * -void method () throws IOException{}
		 * -메서드의 구현부 끝에 throws예약어와 예외 클래스 명으로예외를 선언할수있다
		 * -예외를 선언하면 예외 처리를 하지 않고 자신을 호출된 메서드로 예외처리를 넘겨준다.
		 * 
		 */
		try {
			method();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 

		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
									//예외를 선언
	private static void method() throws IOException{
		
		throw new IOException();
		
	}

}
