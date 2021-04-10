package f_Game;

import E_oop.ScanUtil;

public class Mygame {
	
	Character c;
	Item[] item;
	
	Mygame(){
		c= new Character("가렌",100,50,20,10);
		
	    item = new Item[10];
		item[0]=new Item("무한의대검",0,0,10,0);
		item[1]= new Item("가시갑옷",0,0,0,10);
	}

	public static void main(String[] args) {
		new Mygame().start();
		

		}
	void start(){
		int input =0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.종료");
			input =ScanUtil.nextInt();
			
			switch(input){
			case 1:
				c.showinfo();
				break;
			case 2:
				hunt();
				break;
				
			case 3: 
				System.out.println("종료되었습니다");
				System.exit(0);
				break;
			}
		}
		
	}
	void hunt(){
		//몬스터부터 객체생성
		monster m=new monster("고블린",60,50,20,10,new Item[]{item[0],item[1]});
		System.out.println(m.name+"을 만났습니다. 전투를 시작합니다");
		
		int input =0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input= ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m);//캐릭터가 몬스터를 공격
				if(m.hp<=0){
					System.out.println(m.name+"을 처치했습니다");
					c.getexp(150);
					c.getitem(m.itemdrop());
					break battle;
				}
				m.attack(c);//몬스터가 캐릭터를공격
				break;
			case 2:
				break battle;
			}
			
		}
	}

}
