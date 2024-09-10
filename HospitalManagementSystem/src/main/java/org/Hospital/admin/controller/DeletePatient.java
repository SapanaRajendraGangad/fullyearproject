package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.service.PatientServiceImpl;
import org.Hospital.admin.service.PatientService;
import org.Hospital.admin.service.PatientServiceImpl;

@WebServlet("/deletepatient")
public class DeletePatient extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		PatientService ds=new PatientServiceImpl();
		boolean b=ds.isDeletePatient(pid);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("AddPatient.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Patient not deleted</h1>");
		}
		
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
