package g_oop2;

public class Accesstest {

	public static void main(String[] args) {
		AccessModifier am= new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		//접근제한이없기떄문에 다접근가능
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		//같은패키지인경우 접근가능 
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		//같은패키지안이라
		
	//	System.out.println(am.prvateVar);
	//	am.privateVar;
		//같은클래스안에서만 가능이라 컴파일  에러가뜸 
		

	}

}
