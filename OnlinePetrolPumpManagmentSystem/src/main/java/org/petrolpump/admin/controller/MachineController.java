package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.petrolpump.admin.service.*;
import org.petrolpumpsystem.model.MachineModel;

@WebServlet("/machineCode")
public class MachineController extends HttpServlet {
	MachineService machineservice=new MachineServiceImpl();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String machinCode=request.getParameter("Mcode");
		String ftypeId[]=request.getParameterValues("ftype");
		String capArray[]=request.getParameterValues("capacity");
		MachineModel model=new MachineModel();
		boolean flag=false;
		model.setMachineCode(machinCode);
		
		boolean b=machineservice.isAddNewMachine(model,ftypeId,capArray);
if(b) {
out.println("<h1>Machine Added Sucessfully</h1>");
}
else {
out.println("<h1>Machine Not Added Sucessfully</h1>");

}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
