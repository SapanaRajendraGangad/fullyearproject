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
    	xhttp.open("GET","searchBill.jsp?n="+str,true)
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
 </style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<form name="frm" action="AddPatient.jsp" method="post">
<input type="submit" value="ADD">
</form>

<h1>medicine details</h1>
<input type='text' name='name' value='' id="sp" style='width:100%;height:50px;margin-left:15vh;' onkeyup="searchByName(this.value)"/>
<br><br>
<div id="d">
<table class="table">
  <thead>
    <tr>
      <th class="th" scope="col">sr.no</th>
      <th class="th" scope="col">patient name</th>
      <th class="th" scope="col">date</th>
            <th class="th" scope="col">Doctor Fees</th>
            <th class="th" scope="col">Room Fees </th>
            <th class="th" scope="col">Total</th>
               <th class="th" scope="col">Delete</th>
    </tr>
  </thead>
 <tbody>
 <%
DoctorService pService=new DoctorServiceImpl();
 List<Object[]> list=pService.isviewbill();
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
	<td><a href='deletebill?pid=<%=obj[5] %>'>Delete</a>
 
 
</tr>
 <%
 }
 %>
 </tbody>
 </div>
</table>
</div>
</div>
</div>
</div>


</body>
</html>