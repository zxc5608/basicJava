package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import javax.imageio.stream.MemoryCacheImageInputStream;

import org.omg.CORBA.DATA_CONVERSION;
import org.omg.CORBA.PRIVATE_MEMBER;

import D_array.array;
import E_oop.ScanUtil;
import E_oop.score.score;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회,등록, 수정, 삭제가 가능한 게시판을 만들어주세요
		 * 
		 * 번호 (pk), 제목 , 내용 ,작성자, 작성일
		 * 
		 * ------------------------------
		 * 번호  제목 	작성자 		작성일
		 * ------------------------------
		 * 1	안녕하세요 홍길동		10-05
		 * 1	안녕하세요 홍길동		10-05
		 * 1	안녕하세요 홍길동		10-05
		 * 1	안녕하세요 홍길동		10-05
		 * ------------------------------
		 * 1.조회 	2.등록	 3.종료
		 */
		
		ArrayList<HashMap<String,Object>>boardList = new ArrayList<>();
		
		
		HashMap<String,Object> t = new HashMap<>();
		t.put("번호",1);
		t.put("제목", "안녕하세요");
		t.put("내용", "반갑습네다");
		t.put("작성자", "안용현");
		t.put("작성일", new Date());
		
		boardList.add(t);
		
		while(true){
		System.out.println("-----------------");
		System.out.println("번호 \t 제목 \t 작성자 \t 작성일");
		System.out.println("-------------------");
		for(int i=0;i<boardList.size();i++){
			HashMap<String,Object>board= boardList.get(i);
			System.out.println(board.get("번호")+"\t"+board.get("제목")+"\t"+board.get("작성자")+"\t"
			+new SimpleDateFormat("MM-dd").format(board.get("작성일")));
		}
		System.out.println("-------------------------");
		System.out.println("1.조회 \t 2.등록 \t 3.종료");
		
		int input =ScanUtil.nextInt();
		
		switch (input) {
		case 1: //조회
			read(boardList);
			break;
		case 2: //등록
			insert(boardList);
			break;
		case 3: // 종료
			System.out.println("종료되었습니다");
			System.exit(0);
			break;
	
		}
		}
		
	}

//등록

	private static void insert(ArrayList<HashMap<String, Object>> boardList) {
		int maxNo =0;
		for(int i=0;i<boardList.size();i++){
			HashMap<String,Object> temp =boardList.get(i);
				if(maxNo<(Integer)temp.get("번호")){
					maxNo =(Integer)temp.get("번호");
				}
				
		}
		maxNo++;
		
		System.out.println("제목");
		String title = ScanUtil.nextLine();
		System.out.println("내용");
		String content =ScanUtil.nextLine();
		System.out.println("작성자");
		String user = ScanUtil.nextLine();
		
		HashMap<String,Object> board= new HashMap<>();
		board.put("번호", maxNo);
		board.put("제목", title);
		board.put("내용",content);
		board.put("작성자",user);
		board.put("작성일",new Date());
		
		boardList.add(board);
		
		System.out.println("게시물 등록이 완료");
		
	}
	//조회
	private static void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.println("게시글 번호 입력");
		int no =ScanUtil.nextInt();
		
		HashMap<String,Object> board =null;
		for(int i=0;i<boardList.size();i++){
			HashMap<String, Object>temp = boardList.get(i);
			if((Integer)temp.get("번호")==no){
				board=temp;
				break;
			}
			
		}
		System.out.println("------------------");
		System.out.println("번호\t"+board.get("번호"));
		System.out.println("작성자\t"+board.get("작성자"));
		System.out.println("내용\t"+board.get("내용"));
		System.out.println("제목\t"+board.get("제목"));
		System.out.println("작성일\t"+board.get("작성일"));
		System.out.println("-----------------------");
		System.out.println("1.수정\t2.삭제\t3.목록");
		System.out.println("입력하세요>");
		
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
	System.out.println("제목>");
	String title =ScanUtil.nextLine();
	System.out.println("내용>");
	String content = ScanUtil.nextLine();
	System.out.println("작성자>");
	String user= ScanUtil.nextLine();
	
	board.put("제목", title);
	board.put("내용", content);
	board.put("작성자", user);
	
	System.out.println("수정완료");
		
	}
	//삭제
	private static void delete(HashMap<String, Object> board,ArrayList<HashMap<String,Object>>boardList){
		for(int i=0;i<boardList.size();i++){
			if(boardList.get(i).get("번호")==board.get("번호")){
				boardList.remove(i);
				System.out.println("삭제완료");
				break;
			}
		}
	}

	
	
	
}

	
	