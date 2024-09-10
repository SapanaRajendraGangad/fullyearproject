package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllocateMedicine")
public class AllocateMedicine extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int did=Integer.parseInt(request.getParameter("did"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		out.println("<link href='CSS/upd.css' rel='stylesheet'>");
		out.println("<style>");
		out.println(".all");
		out.println("background-image: url(images/medicine.jpg)");
		out.println("background-position: center");
		out.println("background-repeat: no-repeat");
		out.println("background-size: cover");
		out.println("</style>");
		out.println("<div class=all");
		out.println("<div class='col-md-8 col-sm-12 py-3'>");
		out.println("<form name='frm' action='finalprescription' method='get'>");
		out.println("<h1>medicine Inform</h1>");
		out.println("<input type='hidden' name='did' value='"+did+"'>");
		out.println("<input type='hidden' name='pid' value='"+pid+"'>");
		out.println("<label style=\"color:white;\">Medicine  Name:</label><br>");
		out.println("<input type='text' name='medicinename' placholder:'Enter the name of medicine' value=''><br><br>");
		out.println("<input type='submit' name='submit' value='add medicine'><br><br>");
		out.println("</form>");
		out.println("</div></div></div></div>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
