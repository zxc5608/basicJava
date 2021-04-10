package D_array;

import java.util.Arrays;


public class array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * 
		 * - 여러개 의 값을 하나의 변수에 저장해서 사용하는 것이다
		 * - 참조형 타입이다.               같은 타입만 
		 * - 인덱스값을 구분한다    a[2]         주소를 변수에 저장   
		 * - 길이를 변경할수없다.
		 *   
		 *   왜 변경할수없냐  메모리에저장할떄 사용되는 부분과 사용되지않는부분을 열개가 비어있는곳에
		 *   넣기때문에   
		 *   
		 */ 

		int [] array;  // 배열의 주소룰 저장할 공간이 만들어진다  참조형타입은 4byte 크기로 만들어진다
		array = new int[5];// 배열이 생성되고 그 주소가 저장된다.
		//배열 초기화시 기본값이 저장된다.
		//boolean : false
		//char = '' 
		//참조형 타입(배열,String): null     기본값
		
		
		array=new int[]{1,2,3,4,5}; //중괄호를 열고 실제저장하고싶은 값 
		
		//array ={1, 2, 3, 4, 5};
		//선언과 초기화를 같이해줘야한다
		int[] array2={1,2,3,4,5};
		
		System.out.println(array[0]);  // 0번인덱스를 출력해라
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//지정되어있는 배열의 합계를 구하여라
		array[0]= 10;
		array[1]= 20;
		array[2]= 30;
		array[3]= 40;
		array[4]= 50;
		
		int sum =0;
		for(int i = 0; i < array.length; i++){
		sum +=array[i];           //length 배열의 길이를 저장하고 있는변수 
			System.out.println(sum);
		}
		System.out.println("합계:"+sum);
		
		
		//자동완성 : ctrl + spacebar
		//한줄복사 : ctrl +alt+ 방향키
		//한줄이동 : alt +방향키
		//한줄삭제 : ctrl + D
		
		//1. 10개의 정수를 저장할수있는 배열을 선언 및 초기화 해주세요
		int[] a = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		
		for(int i=0;i<a.length;i++){
		a[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(a);
		
		
		//배열에 저장된 모든값의 합계와 평균을 구해주세요
		sum =0;
		
		for(int i = 0; i < a.length; i++){
			sum +=a[i];           
			System.out.println(sum);
			
		}							//배열의길이
		double avg =(double)sum/a.length;
		System.out.println("합계:"+sum+"평균:"+avg);
		
		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int min= a[0];
		int max= a[0];
		
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
			if(max<a[i]){
				max=a[i];
			}
			
		}
		System.out.println("최대값"+max+"최소값"+min);
		
	
		
		
		int[] shuffle = new int[10];
		for(int i =0;i<shuffle.length;i++){
			shuffle[i]=i + 1;
			
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 배열의 값을 섞어주세요 
		//랜덤한 인덱스를 발생시킨다
		// 0번의 인덱스와 랜덤인덱스의 값을 교환한다
		//위 내용을 반복한다.
		for(int i =0; i<shuffle.length;i++){        
		int random = (int)(Math.random()*shuffle.length);
			int r= shuffle[0];             //위에반복문
			shuffle[0]= shuffle[random];   //랜덤값을 섞기위해 r방을만들어주고 따로저장해돔
			shuffle[random]= r;
		 }System.out.println(Arrays.toString(shuffle));
		
			
		
		 
		//1~10사이의 랜덤값을 500번 생성하고 , 각 숫자가 생성된 횟수를 출력해주세요
		 int[] count =new int[10];  //배열을 만들어줘라 인덱스에 들어간 랜덤값을 넣어주면 규칙이생성된다
		 	//
		 
		for(int i=0;i<500;i++){
			int ran= (int)(Math.random()*10)+1; //
			
				count[ran-1]++;  
			}
			System.out.println(Arrays.toString(count));
			          // 배열안에있는것을 표시해라
			
			//오늘의 과제는 복습  
		}
		
					
			
		
	
	
	
	
	
	}
	

	
	
	

