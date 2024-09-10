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
import org.Hospital.admin.model.RecepModel;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.DoctorService;
import org.Hospital.admin.service.DoctorServiceImpl;
@WebServlet("/RecepLogin")
public class RecepLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("Username").trim();
		String password=request.getParameter("pass").trim();
		RecepModel dm=new RecepModel();
		dm.setEmail(name);
		dm.setContact(password);
		ReceptionestServies ds=new ReceptionestServiesImpl();
		boolean b=ds.isrecepLogin(dm);
		System.out.println(b);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("doctoradmindashboard.jsp");
			r.include(request, response);
			out.println("loginsucessfully");
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
