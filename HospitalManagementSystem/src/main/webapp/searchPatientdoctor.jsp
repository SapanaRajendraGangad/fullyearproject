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
width:150vh;
}

table th,
table td,
table tr{
border:2px solid black;
padding:6px;

}
thead{
background-color: pink;
color:white;
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
	stmt=conn.prepareStatement("select p.pid,p.pname,p.address,p.contact,p.age,p.gender,p.pdate,p.ptype,p.category,p.status,d.did from patient p inner join patientdoctorjoin pd on p.pid=pd.pid inner join doctor d on d.did=pd.did where p.pname like '%"+name+"%' or year(p.pdate)='"+name+"' or month(p.pdate)='"+name+"'");
	rs=stmt.executeQuery();
	out.println("<table>");
	out.println("<thead>");
	out.println("<tr>");
	     out.println("<th scope='col'> id</th>");
	     out.println("<th scope='col'> Name</th>");
	     out.println("<th scope='col'> Address</th>");
	      out.println("<th scope='col'> contact</th>");
	      out.println("<th scope='col'> Age</th>");
	      out.println("<th scope='col'> Gender</th>");
	      out.println("<th scope='col'> Date/th>");
	      out.println("<th scope='col'> Type</th>");
	      out.println("<th scope='col'> Category</th>");
	      out.println("<th scope='col'>Status</th>");
	      out.println("<th scope='col'>Medicine</th>");
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
		out.println("<td>"+rs.getInt(5)+"</td>");
		out.println("<td>"+rs.getString(6)+"</td>");
		out.println("<td>"+rs.getString(7)+"</td>");
		out.println("<td>"+rs.getString(8)+"</td>");
		out.println("<td>"+rs.getString(9)+"</td>");
		out.println("<td>"+rs.getString(10)+"</td>");
		out.println("<td><a href='prescription.jsp?pid="+rs.getInt(1)+"&did="+rs.getInt(11)+"'>Add Medicine</td>");
		out.println(" <td><a href='deletepatient?pid="+rs.getInt(1)+"'>Delete</td>");
		 out.println("<td><a href='updatepatient?pid="+rs.getInt(1)+"&pname"+rs.getString(2)+"&address="+rs.getString(3)+"&contact="+rs.getString(4)+"&age="+rs.getInt(5)+"&gender="+rs.getString(6)+"&pdate="+rs.getString(7)+"&ptype="+rs.getString(8)+"&category="+rs.getString(9)+"'>Update</td>");
		 
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