package com.catholicfitzory;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.catholicfitzory.dao.Book;
import com.catholicfitzory.dao.BookDAO;


@Path("/books")
public class MyResource {
	@GET
	@Produces("application/json")
	public List<Book> getBook() {
		BookDAO dao = new BookDAO();
		List books = dao.getBooks();
		return books;
	}
	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public Response addBook(Book bok){
		bok.setId(bok.getId());
		bok.setTitle(bok.getTitle());
		bok.setIsbn(bok.getIsbn());
		bok.setCategory(bok.getCategory());
		bok.setAuthor(bok.getAuthor());
		bok.setPublishers(bok.getPublishers());
		bok.setPrice(bok.getPrice());
		bok.setQuantity(bok.getQuantity());
		
		BookDAO dao = new BookDAO();
		dao.addBook(bok);
		
		return Response.ok().build();
	}
	
	@PUT
	@Path("/update/{id}")
	@Consumes("application/json")
	public Response updateBook(@PathParam("id") int id, Book bok){
		BookDAO dao = new BookDAO();
		int count = dao.updateBook(id, bok);
		if(count==0){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().build();
	}

	
	@DELETE
	@Path("/delete/{id}")
	@Consumes("application/json")
	public Response deleteBook(@PathParam("id") int id){
		BookDAO dao = new BookDAO();
		int count = dao.deleteBook(id);
		if(count==0){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().build();
	}
	
	
	@GET
	@Path("/create/{category}")
	@Consumes("application/json")
	@Produces("application/json")
	public List<Book> searchBook(@PathParam("category") String category){
		BookDAO dao = new BookDAO();
		List books = dao.searchBook(category);
//		if(books == null){
//			return Response.status(Response.Status.BAD_REQUEST).build();
//		}
//		return Response.ok().build();
		return books;
	}

	
}
