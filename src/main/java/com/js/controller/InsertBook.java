package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dao.PersonCRUD;
import com.js.dto.Book;
import com.js.dto.Person;

@WebServlet (value="/savebook")
public class InsertBook extends HttpServlet {

		@Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	int id = Integer.parseInt(req.getParameter("bid"));
    		String name = req.getParameter("bname");
    		String author = req.getParameter("bauthor");
    		double price = Integer.parseInt(req.getParameter("bprice"));
    		int pages = Integer.parseInt(req.getParameter("bpages"));
    		
    		Book b = new Book();
    		b.setId(id);
    		b.setBook_name(name);
    		b.setAuthor_name(author);
    		b.setPrice(price);
    		b.setNo_of_pages(pages);
    		
    		int result = BookCRUD.insertBook(b);
            RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
    		if (result==1) {
    			req.setAttribute("msg", "Book Inserted Successfully");
    			rd.forward(req, resp);
    		} else {
                req.setAttribute("msg", "Failed, Try again");
    			rd.forward(req, resp);
    		}

        }
		
}
