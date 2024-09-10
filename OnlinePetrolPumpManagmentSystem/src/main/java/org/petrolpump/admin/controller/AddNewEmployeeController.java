package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpump.admin.service.EmpServiceImpl;
import org.petrolpump.admin.service.EmpServise;
import org.petrolpumpsystem.model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addemp")
public class AddNewEmployeeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int sal=Integer.parseInt(request.getParameter("sal"));
		EmployeeModel model=new EmployeeModel();
		model.setName(name);
		model.setEmail(email);
		model.setContact(contact);
		model.setAddress(address);
		model.setSal(sal);
		EmpServise empServise=new EmpServiceImpl();
		boolean b=empServise.isAddNewEmployee(model);
		if(b) {
			out.println("<h1>Employee added sucessfully</h1>");
		}
		else {
			out.println("<h1>Employee not added sucessfully</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
