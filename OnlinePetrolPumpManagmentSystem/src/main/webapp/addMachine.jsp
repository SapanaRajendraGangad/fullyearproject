<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.petrolpumpsystem.model.*,org.petrolpump.admin.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
margin:0;
padding: 0;
box-sizing: border-box;
}
.about{
border:2px solid black;
background-color:pink;
width:80vh;

margin-top:20vh;
margin-bottom: 20vh;
}
.control{
width:30vh;

border-box:10px;
}
.apti{
width:50vh;
height:10vh;
border-radius: 10vh;
}
input[type=submit]{
background-color: green;
border-radius: 10px;
width:25vh;
height:7vh;
}
</style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8  py-3">
<center>
<form name="frm" action="machineCode" method="get" class="about">
<br>
<h1>Machine Inform</h1>
<br>
<input type="text" name="Mcode" class="apti" placeholder="     Enter the machine code" value=""><br><br>
<table>
<%
FuelType fService=new FuelTypeImpl();
List<FuelTypeModel> list=fService.getAllFuelTypes();
for(FuelTypeModel p:list){
	%>
	<tr>
	<td><input type='checkbox'class='defaultCheckbox'  name='ftype' value='<%=p.getFid()%>'/>&nbsp;&nbsp;&nbsp;<%=p.getFuelName()%></td>
	<td align='right'><input type='text'  name='capacity' value=''/></td>
	</tr>
	<% 
}
%>
</table>
<br>
<input type="submit" name="submit" value="Add machine"><br><br>
</form>
</center>
</div>
</div>
</div>
</div>
</body>
</html>


