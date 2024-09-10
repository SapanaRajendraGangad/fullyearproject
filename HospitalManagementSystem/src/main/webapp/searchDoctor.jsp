<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*,org.Hospital.admin.config.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.table{
border: 2px solid ;
width:100%;
margin-left:15vh;
}
h1{
margin-left:15vh;
}
.table th,
.table td,
.table tr{
border:2px solid black;
}
thead{
background-color: blue;
}
input[type=submit]{
width:15vh;
height:5vh;
border-radius:5vh;
background-color: black;
color:white;
margin-left: 15vh;
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
	stmt=conn.prepareStatement("select *from doctor where dname like '%"+name+"%'");
	rs=stmt.executeQuery();
	out.println("<table>");
	out.println("<thead>");
	out.println("<tr>");
	     out.println("<th scope='col'>Doctor Id</th>");
	     out.println("<th scope='col'>Doctor Name</th>");
	      out.println("<th scope='col'>Doctor contact</th>");
	      out.println("<th scope='col'>Doctor email</th>");
	      out.println("<th scope='col'>Doctor Category</th>");
	      out.println("<th scope='col'>Delete</th>");
	     out.println("<th scope='col'>Update</th>");
	     out.println("</tr>");
	     out.println("</thead>");
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getInt(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getString(4)+"</td>");
		out.println("<td>"+rs.getString(5)+"</td>");
		out.println(" <td><a href='deletedoctor?doctorid="+rs.getInt(1)+"'>Delete</td>");
		 out.println("<td><a href='updatedoctor?did="+rs.getInt(1)+"&dname"+rs.getString(2)+"&contact="+rs.getString(3)+"&email="+rs.getString(4)+"&category="+rs.getString(5)+"'>Update</td>");
		 
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