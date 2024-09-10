package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.*;
@WebServlet("/FinalUpdateDoctor")
public class FinalUpdateDoctor extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int did=Integer.parseInt(request.getParameter("did"));
					String name=request.getParameter("name");
					String contact=request.getParameter("contact");
					String email=request.getParameter("email");
					String category=request.getParameter("category");
					 doctormodel model=new doctormodel();
					 model.setId(did);
					 model.setContact(contact);
					 model.setCategory(category);
					 DoctorService ds=new DoctorServiceImpl();
					 boolean b=ds.isupdateDoctor(did, name, contact, email,category);
					 
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("viewDoctor.jsp");
						 r.forward(request, response);
						 out.println("<h1>Machine updated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Machine not updated sucesssfully</h1>");
					 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
