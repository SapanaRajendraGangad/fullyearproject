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
background-color:lightblue;

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
<%!
MachineService machineservice=new MachineServiceImpl();
%>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<br><br><br><br>
<h1>Machine details</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Machine code</th>
            <th scope="col">Fuel Type</th>
            <th scope="col">Capacity</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=machineservice.getAllMachines();
  int count=0;
  for(Object []obj:list){
  %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%=obj[0]%></td>
      <td><%=obj[1]%></td>
      <td><%=obj[2]%></td>
      <td><a href='del?machineid=<%=obj[3]%>'>DELETE</a></td>
      <td><a href='updmachine?mid=<%=obj[3]%>&mcode=<%=obj[0].toString()%>'>UPDATE</a></td>
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