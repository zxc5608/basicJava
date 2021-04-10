package k_jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {


	//싱글톤패턴: 인스턴스의 생성을 제한하려 하나의 인스턴스만 사용하는 디자인패턴
						//인스턴스(객체)를 하나만
	
	//다른클래스에서 생성자를 호출못하게
	private JDBCUtil(){
		
	}
	
	//이클래스안에서 객체생성을 해야한다 객체를 저장할 변수를 하나만들고
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance() {
		if(instance ==null){
			instance=new  JDBCUtil();
			
		}
		return instance;   
		
	}//다른클래스에서 정보를 알수없게 private를 붙인다
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "yongyong";
	private String password = "java";
	
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs =null;
	
	/*
	 * Map<String,Object> selectOne(String sql)
	 * Map<String,Object> selectOne(String sql,List<Object>param)
	 * List<Map<String,Object>> select(String sql)
	 * List<Map<String,Object>> select(String sql,List<Object>param)
	 * int update(String sql)
	 * int update(String sql List<Object>param)
	 * 
	 */
	//1
	public Map<String,Object>selectOne(String sql){
		Map<String, Object>row= new HashMap<>();
			try {
				con=DriverManager.getConnection(url,user,password);
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				
				ResultSetMetaData md=rs.getMetaData();
				
				int columnCount= md.getColumnCount();
				
				while(rs.next()){
					for(int i=1;i<=columnCount;i++){
						String key=md.getColumnName(i);
						Object value=rs.getObject(i);
					
						row.put(key,value);
					}
				}
					
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
					
	 	return row;
			
			
			
		}
	
	
	//2
	public Map<String,Object> selectOne(String sql,List<Object>param){
		Map<String,Object> row=new HashMap<>();
		try {
			con=DriverManager.getConnection(url,user,password);
			
			ps=con.prepareStatement(sql);
			
			for(int i=0;i<param.size();i++){
				ps.setObject(i+1,param.get(i));
			}
			rs=ps.executeQuery();
			
			ResultSetMetaData md=rs.getMetaData();
			
			int columnCount= md.getColumnCount();
			
			while(rs.next()){
			
				for(int i=0;i<=columnCount;i++){
					String key=md.getColumnName(i);
					Object value= rs.getObject(i);
					row.put(key,value); 
				}
			
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally{
		
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}
		return row;
}
	
	public List<Map<String,Object>>selectList(String sql){
		List<Map<String,Object>>list =new ArrayList<>();
		 
		try {
			con=DriverManager.getConnection(url,user,password);
			ps= con.prepareStatement(sql);
			rs= ps.executeQuery();
			
			ResultSetMetaData md= rs.getMetaData();
			int columnCount= md.getColumnCount();
			
			while(rs.next()){
				Map<String, Object>row= new HashMap<>();
				for(int i= 1;i<=columnCount;i++){
					String key= md.getColumnClassName(i);
					Object value= rs.getObject(i);
					row.put(key, value);
					
				}
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
	}
		
		
	


		
		
	

	public List<Map<String,Object>> select(String sql,List<Object>param){
		 List<Map<String,Object>>list =new ArrayList<>(); //메소드에 제일 첫줄에다 만들다
		
		try {
			con= DriverManager.getConnection(url,user,password);
			
			ps= con.prepareStatement(sql);
			
			for(int i=0; i<param.size();i++){
				ps.setObject(i+1,param.get(i));
			}
			
			//쿼리실행
			rs=ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //몇개가 있는지 알수있어야됨
			int columnCount= md.getColumnCount(); //모든ㄷ데이터를 리턴
			
			while (rs.next()) {
				Map<String,Object>row =new HashMap<>();  //위치중요 while문안에서 리절트셋을 가져온다 한줄한줄 새로운해쉬맵을 만들어줘야한다.
				for(int i=0;i<=columnCount;i++){
					String key=md.getColumnName(i);
					Object value= rs.getObject(i);
					row.put(key,value);  //키와 밸류를 저장 
					
				}
				list.add(row); //리스트에다 넣어준다  
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally{
			
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		return list;
	}
		
	int update(String sql){
		int result =0;
		try{
		con= DriverManager.getConnection(url,user,password);
		ps= con.prepareStatement(sql);
		rs= ps.executeQuery();
	
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return result;
		
	}
	
	int update(String sql, List<Object> param){
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return result;
	}
	
	
	}
