package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.service.PatientService;
import org.Hospital.admin.service.PatientServiceImpl;
@WebServlet("/PatientController")
public class PatientController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("pname");
		String Address=request.getParameter("Address");
		String contact=request.getParameter("contact");
		int age=Integer.parseInt(request.getParameter("Age"));
		String gender=request.getParameter("gender");
		String date=request.getParameter("pdate");
		String ptype=request.getParameter("ptype");
		String category=request.getParameter("category");
		String status=request.getParameter("status");
		PatientModel model=new PatientModel();
		model.setName(name);
		model.setAddress(Address);
		model.setContact(contact);
		model.setAge(age);
		model.setGender(gender);
		model.setPdate(date);
		model.setPtype(ptype);
		model.setCategory(category);
		model.setStatus(status);
		  PatientService psi=new PatientServiceImpl();
		  boolean b=psi.isAddPatient(model);
		  if(b) {
				out.println("<h1>patient Added sucessfully</h1>");
			}
			else {
				out.println("<h1>patient not added sucessfully</h1>");
			}
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
