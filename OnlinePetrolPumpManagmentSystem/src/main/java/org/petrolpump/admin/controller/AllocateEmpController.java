package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.petrolpump.admin.service.*;
import java.util.*;
@WebServlet("/Allocatemachine")
public class AllocateEmpController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		MachineService mservies= new MachineServiceImpl();
		List<Object[]>list=mservies.getAllMachines();
		LinkedHashMap <Integer,String>hs=new LinkedHashMap<Integer,String>();
		for(Object obj[]:list) {
			hs.put((Integer)obj[3], obj[0].toString());
		}
		int empId=Integer.parseInt(request.getParameter("eid"));
		String empName=request.getParameter("empName");
		out.println("<link href='CSS/allocate.css' rel='stylesheet'>");
		out.println("<div class='col-md-8 col-sm-12 py-3'>");
		out.println("<h3  class='myheading'>Hey "+empName+" we are going to allocate machine</h3>");
	//	out.println("<center>");
		out.println("<form name='frm' action='allocatemachine' method='POST' class='myform'>");
		out.println("<input type='hidden' name='empid' value='"+empId+"'/>");
		out.println("<h1>Machine Inform</h1>");
		out.println("<select name='mcode'>");
		out.println("<option>select machine</option>");
	    Set<Map.Entry<Integer, String>> s=hs.entrySet();
	
		for(Map.Entry<Integer, String>m:s) {
			out.println("<option value='"+m.getKey()+"'>");
			out.println(m.getValue());
			out.println("</option>");
		}
		out.println("</select>");
		//out.println("<br><br>");
		out.println("<input type='time' name='Starttime'  value=''/><br><br>");
		out.println("<input type='time' name='EndTime'  value=''/><br><br>");
		out.println("<input type='date' name='Date' value=''/><br><br>");

		out.println("<input type='submit' name='submit' value='Allocate machines'/><br><br>");
		out.println("</form>");
		//out.println("</center>");
		out.println("</div></div></div>");	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
