package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.service.MachineServiceImpl;
import org.petrolpumpsystem.model.MachineModel;

/**
 * Servlet implementation class FinalMachineUpdae
 */
@WebServlet("/finalmachineupdae")
public class FinalMachineUpdae extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int mid=Integer.parseInt(request.getParameter("mid"));
					String machineCode=request.getParameter("mcode");
					 MachineModel model=new MachineModel();
					 model.setId(mid);
					 model.setMachineCode(machineCode);
					 MachineService mService=new MachineServiceImpl();
					 boolean b=mService.isUpdateMachine(model);
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
						 r.forward(request, response);
						 out.println("<h1>Machine updated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Machine not updated sucesssfully</h1>");
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
