package D_array;

import java.util.Arrays;


public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어,수학, 사회,과학, Oracle,java점수를
		 * 0~100까지 랜덤으로 생성하고 ㄹ아래와 같이 출력해주세요
		 *		국어		영어		수학		사회		과학		oracle		Java		합계		평균		석차
		 *홍길동 	90		90		90		90		90		90			90			630		90.00	1	
		 *홍길동	90		90		90		90		90		90			90			630		90.00	1
		 *홍길동	90		90		90		90		90		90			90			630		90.00	1
		 *홍길동	90		90		90		90		90		90			90			630		90.00	1
		 *홍길동  90		90		90		90		90		90			90			630		90.00	1
		 *과목합	450		450		450		450		450		450			450			
		 *과목평균90.00	90.00	90.00	90.00	90.00	90.00		90.00	
		 */
		String[] names = {"김건호", "김선중", "이수훈", "오제현", "박소영"
				, "유동기", "김수연", "이수정", "유승종", "김도영"
				, "전영헌", "김준혁", "이건영", "송하섭", "이예슬"
				, "백수진", "이연승", "최동준", "김강영", "김우성"
				, "황시연", "김경찬", "김보연", "김형석", "안용현"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};


	int[][] score = new int[names.length][subjects.length];
	int [] namesum = new int[score.length];
	float [] nameavg= new float[score.length];
	int[] subsum= new int[subjects.length];
	float[] subavg=new float[subjects.length];
	int[] rank=new int[score.length];
//랜덤값을 넣어준다
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				score[i][j]=(int)(Math.random()*101);
			}
		}
//합계를 구해준다
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				namesum[i] += score[i][j];           
				
			}
		}
	
//평균을 구해주면서 과목의 배열로 나누어주고 소수점 2번째 자리까지 반올림해준다
		for(int i = 0;i<score.length;i++){
			nameavg[i]=Math.round(namesum[i]/subjects.length*100)/100f;
		}
//두번쨰 가로 합계를 내준다
		for(int i=0;i<score[i].length;i++){
			for(int j=0;j<score.length;j++){
				subsum[i]+=score[j][i];
			}
		}
		
//두번째 평균을 구해주고 과목수만큼 나눠주고 2번째 반올림
		for(int i=0;i<subjects.length;i++){
		subavg[i]=Math.round(subsum[i]/score.length*100)/100f;
				
			}
		
//석차 랭크 구해주고
		for(int i=0;i<score.length;i++){
			rank[i]=1;
			for(int j =0;j<score.length;j++){
				if(namesum[i]>namesum[j])
				rank[i]++;
			}
		}
	
		//버블정렬
for(int i=0;i<score.length;i++){
	int min=i;
for(int j=0;j<namesum.length;j++){
	if(namesum[i]>namesum[j]){
		min=j;
	}
	}
int[] temp = score[i];
score[i] = score[min];
score[min] = temp;

int temp2 = namesum[i];
namesum[i] = namesum[min];
namesum[min] = temp2;

float temp3 = nameavg[i];
nameavg[i] = nameavg[min];
nameavg[min] = temp3;

int temp4 = rank[i];
rank[i] = rank[min];
rank[min] = temp4;

String temp5 = names[i];
names[i] = names[min];
names[min] = temp5;


}

	System.out.print("\t" + subjects[i]);
}
	System.out.println("\t합계\t평균\t석차");
	for(int i=0;i<score.length;i++){
		System.out.print(names[i]+"\t");
		for(int j=0;j<score[i].length;j++){
			System.out.print(score[i][j]+"\t");
		}
	System.out.println(namesum[i]+"\t"+nameavg[i]+"\t"+rank[i]+"\t");
	}
			
//과목을 써준다 순차적으로
System.out.print("과목합계\t");
	for(int i=0;i<subsum.length;i++){
		System.out.print(subsum[i]+"\t");
	}
	System.out.println();
	System.out.print("과목평균\t");
	for(int i=0;i<subavg.length;i++){
		System.out.print(subavg[i]+"\t");
	}
	}
}