package com.catholicfitzory.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name = "catholicshop",
uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@XmlRootElement
public class Book {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "PUBLISHERS")
	private String publishers;
	
	@Column(name = "PRICE")
	private String price;
	
	@Column(name = "QUANTITY")
	private String quantity;
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getIsbn() 
	{
		return isbn;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getPublishers()
	{
		return publishers;
	}
	
	public void setPublishers(String publishers)
	{
		this.publishers = publishers;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	public void setPrice(String price)
	{
		this.price = price;
	}
	
	public String getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(String quantity)
	{
		this.quantity = quantity;
	}
}
