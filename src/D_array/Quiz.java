package D_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		
		//quiz1();//거스름돈의 동전개수 
		//quiz2();//그래프 그리기 
		//quiz3(); // 같은 숫자는 싫어
		quiz4();// 나누어떨어지는 숫자 배열
	
	}

	
	private static void quiz4() {
		int[] arr =new int[100];
		for(int i=0; i<arr.length;i++){
			arr[i]= (int)(Math.random()*100)+1;
			
		}System.out.println(Arrays.toString(arr));
		/*
		 *2~5사이의 랜덤한 수로나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요
		 *5
		 *[5,10,15,15,20,25]
		 *
		 */
			// 2~5사이 랜덤한  scanner
	
		//for문에서 스캐너에서 입력한 2의 배수3의 배수 ~~ 연결
		
		int count=0;
		int[] temp= new int[100];
		int n =(int)(Math.random()*4)+2;
		
		for(int i= 1;i<arr.length;i++){
			if(arr[i]%n==0){
				temp[count++] =arr[i];
			}
			
		}arr= new int [count];
		for(int i = 0; i<arr.length;i++){
			arr[i]=temp[i];
		}
		//정렬시키
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				//최소값을 찾아준다.
				if (arr[j] < arr[min]) {  
					min = j;    
					
				}
			}
			int temp1 = arr[i];
			arr[i] = arr[min];
			arr[min] = temp1;
		}
		System.out.println("n:"+n);
		System.out.println(Arrays.toString(arr));
	} 
		
	
		//배열을 만들어 안에다 저장 출력
		
		
		
			 
		 
		
		
		
		
		
		
		
		
		
		
	


	private static void quiz3() {

		int[]arr= new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]= (int)(Math.random()*5)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		//1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된값이 제거되는 배열을 만들어주세요
		//[1,3,2,1,4,5,5,1,3]
		//[1,3,2,4,5]
		
		//1~5사이 배열을 만들어주고
		int[] temp =new int[5];
		int count =0;
	    
		// 중복된 값을 찾아 준다
		for(int i=1; i<arr.length;i++){  //값 하나하나돈다
			
			boolean flag = false;
			                             // 블린 flag방 지정
			for(int j=0;j<temp.length;j++){
				if(arr[i]==temp[j]){    //arr[i]랑 temp가 같으면 다시올라가서 비교
										//다르면 if flag 가 아닌 곳을 지정해준곳으로 간다
					flag= true;
					}
			}//포문이 끝날을때 중복되지 않는경우에 플래그를 넣어야된다
			if(!flag){
				temp[count++]=arr[i];  
			}
		}	System.out.println(Arrays.toString(temp));
		//=========================================================
		int[] result = new int[count];
		for(int i =0;i<result.length;i++){
			result[i]=temp[i];
			
		}System.out.println(Arrays.toString(result));
	}

	




	private static void quiz2() {
		
		int[] arr= new int[20];
		for(int i=0; i<arr.length;i++){
			arr[i] =(int)(Math.random()*5)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요
		 * 
		 * 1:***3
		 * 2:****4
		 * 3:**2
		 * 4:*****5
		 * 5:*1
		 */
		//배열을만들어서                                1이 몇개 발생됬는지
		int[] count = new int[5];
		//카운트를 세주는 반복문 만들기 
		for(int i =0;i<arr.length;i++){
			count[arr[i]-1]++;
		
		}
		System.out.println(Arrays.toString(count));
		//세줘야함
		for(int i= 0; i<count.length;i++){
			System.out.print(i+":");
			for(int j= 0; j<count.length;j++){
				System.out.print("*");
				
			}System.out.println(""+count[i]);
		}
		
		
			
			
		
			
		}
			
				
		
	
		
		
		
		
		
	    
	      
		
		
		
	
	

	
	
	
	
	private static void quiz1() {
		int[] zz= new int[4]; 
		
		int money =(int)(Math.random()*500)*10;//0부터 4990 10을 곱햇기떄문에 10단위로나옴 
		int[] coin = {500,100,50,10};
		System.out.println("거스름돈"+money);
		System.out.println(Arrays.toString(coin));
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요
		 * 
		 * 거스름돈  2860원
		 * 500원 5개
		 * 100원 3개
		 * 50원 1개
		 * 10원 1개 
		 */
//		int count =money /coin[0];
//		System.out.println(coin[0]+"원"+count+"개");
//		money=money %coin[0];   //나머지를 구하는 함수
//		count = money /coin[1];
//		
		for(int i=0;i<coin.length;i++){
			int count = money/ coin[i];
			money= money % coin[i];   //나머지를 다음 동전에다 넘기는 역할
			System.out.println(coin[i]+"원은"+count+"개");
			   
		 }
		}
	}
