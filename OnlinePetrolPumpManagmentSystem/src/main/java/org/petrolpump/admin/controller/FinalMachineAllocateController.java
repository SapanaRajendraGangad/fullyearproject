package org.petrolpump.admin.controller;
import org.petrolpump.admin.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/allocatemachine")
public class FinalMachineAllocateController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int empId=Integer.parseInt(request.getParameter("empid"));
		int mid=Integer.parseInt(request.getParameter("mcode"));
		String StartTime=request.getParameter("Starttime");
		String EndTime=request.getParameter("EndTime");
		String date=request.getParameter("Date");
		EmpServise empService=new EmpServiceImpl();
		boolean b=empService.allocateMachine(empId, mid,StartTime,EndTime,date);
		if(b) {
			out.println("<h1>machine allocated sucessfully</h1>");
		}
		else {
			out.println("<h1>machine not allocated succesfully....");
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
