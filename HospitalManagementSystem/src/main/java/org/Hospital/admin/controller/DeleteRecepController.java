package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.Hospital.admin.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteRecepController")
public class DeleteRecepController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int rid=Integer.parseInt(request.getParameter("rid"));
	
	ReceptionestServies rs=new ReceptionestServiesImpl();
	boolean b=rs.isdeleteReceptioniest(rid);
	if(b) {
		RequestDispatcher r=request.getRequestDispatcher("viewReceptionest.jsp");
		r.forward(request, response);
	}
	else {
		out.println("<h1>Receptioniest not deleted</h1>");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
