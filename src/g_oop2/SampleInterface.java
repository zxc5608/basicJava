package g_oop2;

public interface SampleInterface {
//클래스아님 인터페이스로 연거임
	//추상메서드와 상수만가질수있다
	
	
	//인터페이의 모든 멤버변수는 public  static final 제어자를 사용해야한다
	public static final int NUM1= 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다
	int NUM2=2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해한다
	public abstract void method();
	
	//모든 메서드의 제어가자 같기떄문에 생략이 가능하다
	void method2();
}
	//오버라이딩해주			//요걸로 받아준다
class SampleImplement implements SampleInterface,SampleInterface2{
										//여러개를 상속받을수잇다
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	
}

interface SampleInterface2{
	void method1();
	void method3();
	
}