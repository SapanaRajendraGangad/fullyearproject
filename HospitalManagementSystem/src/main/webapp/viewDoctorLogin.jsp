<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border: 2px solid ;
width:150vh;
margin-left:15vh;
border-collapse:collapse;
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

</head>
<body>
<h1>Patient  details</h1><br>
<center><input type='text' name='name' value='' style='width:90%;height:50px;margin-left:15vh;' onkeyup="searchByName(this.value)"/></center>
<br><br>
<div id="d">
<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">Patient name</th>
       <th scope="col">Address</th>
            <th scope="col">Contact</th>
             <th scope="col">Age</th>
              <th scope="col">gender</th>
              <th scope="col">pdate</th>
            <th scope="col">ptype</th>
             <th scope="col">category</th>
              <th scope="col">status</th>
                <th scope="col">Time</th>
               <th scope="col">Add Medicine</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
 <tbody>
 <%
 int did=Integer.parseInt(session.getAttribute("did").toString());
 
 DoctorService dService=new DoctorServiceImpl();
 List<Object[]> list=dService.isviewdoctorwisepatient(did);
 int count=0;
 for(Object obj[]:list){
	
 %>
 <tr>
 <td><%=++count%></td>
 <td><%=obj[0]%></td>
  <td><%=obj[1] %></td>
  <td><%=obj[2] %></td>
    <td><%=obj[3] %></td>
    <td><%=obj[4] %></td>
    <td><%=obj[5] %></td>
    <td><%=obj[6] %></td>
    <td><%=obj[7] %></td>
    <td><%=obj[8] %></td>
     <td><%=obj[10] %></td>
    <td><a href='prescription.jsp?pid=<%=obj[9] %>&did=<%=did %>'>Add medicine</a>
  <td><a href='updatedoctor?did=<%=obj[9]%>&dname=<%=obj[0]%>&Adress=<%=obj[1]%>&Contact=<%=obj[2]%>
  &Age=<%=obj[3]%>&Gender=<%=obj[4]%>&pdate=<%=obj[5]%>&ptype=<%=obj[6]%>&category=<%=obj[7]%>&Status=<%=obj[8]%>'>Update</td>
 
</tr>
 <%
 }
 %>
 </tbody>
</table>
</div>
</body>
</html>