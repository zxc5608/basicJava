package E_oop.score;

public class score {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];  //널 10개가들어있다
		
		for (int i = 0; i < students.length; i++) {
			Student student =new Student();  //객체생성하는것이 포문안에있어야된다
			
			student.name= "학생"+(i + 1);
			student.rank=1;
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math= (int)(Math.random()*101);
			
		
			
			students[i] = student;			//배열에 10개를 저장해야한다.
	    }
		
		
		//성적관리프로그램을 완성해주세요
		for(int i=0;i<students.length;i++){
			
			students[i].sum = students[i].kor+students[i].eng+ students[i].math;
			students[i].avg = (int)Math.round(students[i].sum/3.0*100)/100.0;

		}
		int[]sums=new int[3];
		for(int i=0;i<students.length;i++){
			sums[0]+= students[i].kor;
			sums[1]+= students[i].eng;
			sums[2]+= students[i].math;
			
		}
		
		double[] avgs=new double[sums.length];
		for(int i=0; i<avgs.length;i++){
			avgs[i]=(int)Math.round(sums[i]/(double)students.length*100)/100.0;

		}
		
		
		
	
		
			for(int i=0;i<students.length;i++){
				students[i].rank = 1;
				for(int j=0; j<students.length;j++){
					if(students[i].avg>students[j].avg){
						students[i].rank++;
					}
				}
			}
			for(int i=0; i<students.length-1;i++){
				int min =i;
				for(int j=i+1;j<students.length;j++){
					if(students[j].avg<students[min].avg){
						min= j;
				}
				
			}//스튜던트로 바꾸면 값전체가 바뀜
				Student temp= students[i];
				students[i]=students[min];
				students[min]=temp;
			
				
			}
				
		   System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		   
	
		   for(int i=0;i<students.length;i++){
		   System.out.print(students[i].name);
	
			System.out.println("\t"+students[i].kor
					+"\t"+students[i].eng+"\t"
					+students[i].math+"\t"
					+students[i].sum+"\t"
					+students[i].avg+"\t"
					+students[i].rank);
	}		   
		
		System.out.print("과목합계");
		for(int i=0;i<sums.length;i++){
			System.out.print("\t"+sums[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i=0;i<avgs.length;i++){
			System.out.print("\t"+avgs[i]);
		}
	}
	}



