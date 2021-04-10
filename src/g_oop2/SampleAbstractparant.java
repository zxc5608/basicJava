package g_oop2;

public abstract class SampleAbstractparant {
	
	void method(){
		
	}

	//추상 메서드: 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
	
	
}

class SampleAbstractchild extends SampleAbstractparant{
	//오버라이딩을 통해 상속받은 메서드를 변경한다
	@override
	void abstractMethod(){
		
	}
	
}
