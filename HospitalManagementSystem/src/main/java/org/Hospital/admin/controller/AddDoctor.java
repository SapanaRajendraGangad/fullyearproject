package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.DoctorService;
import org.Hospital.admin.service.DoctorServiceImpl;

@WebServlet("/adddoctor")
public class AddDoctor extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("dname");
	String contact=request.getParameter("contact");
	String email=request.getParameter("email");
	String category=request.getParameter("category");
	String time=request.getParameter("time");
	doctormodel dm=new doctormodel();
	dm.setName(name);
	dm.setContact(contact);
	dm.setEmail(email);
	dm.setCategory(category);
	dm.setTime(time);
	DoctorService ds=new DoctorServiceImpl();
	boolean b=ds.isAddDoctor(dm);
	if(b) {
		out.println("<h1>Doctor Added sucessfully</h1>");
	}
	else {
		out.println("<h1>doctor not added sucessfully</h1>");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
