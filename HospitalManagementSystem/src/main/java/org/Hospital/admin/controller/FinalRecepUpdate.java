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

@WebServlet("/FinalRecepUpdate")
public class FinalRecepUpdate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int rid=Integer.parseInt(request.getParameter("rid"));
					String rname=request.getParameter("rname");
					String email=request.getParameter("email");
					String contact=request.getParameter("contact");
					 RecepModel model=new RecepModel();
					 model.setRid(rid);
					 model.setRname(rname);
					 model.setEmail(email);
					 model.setContact(contact);
					 ReceptionestServies ds=new ReceptionestServiesImpl();
					 boolean b=ds.updateReceptioniest(model);
					 
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("viewReceptionest.jsp");
						 r.forward(request, response);
						 out.println("<h1>Receptionest updated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Receptionest not updated sucesssfully</h1>");
					 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
