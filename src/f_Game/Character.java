package f_Game;

public class Character {

	String name; // 이름
	int maxhp;	//최대체력
	int hp;      //체력
	int maxmp;	//최대마나
	int mp;     //마나
	int att;   //공격력
	int def;   //방어력
	int exp;	// 경험치
	int level;	//레벨
	Item[] items; //보유아이템
	
	
	//생성자를 만들자
	Character(String name, int hp, int ma, int att, int def){
		this.name = name;
		this.maxhp = hp;
		this.maxmp = mp;
		this.hp = this.maxhp;
		this.mp = this.maxmp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}

	// 상태창을 만들자in
	void showinfo() {
		System.out
				.println("===================================================");
		System.out
				.println("----------------------상태--------------------------");
		System.out.println("이름: " + name);
		System.out.println("레벨" + level + "(" + exp + "/100)");
		System.out.println("체력:" + maxhp);
		System.out.println("마나" + maxmp);
		System.out.println("공격력:" + att);
		System.out.println("방어:" + def);
		System.out.println("====================아이템===============");
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {  //널이 아닐때만 출력할수있게   아이템창을 보기위해
				System.out.println(items[i].iteminfo());
			}
		}
		System.out.println("==============================================");
	}
	
	void attack(monster m){  //공격할때 누구를 공격할 것인가  파라미터를 연결
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; // 체력이 0보다떨어지면 안됨
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; //체력만큼만 감소를 시켜라 -가 되지 않기위해
		System.out.println(name+"가 공격으로 "+ m.name +"에게"+damage+"만큼 데미지를 주었습니다");
		System.out.println(m.name+ "의 남은 HP :"+m.hp);
		
	}
	
	//경험치를 획득하는 메서드
	void getexp(int exp){  //파라미터의 경험치를 얻는만큼 저장?
		System.out.println(exp+"의 경험치를 획득하였습니다");
		this.exp+= exp;
		while(100<=this.exp){ //경험치가 100이상인 경우 반복을한다
			levelup();
			this.exp-=100;  //레벨업을하면 다시 경험치가 감소되야한다.
			}
		
	}
	
	
	void levelup(){
		level++;
		maxhp+=10;
		maxmp+=5;
		att+=2;
		def+=2;
		hp = maxhp; //레벨업을하면 최대체력이되야함
		mp = maxmp;
		System.out.println("LEVEL UP!!");
	}
	void getitem(Item item){
		System.out.println(item.name+"을 획득했습니다.");
		//아이템배열에다가 아이템을 넣어줄거야
		for(int i = 0;i<items.length;i++){
			if(items[i]==null){
				items[i]=item;
				break;
			}
		}
	//아이템의 능력ㅊ만큰 캐릭터의 능력치증가시켜
		maxhp+=item.hp;
		maxmp+=item.mp;
		att+=item.att;
		def+=item.def;
	}
}

