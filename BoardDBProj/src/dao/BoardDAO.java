package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import vo.Article;
import vo.User;

public class BoardDAO {

	public static Connection dbConnect() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties")); // 파일 inputStream
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("username"),
					db.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int insertUser(Connection conn, User user) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "insert into user (id, name) value(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	public static User selectUser(Connection conn, String id) {
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from user where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				String sid = rs.getNString("id");
				String name = rs.getNString("name");
				user = new User(sid, name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return user;
	}

	public static int insertArticle(Connection conn, Article article) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "insert into article (title, content, writer) values(?,?,?)"; // 칼럼명이랑 같아야한다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getContent());
			pstmt.setString(3, article.getWriter());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return cnt;
	}
	
	public static List<User> selectUserList(Connection conn){
		List<User> acc = new ArrayList<User>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from user";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null) {
				while(rs.next()) {
					String id = rs.getString("id");
					String name = rs.getString("name");
					acc.add(new User(id,name));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return acc;
//		List<User> acc = new ArrayList<User>();
//		Statement stmt = null;
//		try {
//			String sql = "select * from User";
//			stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				String id = rs.getString("id");
//				String name = rs.getString("name");
//				acc.add(new User(id, name));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(stmt != null) stmt.close(); 
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return acc;
	}
	
	public static List<Article> selectArticlelist(Connection conn){
		List<Article> arr = new ArrayList<Article>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from article";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt("num");
					String title = rs.getString("title");
					String content = rs.getString("content");
					String writer = rs.getString("writer");
					arr.add(new Article(num, title, content, writer));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arr;
	}
	
	public static Article selectArticle(Connection conn, Integer num) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Article article = null;
		try {
			String sql = "select * from article where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs != null && rs.next()) {
				Integer rnum = rs.getInt("num");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String Writer = rs.getString("writer");
				article = new Article(rnum, title, content, Writer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return article;
	}
	
	public static int updateArticle(Connection conn, Article modArticle) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "update article set title = ?,content = ? where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, modArticle.getTitle());
			pstmt.setString(2, modArticle.getContent());
			pstmt.setInt(3, modArticle.getNum());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return cnt;
	}
	
	public static int deleteArticle(Connection conn, Integer num) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "delete from article where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public static void main(String[] args) {

	}

}
