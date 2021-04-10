package E_oop;

public class UesrDefinedDataType {

	public static void main(String[] args) {
		
		/*
		 * 사용자정의 데이터 타입
		 * - 데이터의 최종진화 형태이다(변수 > 배열> 클래스)
		 * - 서로다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할수 있다.
		 * 
		 */
		
		//변수(1개의 변수에는 1개의 데이터만 저장)
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열(같은타입의 데이터를 여러개저장)
		int[] score;
		int sum2;
		double avg2;
		String name2;
	
		Student student;
		//변수 선언   스튜던트라는 타입을 가지고있다 참조형타입
		student =new Student();
		//초기화 시켜주려면 객체생성 (인스턴스화)
		
	 student.kor = 80;
	 student.eng = 90;
	 student.math=60;
	 student.sum= student.kor+student.eng+ student.math;
	 student.avg= student.sum/3.0;
	 student.name ="홍길동";
	 
	  System.out.println(student.name);
	  System.out.println(student.avg);
	  System.out.println(student.sum);
	
	}

}

class Student{
	int kor;
	int eng;
	int math;       // 이 내용을 메모리에 넣어놓는다. 
	int sum;
	double avg;
	String name;
	
}


