package e_ooResturant;

public class Washing {
	
	String[] order(){
		System.out.println("세탁기를 돌리시겠습니까");
		return new String[]{"세탁","탈수"};
		}
	
	void wash(String[] setac){
		System.out.println("세탁이 완료되었습니다");
		
	}
	void door(){
		System.out.println("문이 열렸습니다");
	}
	

}

