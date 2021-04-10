package I_api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateClass {

	public static void main(String[] args) {
		Date today= new Date();
		System.out.println(today);    //날짜를 표현하기 위한 클래스
		
		//날짜 => 문자열
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2= new SimpleDateFormat("HH:MM:ss.SSS");//.SSS 초를 1000분의 1초단위
		SimpleDateFormat sdf3= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4= new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a");
			//a 오전오후  E 12시간기준
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	
		//문자열 -> 날짜
		
		String str = "1987년 05월 01일";
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date datestr = sdf5.parse(str);
			System.out.println(datestr);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
	//날짜를 계산해볼거
		Calendar cal = Calendar.getInstance();//싱글톤 패턴
		
		cal.setTime(new Date());
		cal.set(2020, 8, 29); //2020/09/29(월은 0부터시작)
		
		System.out.println(cal.getTime());
		
		//더하고 빼고 계산할수있음
		//날짜 계산
		cal.add(Calendar.YEAR,1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH,-3);
		cal.add(Calendar.HOUR,4);
		cal.add(Calendar.MINUTE,10);
		cal.add(Calendar.SECOND,-15);
		System.out.println(sdf3.format(cal.getTime())); //1만큼 더했을때 결과 
		
		
	}

}
