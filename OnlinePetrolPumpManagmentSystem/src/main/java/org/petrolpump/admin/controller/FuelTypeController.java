package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.petrolpump.admin.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpumpsystem.model.FuelTypeModel;


@WebServlet("/fueltype")
public class FuelTypeController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fueltype=request.getParameter("fueltype");
		FuelTypeModel model=new FuelTypeModel();
		model.setFuelName(fueltype);
		FuelType ft=new FuelTypeImpl();
		boolean b=ft.isAddFuelType(model);
		if(b) {
			out.println("<h1>fuel added sucessfully.....</h1>");
		}
		else {
			out.println("<h1>fuel not added properly......</h1>");
		}
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
