package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateReceptioniest")
public class UpdateReceptioniest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int rid=Integer.parseInt(request.getParameter("rid"));
		String rname=request.getParameter("rname");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		out.println("<link href='CSS/update02.css' rel='stylesheet'>");
		out.println("<div class='col-md-8 col-sm-12 py-3'>");
		out.println("<form name='frm' action='FinalRecepUpdate' method='get'>");
		out.println("<h1>Receptioniest Inform</h1>");
		out.println("<input type='hidden' name='rid' value='"+rid+"'><br>");
		out.println("<label>Receptioniest Name:</label><br>");
		out.println("<input type='text' name='rname' value='"+rname+"'><br>");
		out.println("<label>Email:</label><br>");
		out.println("<input type='text' name='email' value='"+email+"'><br>");
		out.println("<label>Contact:</label><br>");
		out.println("<input type='text' name='contact' value='"+contact+"'><br><br>");
		out.println("<input type='button' name='submit' value='Update'><br><br>");
		out.println("</form>");
		out.println("</div></div></div>");				
  	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
