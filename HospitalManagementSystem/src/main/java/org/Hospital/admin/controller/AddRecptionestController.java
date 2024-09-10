package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.Hospital.admin.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.RecepModel;

@WebServlet("/AddRecptionestController")
public class AddRecptionestController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String Rname=request.getParameter("rname");
	String email=request.getParameter("email");
	String contact=request.getParameter("contact");
	RecepModel rm=new RecepModel();
	rm.setRname(Rname);
	rm.setEmail(email);
	rm.setContact(contact);
	ReceptionestServies rs=new ReceptionestServiesImpl();
	boolean b=rs.addreceptionist(rm);
	if(b) {
		out.println("<h1>Receptionest added sucessfully</h1>");
	}
	else {
		out.println("<h1>Receptionest not added</h1>");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
