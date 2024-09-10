package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.service.PatientService;
import org.Hospital.admin.service.PatientServiceImpl;

/**
 * Servlet implementation class deletebill
 */
@WebServlet("/deletebill")
public class deletebill extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		PatientService ds=new PatientServiceImpl();
		boolean b=ds.isdeleteBill(pid);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("viewBill.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Patient not deleted</h1>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
