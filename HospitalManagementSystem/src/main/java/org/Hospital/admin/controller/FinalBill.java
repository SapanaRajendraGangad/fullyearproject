package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Hospital.admin.model.BillModel;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.service.DoctorService;
import org.Hospital.admin.service.DoctorServiceImpl;
import org.Hospital.admin.service.*;
@WebServlet("/bill")
public class FinalBill extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int pid=Integer.parseInt(request.getParameter("pid"));
					String date=request.getParameter("date");
					int doctor_fees=Integer.parseInt(request.getParameter("doctor_Fee"));
					int Room_fees=Integer.parseInt(request.getParameter("room_Fee"));
					int total=Integer.parseInt(request.getParameter("total"));
					BillModel model=new BillModel();
					 model.setPid(pid);
					model.setDate(date);
					model.setDoctor_fees(doctor_fees);
					model.setRoom_fees(Room_fees);
					model.setTotal(total);
					ReceptionestServies rservies=new ReceptionestServiesImpl();
					boolean b=rservies.isAddbill(model);
					if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("AddPatient.jsp");
						 r.forward(request, response);
						 out.println("<h1>Bill Added sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Bill not Added sucesssfully</h1>");
					 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
