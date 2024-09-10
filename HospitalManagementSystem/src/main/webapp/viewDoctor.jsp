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
<body>

<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<form name="frm" action="AddDoctor.jsp" method="post">
<input type="submit" value="ADD">
</form>
<h1>Doctor details</h1><br>
<center><input type='text' name='name' value='' style='width:90%;height:50px;margin-left:15vh;' onkeyup="searchByName(this.value)"/></center>
<br><br>
<div id="d">
 <table border='5' width='100%'>

<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Doctor name</th>
            <th scope="col">Contact</th>
              <th scope="col">Email</th>
            <th scope="col">Category</th>
           <th scope="col">Time</th> 
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
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
     <td><%=dmodel.getTime()%></td>
  <td><a href='deletedoctor?doctorid=<%=dmodel.getId() %>'>Delete</td>
  <td><a href='updatedoctor?did=<%=dmodel.getId()%>&dname=<%=dmodel.getName()%>&contact=<%=dmodel.getContact()%>&email=<%=dmodel.getEmail() %>&category=<%=dmodel.getCategory()%>&time=<%=dmodel.getTime()%>'>Update</td>
 
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