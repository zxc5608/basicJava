
package I_api;

public class StringspeedTest {

	public static void main(String[] args) {
//		String str ="a";
//		long start=System.currentTimeMillis();// 현재시간을 밀리세켄드로 반환
//		for(int i=0;i<200000;i++){
//			str+="a";
//		}
//		long end =System.currentTimeMillis();
//		System.out.println(end-start+"ms");

		StringBuffer sb =new StringBuffer("a");
		long start =System.currentTimeMillis();
		for(int i=0;i<200000;i++){
			sb.append("a");                          
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start+"ms");
	}

}
