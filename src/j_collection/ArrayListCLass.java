package j_collection;

import java.util.ArrayList;
import java.util.Random;

import D_array.array;

public class ArrayListCLass {

	public static void main(String[] args) {
		/*
		 * boolean add(Object obj):마지막 위치에 객체를 추가후 성공여부를 반환한다
		 * void add(int index, Object obj): 지정된 위치에 객체를 추가한다
		 * Object set(int index ,Object obj):지정된 위치에 객체를 저장후 기존객체를 반환한다
		 * Object get (int, index):지정된 위치에 객체를 반환한다
		 * int size():저장된 객체의 수를 반환한다
		 * boolean remove(int index):지정된 위치의 객체를 제거한다.
		 * 

		 */
		
		ArrayList sample =new ArrayList();//뭐든지저장가능  하지만 값을 꺼낼때가 문제 어떤타입인지알수가없다/
		
		sample.add("abc");
		sample.add(100);
		sample.add(new ArrayList());  
		
		//타입을지정해서
		//제네릭을 지정하지 않으면 넣을떄는 편하나 꺼낼때는 타입을 예측하기 힘들다
		//따라서 제네릭의 사용이 권장된다
		ArrayList<Integer>list =new ArrayList<>();
	
		list.add(10);
//		list.add("abc");//저장하면안되는거라 컴파일에러
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);  //저장된값 출력
		
		list.add(1, 40); //1번 인덱스로부터 뒤로 밀고 값을 저장한다.
		System.out.println(list);
		
		 
		Integer before = list.set(2, 50);//2번 인덱스에 값을 저장하고 기존값을 반환한다.
		System.out.println("before:"+before);
		System.out.println("after"+list.get(2));
		System.out.println(list);
		
		Integer integer =list.get(2);//배열에서는list[2]
		System.out.println(integer);
		
		//지우는거
		
		
//		for(int i=0;i<list.size();i++){//포문을 뒤로돌려야 값을 제거할수있다.
//			System.out.println(i+":"+list.get(i));
//			list.remove(i);
//		}
//		System.out.println(list);
//		
		
		//값을 제거할떄는 뒤에서부터 제거해야한다
		for(int i=list.size()-1;0<=i;i--){
			System.out.println(i+":"+list.get(i));
			list.remove(i);
		}
		System.out.println(list);
	
		//list[0][0][0] list.get(0).get(0).get(0)
	
		//list에 1부터 100까지 10개 저장해주세요.
	
		
		
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100)+1);
			
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요
		int sum =0;
		double avg= 0;
		
		for(int i=0;i<list.size();i++){
			sum+=list.get(i);
			
		}
		avg = (double)sum / list.size();
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		//list에서 최소값과 최대값을 구해주세요
		
		int max = list.get(0);
		int min = list.get(0);
		for(int i= 0;i<list.size()-1;i++){
			if(list.get(i)<min){
				min =list.get(i);
			}
		if(max<list.get(i)){
			max=list.get(i);
		}
	}System.out.println("min"+min+"max"+max);
	
	//오름차순정렬
	
	for(int i=0;i<list.size()-1;i++){
		 min=i;
		for(int j=i+1;j<list.size();j++){
			if(list.get(min)>list.get(j)){
				min=j;
				}
			
		}
		int temp = list.get(i);
		list.set(i, list.get(min)); //list.set 을 사용해서 바꿔준다.
		list.set(min, temp);
		
		
	}System.out.println(list);
	
	//2차원 어레이리스트
	ArrayList<ArrayList<Integer>> list2=new ArrayList<>(); //어레이 리스트를 저장할수있는 어레이리스트가만들어졋다
	
	list= new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	
	list2.add(list);
	
	list= new ArrayList<>();
	list.add(40);
	list.add(50);
	
	list2.add(list);
	
	System.out.println(list2);
	
	for(int i=0;i<list2.size();i++){
		ArrayList<Integer>li =list2.get(i);
		for(int j =0;j<li.size();j++){
			System.out.println(li.get(j)+"\t");
			
		}System.out.println();
	}
	
	//하나만꺼내고싶을떄
	Integer integer2=list2.get(0).get(1);  //0번인덱스의 1번째
	System.out.println(integer2);
	
}
	
}
