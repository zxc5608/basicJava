package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

import E_oop.ScanUtil;





public class JDBCBoard {
public static void main(String[] args) {
	

	/*
	 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
	 * 테이블 : TB_JDBC_BOARD
	 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
	 */
	ArrayList<HashMap<String, Object>>boardList= new ArrayList<>();
	HashMap<String, Object> t = new HashMap<>();
	t.put("NO", 1);
	t.put("TITLE", "안녕하세요");
	t.put("CONTENT", "반갑습니다.");
	t.put("USER", "홍길동");
	t.put("REG_DATE", new Date(new java.util.Date().getTime()));
	
	boardList.add(t);
	
	
	while(true){
		System.out.println("----------------------------------");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("----------------------------------");
		for(int i = 0; i < boardList.size(); i++){
			HashMap<String, Object> board = boardList.get(i);
			System.out.println(board.get("NO") + "\t" + board.get("TITLE") + "\t" + board.get("USER") + "\t"
					+ new SimpleDateFormat("MM-dd").format(board.get("REG_DATE")));
		}
		System.out.println("----------------------------------");
		System.out.println("1.조회\t2.등록\t3.종료");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1: //조회
			read(boardList);
			break;
			
		case 2: //등록
			insert(boardList);
			break;
			
		case 3: //종료
			System.out.println("종료되었습니다.");
			System.exit(0);
			break;
		}
	}
	
}



private static void insert(ArrayList<HashMap<String, Object>> boardList) {
	int maxNo=0;
	for(int i= 0;i<boardList.size();i++){
		HashMap<String,Object>temp=boardList.get(i);
		if(maxNo<(Integer)temp.get("NO")){
			maxNo=(Integer)temp.get("NO");
			
			
		}
	
}	maxNo++;
	
	System.out.print("제목>");
	String title = ScanUtil.nextLine();
	System.out.print("내용>");
	String content = ScanUtil.nextLine();
	System.out.print("이름>");
	String users = ScanUtil.nextLine();

	HashMap<String, Object> board = new HashMap<>();
	board.put("NO", maxNo);
	board.put("TITLE", title);
	board.put("CONTENT", content);
	board.put("USER_NAME", users);
	board.put("REG_DATE", new Date(new java.util.Date().getTime()));

	boardList.add(board);
	System.out.println("게시물 등록이 완료되었습니다.");
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "yongyong";
	String password = "java";
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs =null;
	
	try {
		con= DriverManager.getConnection(url,user,password);
		String sql="insert into TB_JDBC_BOARD values (?,?,?,?,sysdate)";
		ps= con.prepareStatement(sql);
		for(int i=0;i<boardList.size();i++){
			HashMap<String, Object>temp= boardList.get(i);
			ps.setObject(1, temp.get("NO"));
			ps.setObject(2, temp.get("TITLE"));
			ps.setObject(3, temp.get("CONTENT"));
			ps.setObject(4, temp.get("USER"));
		}
		
		int result = ps.executeUpdate();
		
		System.out.println(result + "행이 삽입 되었습니다.");
		
	} catch (SQLException e) {
		
		e.printStackTrace();
		
	}finally{
		
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}
}

private static void read(ArrayList<HashMap<String, Object>> boardList) {
	System.out.print("게시글 번호 입력>");
	int no = ScanUtil.nextInt();
	
	HashMap<String, Object> board = null;
	for(int i = 0; i < boardList.size(); i++){
		HashMap<String, Object> temp = boardList.get(i);
		if((Integer)temp.get("NO") == no){
			board = temp;
			break;
		}
	}
	
	System.out.println("--------------------------");
	System.out.println("번호\t: " + board.get("NO"));
	System.out.println("작성자\t: " + board.get("USER"));
	System.out.println("작성일\t: " + board.get("REG_DATE"));
	System.out.println("제목\t: " + board.get("TITLE"));
	System.out.println("내용\t: " + board.get("CONTENT"));
	System.out.println("--------------------------");
	System.out.println("1.수정\t2.삭제\t3.목록");
	System.out.print("입력>");
	int input = ScanUtil.nextInt();
	
	switch (input) {
	case 1: //수정
		update(board);
		break;
		
	case 2: //삭제
		delete(board, boardList);
		break;
		
	case 3: //목록
		
		break;
	}
}

private static void update(HashMap<String, Object> board) {
	System.out.print("제목>");
	String title = ScanUtil.nextLine();
	System.out.print("내용>");
	String content = ScanUtil.nextLine();
	
	board.put("TITLE", title);
	board.put("CONTENT", content);
	
	System.out.println("수정이 완료되었습니다.");
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "yongyong";
	String password = "java"; 
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "update TB_JDBC_BOARD set TITLE=?,CONTENT=? where BOARD_NO=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setObject(3, board.get("NO"));
		
		int result = ps.executeUpdate();
		
		System.out.println(result + "행이 수정 되었습니다.");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}
	
}

private static void delete(HashMap<String, Object> board,
		ArrayList<HashMap<String, Object>> boardList) {
	for(int i = 0; i < boardList.size(); i++){
		if(boardList.get(i).get("NO") == board.get("NO")){
			boardList.remove(i);
			System.out.println("삭제가 완료되었습니다.");
			break;
		}
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "yongyong";
	String password = "java"; 
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "delete TB_JDBC_BOARD where BOARD_NO=?";
		ps = con.prepareStatement(sql);
		ps.setObject(1, board.get("NO"));
		int result = ps.executeUpdate();
		
		System.out.println(result + "행이 삭제 되었습니다.");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}
}

}
