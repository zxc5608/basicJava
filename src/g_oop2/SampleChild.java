package g_oop2;
							//예약어 붙여주고
public class SampleChild extends SampleParent{
	
	void childMethod(){
	//상속 받은 메서드를 사용할수있따
		System.out.println(var);//상속받은변수
		System.out.println(method(7,13));//상속받은 메서드
		
	}

	//오버라이딩 상속받은 메서드의 내용을 재정의 하는 것
	
	//super 부모클래스의 변수와 자식클래스의 변수의 이름이같을때 구분         
	//super() 부모클래스의 생성자를 호출
	//다형성  객체의타입과 변수의 타입을 다르게사용해도 ㄱㄱㅊ? 부모자식관계여야 다르게사용가능
	
	//오버라이딩 :상속받은 메서드의 내용을 재정의하는것
	@Override  //어노테이션 :클래스 ,변수, 메서드 등에 표시해놓는것
	int method(int a,int b){//리턴타입 메서드명 파라미터 모두 같아야한다.
		return a*b;
	}
	
	//super,super()
	int var;
	
	void test(double var){
		System.out.println(var);//얘는 지역변수
		System.out.println(this.var);//인스턴스변수
		System.out.println(super.var);//부모클래스의 인스턴스변수
		//super: 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될떄 둘을 구분하기위해 사용한다.
		System.out.println(this.method(10,20));
		System.out.println(super.method(10, 20));
	}
	SampleChild(){
		super();//부모클래스 생성자 호출
		//super() 를 통해 부모클래스와 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다
		//super() 가없으면 컴파일러가 자동으로 super()을 넣어준다.
	}
	
	public static void main(String[] args) {
		SampleChild sc= new SampleChild();
		SampleParent sp= new SampleChild();
		//부모타입의 변수로 자식타입의 객체를 시용하는 것이 다형성이다.
		
		//부모와 자식간에는 서로 형변환이 가능하다
		sc=(SampleChild)sp;
		sp=(SampleChild)sc;
		
		//자식타입->부모타입 형변환은 생략 할 수 있다.
		
		SampleChild sc2 = (SampleChild) new SampleParent();
		//SampleParent는 2개의 멤버를 가지고있다.
		//sampleChild는 5개의 멤버를 가지고잇따
		// SampleChild 타입의 변수는 5개의 멤버를 사용할수 있어야하는데
		//SampleParent객체는 2개의 멤버만 가지고있다
		// 그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다.
		
		//SampleParent타입의 변수로는 Samplechild객체를 가지고도 2개의 멤버만 사용할수있다.
		SampleParent sp3= new SampleChild();
		System.out.println(sp3.var);
		System.out.println(sp3.method(10,20));
		//sp3.childMethod();//사용불가
		//sp3.test();//사용불가
	}
	
}
