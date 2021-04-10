package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	// 상단메뉴  소스에서 케팅앤드세팅ㅁ
	public int getHour() {  //get 변수의값을 세준다
		return hour;
	}
	public void setHour(int hour) {//set변수의 값을 저장
		if(hour<0){
			this.hour = 0;
		}else if(23<hour){
			this.hour=0;	
		}else{
			this.hour=hour;
		}
		//0~23가지의로직을 만들어준다
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		
		if(minute <0){
			this.minute = 0;
			
		}else if(59<minute){
			this.minute=0;
			setHour(this.hour+1);
		}else{
			this.minute=minute;
		}
	
		}
		//1~60까지
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second <0){
			this.second = 0;
		}else if(59<second){
			this.second=0;
			setMinute(this.minute+1);
		}else{
			this.second=second;
		}	
		
		
		}
	
	String getTime(){
		
		return hour + ":"+ minute+":"+second;
	}
	
	void clock(){
		while(true){  //시간을 계속출력
			System.out.println(getTime());
			stop(10);
			setSecond(second+1);
		}
	}
	private void stop(int i) {
		try {        //예외처리 에러가발생하는 걸 방지하는코드
			Thread.sleep(i);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
