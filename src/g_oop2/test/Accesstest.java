package g_oop2.test;

import g_oop2.AccessModifier;
						//상속을 받아준다
public class Accesstest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am= new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
	//	System.out.println(am.protectedVar);
	//	am.prtectedMethod 
		
		Accesstest at = new Accesstest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
	//	System.out.println(at.defaultVar);
	//	System.out.println(at.privateVar);  //상속을 받아도 다른패키지이기때문에  안댐
	}

}
