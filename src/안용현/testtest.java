package 안용현;

import java.util.Arrays;

public class testtest {
	public static void main(String[] args) {
	
		//1. 10개의 정수를 저장할수있는 배열을 선언 및 초기화 해주세요
		int[] array= new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		for(int i=0;i<array.length;i++){
		array[i] = (int)(Math.random()*100)+1;
		}System.out.println(array);
			
		int sum =0;
			
			for(int i = 0; i < array.length; i++){
				sum +=array[i];           
				
				
			}		System.out.println(sum);
		
		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int min =array[0];
		int max =array[0];
		
		for(int i=0;i<array.length;i++){
			if(min>array[i]){
				min=array[i];
			}
			if (max<array[i]){
				max= array[i];
			}
			System.out.println("최대값"+max+"최소값"+min);
		}
				
		
		
				
				
				
				
				
		int[] shuffle = new int[10];
		for(int i =0;i<shuffle.length;i++){
			shuffle[i]=i + 1;
			
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 배열의 값을 섞어주세요 
		//랜덤한 인덱스를 발생시킨다
		// 0번의 인덱스와 랜덤인덱스의 값을 교환한다
		//위 내용을 반복한다.
		
		//1~10사이의 랜덤값을 500번 생성하고 , 각 숫자가 생성된 횟수를 출력해주세요
		int[] count =new int[10];
		for(int i= 0; i<500;i++){
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		 count[random-1]++;
		}System.out.println(Arrays.toString(count));
		
		
	}

}
