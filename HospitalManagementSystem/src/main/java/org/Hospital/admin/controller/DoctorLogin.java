package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.DoctorService;
import org.Hospital.admin.service.DoctorServiceImpl;

@WebServlet("/DoctorLogin")
public class DoctorLogin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String password=request.getParameter("pass");
	doctormodel dm=new doctormodel();
	dm.setEmail(name);
	dm.setContact(password);
	DoctorService ds=new DoctorServiceImpl();
	int b=ds.isDoctorLogin(name,password);
	if(b!=0) {
		HttpSession session=request.getSession(true);
		session.setAttribute("did", b);
		RequestDispatcher r=request.getRequestDispatcher("viewDoctorLogin.jsp");
		r.include(request, response);
		
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
