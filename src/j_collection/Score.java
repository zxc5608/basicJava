package j_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListScore {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		ArrayList<String> students = new ArrayList<>();
		ArrayList<String> subjects = new ArrayList<>();
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> ranks = new ArrayList<>();
		
		students.add("김건호");
		students.add("김선중");
		students.add("이수훈");
		students.add("오제현");
		students.add("박소영");
		students.add("유동기");
		students.add("김수연");
		students.add("이수정");
		students.add("유승종");
		students.add("김도영");
		students.add("전영헌");
		students.add("김준혁");
		students.add("이건영");
		students.add("송하섭");
		students.add("이예슬");
		students.add("백수진");
		students.add("이연승");
		students.add("최동준");
		students.add("김강영");
		students.add("김우성");
		students.add("황시연");
		students.add("김경찬");
		students.add("김보연");
		students.add("김형석");
		students.add("안용현");
		
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		//점수 랜덤 발생
		for(int i = 0; i < students.size(); i++){
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++){
				score.add((int)(Math.random() * 101));
			}
			scores.add(score);
		}
		
		//합계 평균
		for(int i = 0; i < students.size(); i++){
			int sum = 0;
			for(int j = 0; j < subjects.size(); j++){
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / subjects.size() * 100) / 100.0);
		}
		
		//석차
		for(int i = 0; i < students.size(); i++){
			ranks.add(1);
			for(int j = 0; j < students.size(); j++){
				if(sums.get(i) < sums.get(j)){
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		//정렬
		for(int i = 0; i < scores.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < scores.size(); j++){
				if(ranks.get(j) < ranks.get(min)){
					min = j;
				}
			}
			
			String student = students.get(i);
			students.set(i,	students.get(min));
			students.set(min, student);
			
			ArrayList<Integer> score = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, score);
			
			int sum = sums.get(i);
			sums.set(i,	sums.get(min));
			sums.set(min, sum);
			
			double avg = avgs.get(i);
			avgs.set(i,	avgs.get(min));
			avgs.set(min, avg);
			
			int rank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, rank);
		}
		
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < students.size(); i++){
			System.out.print(students.get(i) + "\t");
			for(int j = 0; j < subjects.size(); j++){
				System.out.print(scores.get(i).get(j) + "\t");
			}
			System.out.print(sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
			System.out.println();
		}
		
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		
		for(int i = 0; i < subjects.size(); i++){
			int sum = 0;
			for(int j = 0; j < students.size(); j++){
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		System.out.print("과목합계\t");
		for(int i = 0; i < subjects.size(); i++){
			System.out.print(subSums.get(i) + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for(int i = 0; i < subjects.size(); i++){
			System.out.print(subAvgs.get(i) + "\t");
		}
		
	}

}









