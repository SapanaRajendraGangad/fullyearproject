package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.MedicineModel;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.*;
@WebServlet("/finalprescription")
public class finalprescription extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
					int did=Integer.parseInt(request.getParameter("did"));
					int pid=Integer.parseInt(request.getParameter("pid"));
					String name=request.getParameter("medicinename");
					 PatientService ds=new PatientServiceImpl();
					
					 boolean b=ds.addPrescription(did, pid, name);
					 
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("AddPatient.jsp");
						 r.forward(request, response);
						 out.println("<h1>medicine allocated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Medicine not Allocated sucesssfully</h1>");
					 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
