package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.petrolpump.admin.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delete")
public class DeletefuelTypeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("fuelid"));
		FuelType fuelservies=new FuelTypeImpl();
		boolean b=fuelservies.isDeletefueltypebyid(id);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
			r.forward(request, response);
		}
		else {
			out.println("machine not deleted..........");
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
