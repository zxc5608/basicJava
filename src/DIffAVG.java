
public class DIffAVG {

	public static void main(String[] args) {
		int[]arr =new int[]{36,21,11,6,4};
		
		//arr변수에 담긴 값들의 간격평균구하기
		//36-21=15
		//21-11=10
		//11-6=5
		//6-4=2
		// (15+10+5+2)/4=8
		int sum=0;
		for(int i=1;i<arr.length;i++){
			int num = arr[i-1] - arr[i];
				sum +=num;
		
		}		
	
		double avg= sum/arr.length+2;
		System.out.println(avg);
		}
	
		
	}
			

	


