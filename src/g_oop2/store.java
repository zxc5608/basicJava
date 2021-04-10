package g_oop2;

public class store {

	public static void main(String[] args) {
		Desktop d1= new Desktop("삼성컴퓨터",100000);
		Desktop d2= new Desktop("lg컴퓨터",100000);

		Aircon ac1 =new Aircon("삼성에어컨 ",200000);
		Aircon ac2 =new Aircon("엘지에어컨 ",200000);
		
		TV tv1= new TV("삼성티비",300000);
		TV tv2= new TV("엘지티비",300000);
		
		customer c =new customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1);
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem();
	}

	

}


class Product{
	String name;  //이름
	int price; //가격

	    Product(String name,int price){
		this.name=name;
		this.price=price;
	   }
	   
	//상품정보를 반환하는 메서드
	String getInfo(){
		return name+"("+price+"원)";
	}
}

class Desktop extends Product{
	
	Desktop(String name, int price){
		super(name,price);
	}
	void programming(){
		System.out.println("프로그램을 만듭니다");
	}
	
}

class Aircon extends Product{
	Aircon(String name, int price){
		super(name,price);
		
	}
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}

class TV extends Product{
	TV(String name, int price){
		super(name,price);
	}
	void setchannel(){
		System.out.println("채널을 변경합니다.");
	}
	
}

class customer{
	int money =10000000;
	Product[]item = new Product[100]; 
	
	void buy(Product p){// product타입으로 형변환을 한다
		if(money<p.price){
			System.out.println("잔돈이 부족하다.");
			return;
		}
		money-=p.price;
		
		for(int i=0;i< item.length;i++){
			if(item[i]==null){
				item[i]=p;
				break;
			}
		}
		System.out.println(p.getInfo()+"를 구매했다.");
	}
	
	//내가 가지고있는물건의 
	void showItem(){
		System.out.println("==============아이템목록============");
		for(int i=0;i<item.length;i++){
			if(item[i]==null){
				break;
				
			}else{
				System.out.println(item[i].getInfo());
				
			}
		}
	}
}