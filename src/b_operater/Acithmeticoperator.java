package b_operater;

public class Acithmeticoperator {

	public static void main(String[] args) {
		/*
		 *  산술연산자
		 * -사칙연산 +, -, *,/, %(나머지)
		 * -복합연산자 : +=, -= ,*= ,/=, %=
		 * -증감연산자 : ++ , -- 
		 */

		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		// 곱하기와 나누기가 더하기빼기보다 우선순위가 높다. 
		
		// 나머지연산
		result = 10% 4;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개 연산을 수행후 출력해주세요
//		int a = 3+1;
//		System.out.println(a);
//		
//		int b = 99-12;
//		System.out.println(b);
//		
//		int c = 4*4;
//		System.out.println(c);
//	
//		int d =20/2;
//		System.out.println(d);
//		
//		int e = 15%4;
//		System.out.println(e);		
//		
		
		//복합연산자
		// 변수에 저장되어있는 값이 연산을 수행할 연산자와 대입연산자를 결합해 사용할수있다.
		result =result +3;
		System.out.println(result);

		result +=3;
		System.out.println(result);
		
		result -=5;
		System.out.println(result);
		
		result *=2;
		System.out.println(result);
		
		// 아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요
		//result = result +10;
		result +=10;
		
		// result = result -2 * 3;
		result-=2 * 3;
		
		//result =result %5;
		result %=5;
		
		
		//증감연산자
		//증감연산자 (++) :변수의 값을 1증가시킨다
		//증감연산자 (--) :변수의 값을 1감소시킨다
		
		int i =0;
		++i; //전위형 : 변수의 값을 읽어오기전에 1증가된다
		i++; //후위형 : 변수의 값을 읽어온 후에 1증가된다
		
		--i;
		i--;
		
		i=0;
		System.out.println("++i="+ ++i);		
		i=0;
		System.out.println("i++="+ i++);
		System.out.println(i);	
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		
		int _int =10;
		double _double =3.14;
		double result2 = (double)_int+ _double; //  표현범위가 더 큰타입으로 형변환한다
		               //타입을 맞춰야만 가능한데 
		System.out.println(result2);
		
		 // 표현범위가 작은(int)쪽에서 큰쪽(long)으로 형변환은 생략가능하다.
		
		byte _byte =5;
		short _short =10;
		int result3 = (int)_byte+(int)_short;//int보다 작은 타입은 int로 형변환을 한다
		System.out.println(result3);
		//byte (1) short (2) 인데  
		
		
		
		//오버플로우 언더플로우
		// 표현범위를 벗어나는 값을 표현할때 발생하는 현상
		byte b= 127;
		b++;          //128은 byte가 표현못함  128을 표현못해서 -128 제일뒤로 간다
		System.out.println(b);//오버플로우
		b--;          //-128에서 1만큼 감소시켯지만 -129가 될수없기때문에 127이 출력
		System.out.println(b);// 언더플로우
		
		//타입을 선택할때는 연산의 범위를 고려해야한다.
		
		//연습문제//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		//1. 123456+654321
		//2. 1번의 결과값 *123456
		//3. 2번의 결과값 /123456
		//4. 3번의 결과값 -654321
		//5. 4번의 결과값 %123456
		
		double aa =123456+654321;
		System.out.println(aa);
		aa= aa*123456;
		System.out.println(aa);
		aa/=123456;
		System.out.println(aa);
		aa-=654321;
		System.out.println(aa);
		aa%=123456;
		System.out.println(aa);
		
		// 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
		int ee=3;
		int ww=4;
		int qq=4;
		
		int sum = ee+ww+qq;
		double avg = sum/3.0;
		
		System.out.println("합계:"+sum+"평균"+avg);
		
		//반올림
//		avg =Math.round(avg);
//		System.out.println(avg);
//		
		//소숫점 첫째자리 반올림 하려면 
		avg =Math.round(avg*10)/10.0;
		System.out.println(avg);
		
		//랜덤
		System.out.println((int)(Math.random()*100)+1);
		//Math.random(): 0.0~1.0미만	
		
		
		
	}

}
