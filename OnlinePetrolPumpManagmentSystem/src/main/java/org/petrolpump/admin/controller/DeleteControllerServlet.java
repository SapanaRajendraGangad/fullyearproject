package org.petrolpump.admin.controller;
import org.petrolpump.admin.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/del")
public class DeleteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int mid=Integer.parseInt(request.getParameter("machineid"));
	MachineService mService=new MachineServiceImpl();
	boolean b=mService.isDeleteMachineById(mid);
	if(b) {
		RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
		r.forward(request, response);
	}
	else {
		out.println("machine not deleted..........");
	}
   	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
