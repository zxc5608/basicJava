package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe"; //외워
		String user= "yongyong";
		String password ="java";
		
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs= null;                //객체생성
		
		try {
			con=DriverManager.getConnection(url,user,password);
			
			String sql="select * from cart where cart_member=?";  //?를 넣고 따로셋팅
			ps=con.prepareStatement(sql);
			ps.setString(1, "a001");//1번째 있는 물음표에 a001을 넣겠다.
			//ps.setInt(2, 10);
			//ps.setDate(3, new Date(new java.util.Date().getTime()));date 는 임포트를 해줘야대
							//date를 구분하기위해서 둘중하나는 패키지의 풀네임을적어준다.
			rs=ps.executeQuery();
			
			ResultSetMetaData md =rs.getMetaData(); //메타데이터: 데이터에대한 데이터
			
			int columnCount = md.getColumnCount(); //컬럼수 조회
			
			while (rs.next()) {
				for(int i=1;i<=columnCount;i++){
					Object value= rs.getObject(i);
					System.out.print(value+"\t");
				}
				System.out.println();
			}
			
			//임의의 테이블에 insert할수있는 코드를 작성해주세요
			
			sql= "insert into dept values (?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 45);
			ps.setString(2, "bbb");
			ps.setString(3, "ccc");
			
			int result = ps.executeUpdate();
			
			System.out.println(result+"한개의 행이 바뀌었습니다");
			
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
