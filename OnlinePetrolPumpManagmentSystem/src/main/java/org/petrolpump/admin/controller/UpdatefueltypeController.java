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

@WebServlet("/Update")
public class UpdatefueltypeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int fuelid=Integer.parseInt(request.getParameter("fuelid"));
		String fuelname=request.getParameter("fuelname");
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		out.println("<link href='CSS/update.css' rel='stylesheet'>");
		out.println("<div class='col-md-8 col-sm-12 py-3'>");
		out.println("<center>");
		out.println("<form name='frm' action='Fuelfinalmachineupdate' method='get'>");
		out.println("<h1>Machine Inform</h1>");
		out.println("<input type='hidden' name='fuelid' value='"+fuelid+"'>");
		out.println("<input type='text' name='fuelname' placeholder='enter the machine code ' value='"+fuelname+"'><br><br>");
		out.println("<input type='submit' name='submit' value='update fuel'><br><br>");
		out.println("</form>");
		out.println("</center>");
		out.println("</div></div></div>");	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
