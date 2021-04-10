package 안용현;

import E_oop.ScanUtil;

public class Radio {
	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	//숙제
	boolean power;
	double channel;
	int vol;
	
	final double minchannel= 30.0;
    double maxchannel= 200.0;
	final int minvol= 0;
	final int maxvol= 30;
	
	
	Radio(){
		power= false;
		channel=1;
		vol=5;
	}
	
	void power(){
		power= ! power;
		System.out.println(power?"켜짐":"꺼짐");
	}
	double cchannel(double channel){
		if(power){
			if(minchannel<=channel&&channel<=maxchannel){
			this.channel=channel;
			}
		
		}	System.out.println("FM" + this.channel);
		return channel;
	
		}
	double chup(){
		return cchannel(channel+1.0);
			
		}
	double chdown(){
		return cchannel(channel-1.0);
		
	}
	void volup(){
		if(power){
			if(vol < maxvol){
				vol++;
				}
			
		}
		showvol();
	}
	void voldown(){
		if(power){
			if(minvol<vol){
				vol--;
				}
		
		}
		showvol();
	}
	void showvol(){
		System.out.println("음량");
		for(int i = minvol + 1;i<=maxvol;i++){
			if(i<=vol){
				System.out.print("◀");
			}else{
				System.out.print("◁");
			}
			
		}System.out.println();
	}
	public static void main(String[] args) {
		
		Radio ra= new Radio();
		
		while(true){
		System.out.println("--------------------------Radio--------------------------");
		System.out.println("1.전원  2.주파수변경 3.주파수업 4.주파수다운 5.볼륨업 6.볼륨다운  0.종료");
		System.out.println("----------------------------------------------------------");
		System.out.println("번호를 입력하세요");
		int input = ScanUtil.nextInt();
		
		switch(input){
		
		case 1: ra.power(); break;
		case 2: 
			System.out.println("변경할 값");
			double sc= ScanUtil.nextDouble();
			ra.cchannel(sc);
			break;
		case 3: ra.chup(); break;
		case 4: ra.chdown(); break;
		case 5: ra.volup(); break;
		
		case 6: ra.voldown(); break;
		
		default:
		System.out.println("종료되었습니다");
		System.exit(0);
		break;
		
		}
	}
		
		
		
	}

	
}
	

