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
@WebServlet("/deletedoctor")
public class DeleteDoctor extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int did=Integer.parseInt(request.getParameter("doctorid"));
		DoctorService ds=new DoctorServiceImpl();
		boolean b=ds.isDeleteDoctor(did);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("viewDoctor.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Doctor not deleted</h1>");
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
