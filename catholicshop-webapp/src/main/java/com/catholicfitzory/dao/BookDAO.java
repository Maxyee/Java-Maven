package com.catholicfitzory.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.fitzorybooks.dao.Book;


@SuppressWarnings("deprecation")
public class BookDAO {
	public void addBook(Book bean){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		addBook(session,bean);
		tx.commit();
		session.close();
	
	}
	
	private void addBook(Session session, Book bean){
		Book book = new Book();
		
		book.setId(bean.getId());
		
		book.setTitle(bean.getTitle());
		
		book.setIsbn(bean.getIsbn());
		
		book.setCategory(bean.getCategory());
		
		book.setAuthor(bean.getAuthor());
		
		book.setPublishers(bean.getPublishers());
		
		book.setPrice(bean.getPrice());
		
		book.setQuantity(bean.getQuantity());
		
		session.save(book);
	}
	
	
	public List<Book> getBooks(){
		Session session = SessionUtil.getSession();
		Query<Book> query = session.createQuery("from Book");
		List<Book> books =query.list();
		session.close();
		return books;
	}
	
	
	public int deleteBook(int id) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Book where id = :id";
		Query<Book> query = session.createQuery(hql);
		query.setInteger("id",id);
		int rowCount = query.executeUpdate();
		System.out.println("Rows affected: " + rowCount);
		tx.commit();
		session.close();
		return rowCount;
	}
	
	public int updateBook(int id, Book bok){
		if(id <=0) return 0;
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "update Book set title = :title, isbn=:isbn, category=:category, author=:author, publishers=:publishers, price=:price, quantity=:quantity, where id = :id";
		Query<Book> query = session.createQuery(hql);
		query.setInteger("id",id);
		query.setString("title",bok.getTitle());
		query.setString("isbn",bok.getIsbn());
		query.setString("category",bok.getCategory());
		query.setString("author",bok.getAuthor());
		query.setString("publishers",bok.getPublishers());
		query.setString("price",bok.getPrice());
		query.setString("quantity",bok.getQuantity());
		int rowCount = query.executeUpdate();
		System.out.println("Rows affected: " + rowCount);
		tx.commit();
		session.close();
		return rowCount;
	}
	
	
	
	public List<Book> searchBook(String category) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "from Book where category = :category";
		Query<Book> query = session.createQuery(hql);
		query.setString("category",category);
		List<Book> books = query.list();
		session.close();
		return books;
			
	}
	
	
//	public List<Book> searchBook(String category){
//		Session session = SessionUtil.getSession();
//		Query<Book> query = session.createQuery("from Book where category = :category");
//		List<Book> books =query.list();
//		session.close();
//		return books;
//	}

	
	




}
