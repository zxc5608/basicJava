package 안용현;

public class cowrpg {
	
	String name;
	int hp;
	int maxhp;
	int exp; // 경험치
	int money;//돈
	int bob; //밥
	int def;
	int level;
	Item2[] items;
	
	cowrpg(String name, int hp, int bob,int def){
		this.name= name;
		int maxhp=hp;
		this.hp= this.maxhp;
		this.money=100;
		this.exp=0;
		this.bob=bob;
		this.level = 1;
		this.def=def;
		this.items =new Item2[10];
	}
	
	void showinfo(){
		
		System.out.println("=============상태==============");
		System.out.println("소:"+name);
		System.out.println("레벨:"+level+"("+exp+"/100)");
		System.out.println("체력:"+maxhp);
		System.out.println("사료의 힘:"+def);
		System.out.println("==============================");
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {  
				System.out.println(items[i].iteminfo());
			}
		}
	}
	//밥을 주는 메서드
	
	void bobb(cow c){
		int give = bob + c.def;
		give = give <=0 ? 30: give;
		
		System.out.println(name+"의 먹이로"+c.name+"에게"+give+"만큼 체력을 줬습니다");
	
	}

	void getexp(int exp){
		System.out.print("주인이"+exp+"의 경험치를 획득하였습니다");
		this.exp+=exp;
		while(100<=this.exp){
			levelup2();
			this.exp-=100;
		}
}
	void levelup2(){
		level++;
		maxhp+=10;
		bob+=2;
		def+=2;
		hp=maxhp;
		System.out.println("\t★LEVEL UP☆");
	}
	
	void geting(Item2 item){
		System.out.println(item.name+"을 획득했습니다");
		for(int i = 0;i<items.length;i++){
			if(items[i]==null){
				items[i]=item;
				break;
	}
	}	
			maxhp+=item.hp;
		    bob+=item.bob;
			def+=item.def;
	

	}




}

