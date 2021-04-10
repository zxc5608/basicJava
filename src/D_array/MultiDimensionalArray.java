package D_array;


import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * -배열안에 배열이 저장되어있는 형태이다.
		 * 
		 */
		//2차원배열
		int[][] array2;
		
		//3차원 
		int[][][] array3;
		
		int [][] arr= new int[2][3];// 2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생선된다.
		int arr2[][]=new int[][]{{1,2,3},{4,5,6}};// 값의 개수로 배열의 길이가 정해진다. 
		int[]arr3[]={{1,2,3}
		 			,{4,5,6}
		 			,{7,8,9}};//선언과 초기화를 동시에 해야한다.
		
		int[][]arr4=new int[3][]; //가변배열2차원 값이 안써져있어서
		arr4[0]=new int[3];  //초기화를 해줘야 쓸수있음
		arr4[1]=new int[4];
		arr4[2]=new int[10];
		
		//2차원 인덱스까지 접근하여 사용할수있다.
		System.out.println(arr[0][1]);
		
		//arr[0]=10;//값을저잘할수없다.
		arr[0]= new int[5];  //배열을 저장해야한다.
		arr[0][0]=10;//2차원에 값을 저장할수있다.
		arr[0][1]=20;
		arr[1][0]=100;
	
		System.out.println(arr.length);//1차원 배열의 길이
		System.out.println(arr[0].length);//2차원 배열의길이
		
		for(int i=0;i<arr.length;i++){       //1차원접근	
			for(int j=0;j<arr[i].length;j
					++){		//2차원접근
				System.out.println("arr["+i+"]["+j+"]"+arr[i][j]);
			}
		}
		

		int[][]scores =new int[3][5];   //int [학생수][과목수]
		int[] sum= new int[scores.length];//합계
		double[]avg =new double[scores.length];//평균
		
		
		for(int i=0; i<scores.length;i++){
			for(int j=0; j<scores[i].length;j++){
				scores[i][j]= (int)(Math.random()*101);
			
				sum[i]+=scores[i][j]; //i고정 j만돌아
			
			}
									//?
			avg[i]= (double)sum[i]/scores[i].length;
			System.out.println(Arrays.toString(scores[i]));
		}
		System.out.println("평균는 "+ Arrays.toString(avg));
		System.out.println("합계는 "+ Arrays.toString(sum));
		}

			
		
		
		
		

		
		
		
		
		
		
		
		
		
	  }
		
	


