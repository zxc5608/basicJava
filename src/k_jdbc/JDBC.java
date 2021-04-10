package k_jdbc;

import h_Exception.Finally;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC {
	public static void main(String[] args) {
		
	

	/*
	 * JDBC (java database Connectivity)
	 * -자바와 데이터베이스를 연결해주는 라이브러리
	 * -ojdbc:오라클 JDBC
	 * 
	 * JDBC작성단계
	 * 1. connection생성
	 * 2. statement 생성(쿼리)
	 * 3. Quary실행
	 * 4. ResultSet 에서 결과 추출 (select인경우)
	 * 5. ResultSet.Statement, Connection 닫기
	 * 
	 */
	
		//데이터베이스 접속정보
		String url ="jdbc:oracle:thin:@localhost:1521:xe"; //외워
		String user= "yongyong";
		String password ="java";
		
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs= null;                //객체생성
		
		try {
			//DriverManager :데이터베이스에 접속하기 위한 드라이브를 관리해주는 클래스
			con= DriverManager.getConnection(url,user,password);
			//getConnection에서 드라이버 자동로드
			
			String sql= "select *from member";
			ps = con.prepareStatement(sql);
			
			//select  두가지경우로 나뉜다
			rs= ps.executeQuery();
			
			
			
			
			//insert ,update ,delete
			//int result =ps.executeUpdate();
			while (rs.next()) {  //row의 개수만큼 실행하기위해 next를 쓴다
				String memId=rs.getString(1);
				String mempass=rs.getString("MEM_PASS");
				System.out.println("MEM_Id:"+memId+"/MEM_PASS:"+mempass);
				
				//rs.getInt(1);
				//rs.getDate(1);
			}
			
			String sql1 ="select * from dept";
			ps = con.prepareStatement(sql1);
			
			rs=ps.executeQuery();
			
			while(rs.next()){
				int deptno= rs.getInt(1); //숫자차이점
				String dname= rs.getString("dname");
				String loc= rs.getString("loc");
				System.out.println("deptno:"+deptno+"/dname:"+dname+"/loc:"+loc);
			}
			
			
			//임의의 테이블 하나를 조회해서 테이블의 모든내용을 출력해주세요
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}finally{
			if(rs != null) try {rs.close(); } catch(Exception e){}
			if(ps != null) try {ps.close(); } catch(Exception e){}
			if(con != null) try {con.close(); } catch(Exception e){}  //닫아줄땐 역순으로 닫는다.  
		}
		
		
		//이걸사용할려면 
		//ojdbc6 오라클 홈페이지에서 /자바/에서 내리면 /도구/부분에 /jdbc 드라이버/에서  11g(버전에맞는) 누르면 여러개의 파일이나온다. 버전에 맞는 거를 다운
}
}
