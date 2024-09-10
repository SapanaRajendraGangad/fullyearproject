package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatedoctor")
public class UpdateDoctor extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int did=Integer.parseInt(request.getParameter("did"));
		String name=request.getParameter("dname");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String category=request.getParameter("category");
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		out.println("<link href='CSS/update.css' rel='stylesheet'>");
		out.println("<div class='col-md-8 col-sm-12 py-3'>");
		out.println("<center>");
		out.println("<form name='frm' action='FinalUpdateDoctor' method='get'>");
		out.println("<h1>Doctor Inform</h1>");
		out.println("<input type='hidden' name='did' value='"+did+"'>");
		out.println("<input type='text' name='name' placeholder='enter the name of doctor ' value='"+name+"'><br><br>");
		out.println("<input type='text' name='contact' placeholder='enter the contact of doctor ' value='"+contact+"'><br><br>");
		out.println("<input type='text' name='email' placeholder='enter the email of doctor ' value='"+email+"'><br><br>");
		out.println("<input type='text' name='category' placeholder='enter the category of doctor' value='"+category+"'><br><br>");
		out.println("<input type='submit' name='submit' value='update Doctor'><br><br>");
		out.println("</form>");
		out.println("</center>");
		out.println("</div></div></div>");				
  	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
