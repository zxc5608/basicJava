
package D_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기: 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 
		 * 선택정렬:가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 
		 * 버블정렬: 바로 뒤의 숫자와 비교해서 큰수를 뒤로 보내는 방식
		 * 
		 * 삽입정렬: 두번쨰 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
	
	
		// 10 개의 배열에 랜덤값 1~100까지 넣아라
		int[]arr= new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] =(int)(Math.random()*100)+1;
			
		}
	
	    //
		System.out.println(Arrays.toString(arr));
	
	
	    //[25, 98, 42, 62, 70, 49, 34, 98, 7, 79]
	

	    // printRank(arr);// 석차구하기  //여러줄의 코드를 묶어놓은것이 메서드
	     //selectSort(arr);//선택정렬
		 //bubbleSort(arr); //버블정렬
 		 insertSort(arr);// 삽입정렬 
	    //Arrays.sort(arr);                      //arrays sort메서드를 써주면 정렬이된다
	    //System.out.println(Arrays.toString(arr));
	    
	//ctrl +1
	
	
	
	
	                              //위에게 넘어온거다
	}
private static void insertSort(int[] arr) {
		//2번째 숫자 보관  
	for(int i=1; i<arr.length;i++){
		int temp= arr[i];//삽입정렬은 2번째 인덱스의 값과 비교를 하는 방식이라 임시보관을 해야한다
		int j=0; // for문에 j방을 만들어줘도 되지만 밑에 나온 식은 루프를빠져나와있어 루프밖에서 값을만들어준다
		for(j= i-1; j>=0;j--){
			if(temp<arr[j]){
				arr[j+1] = arr[j]; 
						
			}else{
				break;
			}
		
			}arr[j+1] =temp;
		
		}System.out.println(Arrays.toString(arr));
	}
		
	
private static void bubbleSort(int[] arr) {
	/* 버블정렬 2개씩 성립되면 바꾸고 안되면 안바꾸고
	 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9
	 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  
	 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  
	 * 0,1  1,2  2,3  3,4  4,5  5,6  
	 * 0,1  1,2  2,3  3,4  4,5  
	 * 0,1  1,2  2,3  3,4  
	 * 0,1  1,2  2,3 
	 * 0,1  1,2
	 * 0,1 
	 */
							//한번 덜돌게 만들어
	for(int i= 0; i<arr.length-1;i++){ //for 문이도는횟수 9번만돌면되니까 -1
		boolean change =false;//			//도는횟수를 줄어들게하기위해  
		for(int j=0;j<arr.length-1-i;j++){
			
			if(arr[j]>arr[j+1]){  //j가 큰경우 자리를바꾼다

				int tem = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]= tem;
				change= true;
				
			}
		}if(!change){//바뀌지 않은경우에 브레이크를 하겠다  //(change== false)
			
			break;
			
		}System.out.println(Arrays.toString(arr));
		
	}System.out.println(Arrays.toString(arr));
}

private static void selectSort(int[] arr) {
		
		//선택정렬 최솟값을 찾아 첫번째로 옮겨준다.
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				//최소값을 찾아준다.
				if (arr[j] < arr[min]) {  
					min = j;    
					
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}





//석차구하기                                                             
	private static void printRank(int[] arr) {
		int[] rank = new int[arr.length];
//석차를 저장할 배열의 모든 인덱스를 1로 초기화한다
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
// 점수를 비교해 작은 점수의 석차를 증가시킨다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					rank[i]++;

				}
			}

		}
		System.out.println(Arrays.toString(rank));
	
	
	}	
	
	
		
		
	}


