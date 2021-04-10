package 안용현;

import E_oop.ScanUtil;

public class cowgame {
	cowrpg g;
	cow m;
	
	mino o;
	Item2[] items;
	
	cowgame(){
		g=new cowrpg("주인",100,20,10);
		m=new cow("소",10,10,10,items);
		o=new mino("미노타우르스",20,20,20,items);
		
		items = new Item2[10];
		items[0]= new Item2("맛있는 우유",10,10,10);
		items[1]=new Item2("비싼우유",20,20,20);
		
	}
	public static void main(String[] args) {
		new cowgame().start();
	}
	void start(){
		int input =0;
		while(true){
			System.out.println("1.소 주인현황2.소의 정보 3.먹이주기 4.종료");
			input=ScanUtil.nextInt();
		
			switch(input){
			case 1:
				g.showinfo();
				break;
			case 2:
				evol();
				break;
				
			case 3:
				hunt();
				cexp();
				break;
			case 4:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		
		}
		
		
	}
	void evol(){
		if(m.level<=7){
			m.showinfo1();
			
		}else if(m.level>=7){
			o.showinfo1();
			
		}
	}

	void cexp(){
		if(m.level<=7){
			m.getexp1(150);
			
		}else if(m.level>=7){
			o.getexp1(150);
			
		}
	}
		
	
	
	void hunt(){
		cow m =new cow("소",20,20,20,new Item2[]{items[0],items[1]});
		System.out.println(m.name+"에게 먹이를 줘야합니다");
		
		int input =0;
		battle : while(true){
			System.out.println("1.먹이준다\t2.안준다");
			input= ScanUtil.nextInt();
			switch(input){
			case 1:
				g.bobb(m);
				if(m.hp<=0){
					System.out.println(m.name+"가 행복해합니다");
				    g.getexp(100);
					g.geting(m.itemdrop1());
					break battle;
				}
				m.bobb(g);//주인공이 밥을 준다
				break;
			case 2:
				break battle;
			}
			
		}
		
		
	}
	
}

