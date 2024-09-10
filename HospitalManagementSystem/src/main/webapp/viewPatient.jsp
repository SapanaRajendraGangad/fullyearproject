<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
<script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","searchPatientdoctor.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
 <style>
.table{
border: 2px solid ;
width:100vh;
}
.table th,
.table td,
.table tr{
border:2px solid black;
}
thead{
background-color: pink;
color:white;
}
input[type=submit]{
width:20vh;
height:5vh;
border-radius:5vh;
background-color: black;
color:white;
}
 </style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<form name="frm" action="AddPatient.jsp" method="post">
<input type="submit" value="ADD">
</form>
<h1>Patient details</h1>
<input type='text' name='name' value='' id="sp" style='width:100%;height:50px;' onkeyup="searchByName(this.value)"/>
<br><br>
<div id="d">
<table class="table">
  <thead>
    <tr>
      <th class="th" scope="col">sr.no</th>
      <th class="th" scope="col">patient name</th>
      <th class="th" scope="col">Address</th>
            <th class="th" scope="col">Contact</th>
            <th class="th" scope="col">Age</th>
            <th class="th" scope="col">gender</th>
            <th class="th" scope="col">Date</th>
            <th class="th" scope="col">Type</th>
            <th class="th" scope="col">Category</th>
           <th class="th" scope="col">Doctor name</th>
            <th class="th" scope="col">Status</th>
             <th class="th" scope="col">Medicine</th>
               <th class="th" scope="col">Bill</th>
               <th class="th" scope="col">Delete</th>
      <th class="th" scope="col">Update</th>
    </tr>
  </thead>
 <tbody>
 <%
PatientService pService=new PatientServiceImpl();
 List<Object[]> list=pService.ispatientdctor();
 int count=0;
 for(Object obj[]:list){
 
 %>
<tr>
 <td><%=++count%></td>
 <td><%=obj[0]%></td>
   <td><%=obj[1] %></td>
  <td><%=obj[2]%></td>
  <td><%=obj[3]%></td>
  <td><%=obj[4]%></td>
  <td><%=obj[5]%></td>
    <td><%=obj[6] %></td>
      <td><%=obj[7]%></td>
      <td><%=obj[8]%></td>
       <td><%=obj[11]%></td>
	<td><a href='AllocateMedicine?pid=<%=obj[9] %>&did=<%= obj[10]%>'>Add Medicine</td>
	<td><a href='bill.jsp?pid=<%=obj[9] %>'>Add Bill</td>
	<td><a href='deletepatient?pid=<%=obj[9] %>'>Delete</a>
  <td><a href='updatepatient?pid=<%=obj[9]%>&pname=<%=obj[0]%>&address=<%=obj[1] %>
  &contact=<%=obj[2]%>&age=<%=obj[3] %>&gender=<%=obj[4] %>
  &pdate=<%=obj[5]%>&ptype=<%=obj[6] %>&category=<%=obj[7]%>&status=<%=obj[11]%>'>Update</td>
 
</tr>
 <%
 }
 %>
 </tbody>
 </div>
</table>
<form name="frm" action="viewmedicine.jsp" method="post">
<input type="submit" value="view prescription">
</form>
<br><br>
<form action="viewBill.jsp" name="frm" method="post">
<input type ="submit" name="s" value="view Bill" >
</form>
</div>
</div>
</div>
</div>


</body>
</html>