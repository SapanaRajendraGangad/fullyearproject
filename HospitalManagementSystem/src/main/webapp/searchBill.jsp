<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*,org.Hospital.admin.config.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border: 2px solid ;
width:120vh;
margin-left:15vh;
}
h2{
margin-left:15vh;
}
table th,
table td,
table tr{
border:2px solid black;
}
thead{
background-color: blue;
}
</style>
</head>
<body>
<%!
 Connection conn;
 PreparedStatement stmt;
 ResultSet rs;
%>
<%
 String name=request.getParameter("n");
Class.forName("com.mysql.cj.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","1234");
 if(conn!=null){
	stmt=conn.prepareStatement("select p.pid,p.pname,p.address,p.pdate,d.dname,p.age,dpm.Mname,d.did from doctor d inner join doctorpatientmedicinejoin dpm on d.did=dpm.did inner join patient p on p.pid=dpm.pid where pname like '%"+name+"%'");
	rs=stmt.executeQuery();
	out.println("<table>");
	out.println("<thead>");
	out.println("<tr>");
	     out.println("<th scope='col'>patient Id</th>");
	     out.println("<th scope='col'>patient Name</th>");
	      out.println("<th scope='col'>Date</th>");
	      out.println("<th scope='col'>Doctor Fees</th>");
	      out.println("<th scope='col'>Room Fees </th>");
	      out.println("<th scope='col'>Total</th>");
	      out.println("<th scope='col'>Delete</th>");
	     out.println("</tr>");
	     out.println("</thead>");
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getInt(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getInt(4)+"</td>");
		out.println("<td>"+rs.getInt(5)+"</td>");
		out.println("<td>"+rs.getInt(6)+"</td>");
		out.println(" <td><a href='deletebill?pid="+rs.getInt(1)+"'>Delete</td>");
		out.println("</tr>");
	}
	out.println("</table>");
 }
 else{
	 out.println("Database is not connected");
 }
%>

</body>
</html>