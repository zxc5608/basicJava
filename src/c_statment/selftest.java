package c_statment;

import java.util.Scanner;

public class selftest {

	public static void main(String[] args) {
		// 탄수화물 중독 자가진단테스트 네이버에서 보고 프로그램을 만들어라
		
		Scanner sc = new Scanner(System.in);

		int a = 0;

		System.out.println("아침을 배불리 먹은 후 점심시간전에 배가 고프다");
		String aaa = sc.nextLine();
		if (aaa.equals("o"))
			a++;

		System.out.println("밥 빵 과자 등 음식을 먹기 시작하면 끝이없다.");
		String aaa1 = sc.nextLine();
		if (aaa1.equals("o"))
			a++;

		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다");
		String aaa2 = sc.nextLine();
		if (aaa2.equals("o"))
			a++;

		System.out.println("정말 배고프지 않더라도 먹을때가 있다");
		String aaa3 = sc.nextLine();
		if (aaa3.equals("o"))
			a++;

		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지않는다");
		String aaa4 = sc.nextLine();
		if (aaa4.equals("o"))
			a++;

		System.out.println("스트레스를 받으면 자꾸먹고싶어진다");
		String aaa5 = sc.nextLine();
		if (aaa5.equals("o"))
			a++;

		System.out.println("책상이나 식탁 위에 항상 과자 초콜릿 등이 놓여있다");
		String aaa6 = sc.nextLine();
		if (aaa6.equals("o"))
			a++;

		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안잡힌다");
		String aaa7 = sc.nextLine();
		if (aaa7.equals("o"))
			a++;
		
		System.out.println("과자 , 초콜릿 등 단 음식은 상상만해도 먹고싶어진다");
		String aaa8 = sc.nextLine();
		if (aaa8.equals("o"))
			a++;

		System.out.println("다이어트를 위해 식이 조절을 하는데 3일도 못간다.");
		String aaa9 = sc.nextLine();
		if (aaa9.equals("o"))
			a++;
		System.out.println(a+"개");
		
		if (a > 7) {
			System.out.println("중독");
		} else if (a >= 4 && a <= 6) {
			System.out.println("위험");
		} else if (a < 4) {
			System.out.println("주의");
		}
		
		
		
		
		
	
	}

}
		