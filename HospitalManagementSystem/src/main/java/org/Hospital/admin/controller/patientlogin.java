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
import javax.servlet.http.HttpSession;
@WebServlet("/PatientLogin")
public class patientlogin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/javascript");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	PatientService ps=new PatientServiceImpl();
	boolean b=ps.isloginpatient(name, pass);
	if(b) {
		HttpSession session=request.getSession(true);
		session.setAttribute("name", name);
		RequestDispatcher r=request.getRequestDispatcher("viewPatientLogin.jsp");
		r.include(request, response);
		
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
