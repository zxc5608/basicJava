package f_Game;

public class monster {

	String name; // 이름
	int maxhp;	//최대체력
	int hp;      //체력
	int maxmp;	//최대마나
	int mp;     //마나
	int att;   //공격력
	int def;   //방어력
	int exp;	// 경험치
	int level;	//레벨
	Item[] items; //보유아이템 죽을때 아이템
	
	//생성자를 생성 다른종류의 몬스터를 넣기위해
	
	monster(String name, int hp, int mp, int att, int def, Item[]items){
		this. name= name;
		this. maxhp=hp;
		this.maxmp=mp;
		this.hp=this.maxhp;
		this.mp=this.maxmp;
		this.att=att;
		this.def=def;
		this.items=items;
		
		
	} //공격메서드는 똑같음
	void attack(Character m){  //공격할때 누구를 공격할 것인가  파라미터를 연결
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; // 체력이 0보다떨어지면 안됨
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; //체력만큼만 감소를 시켜라 -가 되지 않기위해
		System.out.println(name+"가 공격으로 "+ m.name +"에게"+damage+"만큼 데미지를 주었습니다");
		System.out.println(m.name+ "의 남은 HP :"+m.hp);
		
	}//아이템이라는 리턴타입을줫다
	Item itemdrop(){
		//랜덤으로 아이템하나를 떨구기위해
		return items[(int)(Math.random()*items.length)];
	}
}
