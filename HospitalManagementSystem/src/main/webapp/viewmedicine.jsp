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
    	xhttp.open("GET","searchPatient.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
 <style>
.table{
border: 2px solid ;
width:100vh;
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
}
.side{
display: flex;
}
.s1{
flex:right:
}
.s2{
flex:left;
}
 </style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<h1>Bill details</h1>
<input type='text' name='name' value='' id="sp" style='width:100%;height:50px;margin-left:15vh;' onkeyup="searchByName(this.value)"/>
<br><br>
<div id="d">
<table class="table">
  <thead>
    <tr>
      <th class="th" scope="col">sr.no</th>
      <th class="th" scope="col">patient name</th>
      <th class="th" scope="col">Address</th>
            <th class="th" scope="col">pdate</th>
            <th class="th" scope="col">Doctor </th>
            <th class="th" scope="col">age</th>
            <th class="th" scope="col">medicine</th>
           <th class="th" scope="col">Add medicine</th>
               <th class="th" scope="col">Delete</th>
    </tr>
  </thead>
 <tbody>
 <%
DoctorService pService=new DoctorServiceImpl();
 List<Object[]> list=pService.isviewmedicine();
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
    <td><a href='AllocateMedicine?pid=<%=obj[6] %>&did=<%= obj[7]%>'>Add Medicine</td>
	<td><a href='deletemedicine?medicine=<%=obj[5] %>&pid=<%=obj[6]%>'>Delete</a>
 
 
</tr>
 <%
 }
 %>
 </tbody>
 </div>
</table>
<div class="side">
<form action="viewPatient.jsp" class="s1" name="frm" method="post">
<input type ="submit"  value="view patient" >
</form>
<form action="viewBill.jsp" class="s2" name="frm" method="post">
<input type ="submit" value="view Bill" >
</form>
<form action="AddPatient.jsp" class="s1" name="frm" method="post">
<input type ="submit"  value="Add Patient" >
</form>
</div>
</div>
</div>
</div>


</body>
</html>