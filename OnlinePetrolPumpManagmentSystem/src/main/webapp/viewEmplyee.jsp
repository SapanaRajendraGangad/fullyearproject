<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.petrolpump.admin.service.*,java.util.*,org.petrolpumpsystem.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.table{
border: 2px solid ;
background-color:lightpink;
width:100vh;
}
.table th,
.table td,
.table tr{
border:2px solid black;
}
</style>
</head>
<body>

<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<br><br><br><br>
<h1>Machine details</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Employee name</th>
            <th scope="col">Contact</th>
            <th scope="col">Allocate machine</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
 <tbody>
 <%
 EmpServise empService=new EmpServiceImpl();
 List<EmployeeModel> list=empService.getAllEmployee();
 for(EmployeeModel emodel:list){
	 int count=0;
 %>
 <tr>
 <td><%=++count%></td>
 <td><%=emodel.getName()%></td>
  <td><%=emodel.getContact() %></td>
  <td><a href='Allocatemachine?eid=<%=emodel.getId()%>&empName=<%=emodel.getName()%>'>Allocate Machine</a></td>
  <td><a href=''>Delete</td>
  <td><a href=''>Update</td>
 
</tr>
 <%
 }
 %>
 </tbody>
</table>
</div>
</div>
</div>
</div>
</body>
</html>