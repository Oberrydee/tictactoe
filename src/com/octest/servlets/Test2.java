package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Test2() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String message = "Au revoir";
		request.setAttribute("variable", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
