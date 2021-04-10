package 안용현;

public class Item2 {
	public String name; 

	 int hp;      
	 int bob;
	 int def;
	
	Item2(String name, int hp, int att, int def){
		this.name= name;
		this.hp=hp;
		this.bob=bob;
		this.def=def;
	}
	public String iteminfo(){
		String info =name+":";
		if(0<hp)info += "체력+"+hp;
		if(0<bob)info +="공격+"+bob;
		if(0<def)info +="방어+"+def;
		return info;
	}
	
	}

