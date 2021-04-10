package 안용현;

public class mino {

	String name;
	int hp;
	int maxhp;
	int exp; // 경험치
	int money;//돈
	int bob; //밥
	int def;
	int level;
	Item2[] items;

	mino(String name,int hp,int bob,int def,Item2[]items){
	this.name= name;
	int maxhp=hp;
	this.hp= this.maxhp;
	this.money=100;
	this.exp=0;
	this.level = 1;
	
	this.bob=bob;
	this.def=def;
	this.items= items;
	}
	void showinfo1(){
		
		System.out.println("=============상태==============");
		System.out.println("카우:"+name);
		System.out.println("레벨:"+level+"("+exp+"/100)");
		System.out.println("체력:"+maxhp);
		System.out.println("힘:"+bob);
		System.out.println("밥:"+def);
		System.out.println("==============================");
		}
	
	void bobb(cow c){
		int give = bob + c.def;
		give = give <=0 ? 30: give;
		System.out.println(name+"의 먹이로\t3"+c.name+"에게"+give+"만큼 체력을 줬습니다");
		
	}
        void getexp1(int exp){
		System.out.println("미노타우르스가"+exp+"의 경험치를 획득하였습니다");
		this.exp+=exp;
		while(100<=this.exp){
			levelup();
			this.exp-=100;
		}
}
	void levelup(){
		level++;
		maxhp+=10;
		bob+=2;
		def+=2;
		hp=maxhp;
		System.out.println("\t☆LEVEL UP★");
	}
	
		
	
	void bobb(cowrpg g){
		int give = bob + g.def;
		give = give >=100 ? 1 : give;


		System.out.println(name+"의 먹이로"+g.name+"에게"+give+"만큼 체력을 줬습니다");
		System.out.println(g.name+"의 경험치:"+exp);
	}
	Item2 itemdrop1(){
		return items[(int)(Math.random()*items.length)];
	}
}
