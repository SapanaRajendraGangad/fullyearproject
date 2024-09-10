package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.service.FuelType;
import org.petrolpump.admin.service.FuelTypeImpl;
import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.service.MachineServiceImpl;
import org.petrolpumpsystem.model.FuelTypeModel;
import org.petrolpumpsystem.model.MachineModel;


@WebServlet("/Fuelfinalmachineupdate")
public class Fuelfinalmachineupdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
					int fid=Integer.parseInt(request.getParameter("fuelid"));
					String fname=request.getParameter("fuelname");
					 FuelTypeModel model=new FuelTypeModel();
					 model.setFid(fid);
					 model.setFuelName(fname);
					 FuelType mService=new FuelTypeImpl();
					 boolean b=mService.isupdatefueltype(fid, fname);
					 if(b) {
						 RequestDispatcher r=request.getRequestDispatcher("ViewFuel.jsp");
						 r.forward(request, response);
						 out.println("<h1>Machine updated sucessfully</h1>");
					 }
					 else {
						 out.println("<h1>Machine not updated sucesssfully</h1>");
					 }
				}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
