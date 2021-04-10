package h_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally
		 * -필요에 따라  try-catch 뒤에 finally를 추가할수 있다
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다
		 * 
		 * 자동 자원 반환 
		 * -try(변수선헌;변수선언){}catch(Exception e){}
		 * -사용후 반환이 필요한 객체를 try()안에서 선언하면try블럭 종료시 자동으로 반환된다
		 */
		
		FileInputStream fis = null; //파일읽기
		 try {                            //이 위치에 있는 텍스트 파일을 읽겠다
			fis =new FileInputStream("d:/file.txt");
			
		} catch (Exception e) {
		  e.printStackTrace();
		}finally{
			try {
				fis.close();//이걸 호출해서 닫아줘야한다
			} catch (Exception e) {
			                              //이 클로즈를 생략하고싶어서  자원반환이라는걸 써준다
				e.printStackTrace();
			} 
		}
		 
		//예외 발생 :try ->catch -> finally
		//예외 미발생: try -> finally
		
		
		 
		 //자동자원반환(JDK1.7)                         //d드라이브에 텍스트 파일이생성된다
		 
		 try(FileOutputStream fos= new FileOutputStream("d:/file.txt")){
			 String str= "아무내용";
			 
			 byte[] bytes =str.getBytes();
			 
			 for(int i=0;i<bytes.length;i++){
				 fos.write(bytes[i]);
			 }
		 }catch (Exception e) {
			     e.printStackTrace();
	
		
	}
	}
}

