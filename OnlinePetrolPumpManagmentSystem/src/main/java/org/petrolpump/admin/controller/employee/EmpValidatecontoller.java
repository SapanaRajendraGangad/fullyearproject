package org.petrolpump.admin.controller.employee;

import java.io.IOException;
import java.io.PrintWriter;
import org.petrolpump.admin.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/validate")
public class EmpValidatecontoller extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("email");
		String pass=request.getParameter("contact");
		EmpServise empService=new EmpServiceImpl();
		int result=empService.VerifyEmployee(userName, pass);
		if(result!=0) {
			HttpSession session=request.getSession(true);
			session.setAttribute("employeeid", result);
			out.println("<h1>login sucess</h1>");
		}
		else {
			out.println("<h1>Employee not login sucessfully...</h1>");
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
