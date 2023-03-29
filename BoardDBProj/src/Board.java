import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.BoardDAO;
import vo.Article;
import vo.User;

public class Board {
	Scanner sc = new Scanner(System.in);
	int menu() {
		System.out.println("[코스타 게시판]");
		System.out.println("0.종료");
		System.out.println("1.회원가입");
		System.out.println("2.회원정보");
		System.out.println("3.전체회원정보");
		System.out.println("4.게시글작성");
		System.out.println("5.게시글상세");
		System.out.println("6.게시물수정");
		System.out.println("7.게시글삭제");
		System.out.println("8.게시글목록");
		System.out.print("선택>>");
		return Integer.parseInt(sc.nextLine());
	}
	void joinUser() {
		System.out.println("[회원 가입]");
		System.out.print("아이디:");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		
		User user = new User(id, name);
		Connection conn = BoardDAO.dbConnect();
		BoardDAO.insertUser(conn, user);
		
		BoardDAO.close(conn);
		
	}
	void writeArticle() {
		System.out.println("[게시글 작성]");
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		System.out.print("작성자:");
		String id = sc.nextLine();
		
		Article article = new Article(title, content, id);
		Connection conn = BoardDAO.dbConnect();
		User user = BoardDAO.selectUser(conn, id);
		if(user == null) {
			System.out.println("사용자 정보에 없는 작성자입니다");
		}
		BoardDAO.insertArticle(conn, article);
		
		BoardDAO.close(conn);
	}
	void userInfo() {
		System.out.println("[회원 정보]");
		
		System.out.print("아이디:");
		String id = sc.nextLine();
		
		Connection conn = BoardDAO.dbConnect();
		User user = BoardDAO.selectUser(conn, id);
		if(user == null) {
			System.out.println("아이디가 틀립니다");
		} else {
			System.out.println(user);
		}
		BoardDAO.close(conn);
		
	}
	void userList() {
		System.out.println("[전체 회원 정보]");
		Connection conn = BoardDAO.dbConnect();
		List<User> acc = BoardDAO.selectUserList(conn);
		for (User user : acc) {
			System.out.println(user);
		}
		BoardDAO.close(conn);
	}
	void articleDetail() {
		System.out.println("[게시글 상세]");
		System.out.print("글번호:");
		Integer num = Integer.parseInt(sc.nextLine());
		
		Connection conn = BoardDAO.dbConnect();
		Article article = BoardDAO.selectArticle(conn, num);
		if(article == null) {
			System.out.println("글이 존재하지 않습니다");
		} else {
			System.out.println(article);
		}
		
		BoardDAO.close(conn);
	}
	void articleModify() {
		System.out.println("[게시글 수정]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		
		Connection conn = BoardDAO.dbConnect();
		Article article = BoardDAO.selectArticle(conn, num);
		BoardDAO.updateArticle(conn, article);
		if(article == null) {
			System.out.println("글이 존재하지 않습니다");
		} else {
			article.setTitle(title);
			article.setContent(content);
			BoardDAO.updateArticle(conn, article);
		}
		
		BoardDAO.close(conn);
		
	}
	void articleRemove() {
		System.out.println("[게시글 삭제]");
		System.out.print("글번호:");
		Integer num = Integer.parseInt(sc.nextLine());
		
		Connection conn = BoardDAO.dbConnect();
		Article article = BoardDAO.selectArticle(conn, num);
		if(article == null) {
			System.out.println("글번호가 다르다");
		}else {
			BoardDAO.deleteArticle(conn, num);
		}
		BoardDAO.close(conn);
		
	}
	void articleList() {
		System.out.println("[게시글 목록]");
		Connection conn = BoardDAO.dbConnect();
		List<Article> arr = BoardDAO.selectArticlelist(conn);
		for (Article article : arr) {
			System.out.println(article);
		}
		
	}
	public static void main(String[] args) {
		Board board = new Board();
		while(true) {
			int sel=board.menu();
			if(sel==0) break;
			switch(sel) {
			case 1: board.joinUser(); break;
			case 2: board.userInfo(); break;
			case 3: board.userList(); break;
			case 4: board.writeArticle(); break;
			case 5: board.articleDetail(); break;
			case 6: board.articleModify(); break;
			case 7: board.articleRemove(); break;
			case 8: board.articleList(); break;
			}
		}

	}
}
