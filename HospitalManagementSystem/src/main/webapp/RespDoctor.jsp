<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.table{
border: 2px solid black ;
width:100vh;
margin-left:15vh;
}
h2{
margin-left:15vh;
}
.table th,
.table td,
.table tr{
border:2px solid black;
}
thead{
background-color: pink;
}
</style>
 <script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","searchDoctor.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
</head>
</head>
<body>
<%@include file="doctoradmindashboard.jsp"%>
<h2>Doctor details</h2>
<center><input type='text' name='name' value='' style='width:80%;height:50px;' onkeyup="searchByName(this.value)"/></center>
<br><br>
<div id="d">
 <table border='5' align='center' width='60%'>

<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Doctor name</th>
            <th scope="col">Contact</th>
              <th scope="col">Email</th>
            <th scope="col">Category</th>
    </tr>
  </thead>
 <tbody>
 <%
 DoctorService dService=new DoctorServiceImpl();
 List<doctormodel> list=dService.isviewDoctor();
 int count=0;
 for(doctormodel dmodel:list){
	
 %>
 <tr>
 <td><%=++count%></td>
 <td><%=dmodel.getName()%></td>
  <td><%=dmodel.getContact() %></td>
  <td><%=dmodel.getEmail() %></td>
    <td><%=dmodel.getCategory() %></td>
  
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