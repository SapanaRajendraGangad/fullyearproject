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

@WebServlet("/deletemedicine")
public class DeleteMedicine extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/javascript");
	PrintWriter out=response.getWriter();
	String MName=request.getParameter("medicine");
	int pid=Integer.parseInt(request.getParameter("pid"));
	DoctorService ds=new DoctorServiceImpl();
	boolean b=ds.isdeleteMedicine(pid, MName);
	if(b) {
		RequestDispatcher server=request.getRequestDispatcher("viewmedicine.jsp");
		server.forward(request, response);		
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
