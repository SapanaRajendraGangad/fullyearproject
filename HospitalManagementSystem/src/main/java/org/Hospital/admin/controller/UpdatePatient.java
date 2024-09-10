
package org.Hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/updatepatient")
public class UpdatePatient extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int pid=Integer.parseInt(request.getParameter("pid"));
	String name=request.getParameter("pname");
	String address=request.getParameter("address");
	String contact=request.getParameter("contact");
	int age=Integer.parseInt(request.getParameter("age"));
	String gender=request.getParameter("gender");
	String pdate=request.getParameter("pdate");
	String ptype=request.getParameter("ptype");
	String category=request.getParameter("category");
	String Status=request.getParameter("status");
	RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
	r.include(request, response);
	out.println("<link href='CSS/upd01.css' rel='stylesheet'>");
	out.println("<div class='col-md-8 col-sm-12 py-3'>");
	out.println("<center>");
	out.println("<form name='frm' action='finalupdpatient' method='get'>");
	out.println("<h1>Patient Inform</h1>");
	out.println("<input type='hidden' name='pid' value='"+pid+"'>");
	out.println("<label>Name</label>");
	out.println("<input type='text' name='pname' value='"+name+"'><br><br>");
	out.println("<label>address</label>");
	out.println("<input type='text' name='address'  value='"+address+"'><br><br>");
	out.println("<label>contact</label>");
	out.println("<input type='text' name='contact' value='"+contact+"'><br><br>");
	out.println("<label>age</label>");
	out.println("<input type='text' name='age'  value='"+age+"'><br><br>");
	out.println("<label>gender</label>");
	out.println("<input type='text' name='gender'  value='"+gender+"'><br><br>");
	out.println("<label>pdate</label>");
	out.println("<input type='text' name='pdate' value='"+pdate+"'><br><br>");
	out.println("<label>ptype</label>");
	out.println("<input type='text' name='ptype'  value='"+ptype+"'><br><br>");
	out.println("<label>category</label>");
	out.println("<input type='text' name='category'  value='"+category+"'><br><br>");
	out.println("<label>status</label>");
	out.println("<input type='text' name='status' value='"+Status+"'><br><br>");
	out.println("<input type='submit' name='submit' value='update patient'><br><br>");
	out.println("</form>");
	out.println("</center>");
	out.println("</div></div></div>");				
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
}
}