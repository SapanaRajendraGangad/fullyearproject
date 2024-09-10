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
background-color:lightyellow;
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
FuelType fuelservies=new FuelTypeImpl();
%>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<br><br><br><br>
<h1>Fuel details</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Fuel Type</th>
            <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  List<FuelTypeModel> list=fuelservies.getAllFuelTypes();
  int count=0;
  for(FuelTypeModel m:list){
  %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%=m.getFuelName()%></td>
      <td><a href='delete?fuelid=<%=m.getFid()%>'>DELETE</a></td>
      <td><a href='Update?fuelid=<%=m.getFid()%>&fuelname=<%=m.getFuelName()%>'>UPDATE</a></td>
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