package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key,object Value): 지정된 키와 값을 지정한다.
		 * Object remove(Object Key): 지정된 키로 저장된 값을 제거한다
		 * Object get(Object key):지정된 키의 값 (없으면 NULL )을 반환한다.
		 * Set keyset(): 저장된 모든키를 Set 으로 반환한다.
		 * 중복되지 않은값만 저장
		 * 
		 * 
		 */
		// 앞에있는게 키 뒤에있는게 값의 타입
		HashMap<String,Object> map=new HashMap<>();
		//해쉬맵 객체를 생성 어떤타입에 지정을 할건지 제네릭지정
		
		map.put("a", 10); //키 지정과 저장할값넣어
		map.put("b", "홍길동");
		map.put("c", new Date());
		
		System.out.println(map);  //출력은 b,c,a 이유는 순서가없음 
		
		map.put("b","이순신"); //덮어쓴다
		System.out.println(map);
		
		map.remove("a");
		System.out.println(map); //map에있는 값을 제거하기위한 메서드
		
		Object value = map.get("b");
		System.out.println(value);  //b의 키를 반환한다. 
		
		Set<String> keys=map.keySet(); // 저장된 모든키를 가져오는 메서드 
			//변수       콜론    셋             변수에잇는 모든 변수의값을 꺼낼때까지 포문을 실행한다.
		for(String key :keys){
			System.out.println(key +":"+map.get(key));
		}
		
		HashMap<String,Object> lprod= new HashMap<>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		ArrayList<HashMap<String,Object>> table =new ArrayList<>();
		table.add(lprod);
		
		System.out.println(table);
		
		lprod =new HashMap<>();
		lprod.put("LPROD_ID",2);
		lprod.put("LPROD_GU","P102");
		lprod.put("LPROD_NM","전자제품");
		
		table.add(lprod);
		
		System.out.println(table);
		/////////////////////////////////////////////////////////////
		
		ArrayList<HashMap<String,Object>> deptTable =new ArrayList<>();
		
		HashMap<String,Object> dept= new HashMap<>();
		dept.put("DEPTNO", "10");
		dept.put("DNAME","ACCOUNTING");
		dept.put("LOC","NEW YORK");
		
		
		deptTable.add(dept);
		
	
		
		dept=new HashMap<>();
		dept.put("DEPTNO", "20");
		dept.put("DNAME","RESEARCH");
		dept.put("LOC","DALLAS");
		
		deptTable.add(dept);
		
		dept=new HashMap<>();
		dept.put("DEPTNO", "30");
		dept.put("DNAME","SALES");
		dept.put("LOC","CHICAGO");
		
		deptTable.add(dept);
	

		dept=new HashMap<>();
		dept.put("DEPTNO", "40");
		dept.put("DNAME","OPRATIONS");
		dept.put("LOC","BOSTON");
		
		deptTable.add(dept);
		
		System.out.println();
		
		
		for(int i= 0;i<deptTable.size();i++){
			HashMap<String, Object> d= deptTable.get(i);
			
		
		for(String key:d.keySet()){
			System.out.println(key+":"+d.get(key));
				
		}
		System.out.println("---------------------------------");
		
		}
	}

}
