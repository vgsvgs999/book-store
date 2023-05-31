package com.js.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.js.dto.Book;

public class BookCRUD {
	 private final static String path = "com.mysql.cj.jdbc.Driver";
	 private final static String url = "jdbc:mysql://localhost:3306/book_store";
	 private final static String user = "root";
	 private final static String password = "Subbuz@999";
	 
     public static int insertBook(Book b) {
    	 Connection c = null;
    	 String query = "insert into Book values(?,?,?,?,?)";
    	 try {
    		Class.forName(path); 
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, b.getId());
			ps.setString(2, b.getBook_name());
			ps.setString(3, b.getAuthor_name());
			ps.setDouble(4, b.getPrice());
			ps.setInt(5, b.getNo_of_pages());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	 finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
     }

     public static ArrayList<Book> getAllBooks() {
 		ArrayList<Book> al = new ArrayList<Book>();
 		String query = "select * from book";
 		Connection c = null;
 		try {
 			Class.forName(path);
 			c = DriverManager.getConnection(url, user, password);
 			PreparedStatement ps = c.prepareStatement(query);
 			ResultSet rs = ps.executeQuery();
 			while (rs.next()) {
 				Book b = new Book();
 				b.setId(rs.getInt(1));
 				b.setBook_name(rs.getString(2));
 				b.setAuthor_name(rs.getString(3));
 				b.setPrice(rs.getDouble(4));
 				b.setNo_of_pages(rs.getInt(5));

 				al.add(b);
 			}
 			return al;
 		} catch (ClassNotFoundException e) {
 			e.printStackTrace();
 		} catch (SQLException e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				c.close();
 			} catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
 		return al;
 	}

	
	
	public static int deleteBookById(int id) {
		String query = "delete from book where book_id=?";
		Connection c = null;

		try {
			Class.forName(path);
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public static Book getBookById(int id) {
		String query = "select * from book where book_id=?";
		Connection c = null;

		try {
			Class.forName(path);
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Book b = new Book();
				b.setId(rs.getInt(1));
				b.setBook_name(rs.getString(2));
				b.setAuthor_name(rs.getString(3));
				b.setPrice(rs.getDouble(4));
				b.setNo_of_pages(rs.getInt(5));
				return b;
			} else {
				return null;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}
	
	public int updateBookById(int id,Book b) {
		Connection c=null;
		String query = "update book set book_name=?, book_author=?, book_price=?, no_of_pages=? where book_id=?";
		try {
			Class.forName(path);
			c=DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, b.getBook_name());
			ps.setString(2, b.getAuthor_name());
			ps.setDouble(3, b.getPrice());
			ps.setInt(4, b.getNo_of_pages());
			ps.setInt(5, id);
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	


     
     
}
