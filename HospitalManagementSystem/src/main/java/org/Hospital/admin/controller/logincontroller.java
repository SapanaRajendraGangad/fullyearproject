package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.Hospital.admin.service.*;
import org.Hospital.admin.model.adminModel;
@WebServlet("/login1")
public class logincontroller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	PrintWriter out=response.getWriter();
	String username=request.getParameter("Username");
	String password=request.getParameter("pass");
	adminModel am=new adminModel();
	am.setUserName(username);
	am.setPassword(password);
	AdminService as=new AdminServiceImpl();
	boolean b=as.isUserPresent(am);
	if(b) {
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.forward(request, response);
	}
	else {
	out.println("login not sucessfully");
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
