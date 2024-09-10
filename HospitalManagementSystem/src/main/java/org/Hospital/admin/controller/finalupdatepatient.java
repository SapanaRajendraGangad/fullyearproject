package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.service.PatientService;
import org.Hospital.admin.service.PatientServiceImpl;

@WebServlet("/finalupdpatient")
public class finalupdatepatient extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int pid=Integer.parseInt(request.getParameter("pid"));
					String name=request.getParameter("pname");
					String address=request.getParameter("address");
					String contact=request.getParameter("contact");
					int age=Integer.parseInt(request.getParameter("age")); 
					String gender=request.getParameter("gender");
					String pdate=request.getParameter("pdate");
					String ptype=request.getParameter("ptype");
					String category=request.getParameter("category");
					String status=request.getParameter("status");
					 PatientModel model=new PatientModel();
					 model.setId(pid);
					 model.setName(name);
					 model.setAddress(address);
					 model.setContact(contact);
					 model.setAge(age);
					 model.setGender(gender);
					 model.setPdate(pdate);
					 model.setPtype(ptype);
					 model.setCategory(category);
					 model.setStatus(status);
					 PatientService ds=new PatientServiceImpl();
					 boolean b=ds.isUpdatePatient(model);
					 
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("AddPatient.jsp");
						 r.forward(request, response);
						 out.println("<h1>patient updated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Patient not updated sucesssfully</h1>");
					 }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
