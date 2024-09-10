<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.table {
    border: 2px solid black;
    background-color: lightnavy;
    width: 100%;
    margin: 5vh auto;
    overflow-x: auto;
}

.table th,
.table td {
    border: 2px solid black;
    padding: 1vh;
    text-align: center;
}

form {
    margin-top: 10vh;
    
}

input[type=submit] {
    width: 15vh;
    height: 5vh;
    border-radius: 5vh;
    background-color: black;
    color: white;
   
    cursor: pointer;
}

thead {
    background-color: blue;
}

h1 {
    text-align: center;
    margin-top: 2vh;
}

@media (max-width: 768px) {
    .table {
        width: 95%;
        margin: 2vh auto;
    }
    input[type=submit] {
        width: 80%;
        height: 6vh;
        margin: 2vh auto;
    }
    form {
        margin-top: 5vh;
    }
}

@media (max-width: 480px) {
    input[type=submit] {
        width: 100%;
        height: 7vh;
        margin: 2vh auto;
    }
    .table th, .table td {
        font-size: 0.8rem;
    }
}
</style>
</head>
<body>

<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<form name="frm" action="AddReceptioniest.jsp" method="post">
<input type="submit" value="ADD">
</form>
<h1>Receptioniest  details</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">sr.no</th>
      <th scope="col">rid</th>
      <th scope="col"> name</th>
      <th scope="col"> email</th>
      <th scope="col"> contact</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
 <tbody>
 <%
 ReceptionestServies pService=new ReceptionestServiesImpl();
 List<RecepModel> list=pService.viewReceptionest();
 int count=0;
 
 for(RecepModel pmodel:list){
 %>
 <tr>
 <td><%=++count%></td>
 <td><%=pmodel.getRid()%></td>
 <td><%=pmodel.getRname()%></td>
  <td><%=pmodel.getEmail()%></td>
   <td><%=pmodel.getContact()%></td>
  <td><a href='DeleteRecepController?rid=<%=pmodel.getRid() %>'>Delete</td>
  <td><a href='UpdateReceptioniest?rid=<%=pmodel.getRid()%>&rname=<%=pmodel.getRname()%>&email=<%=pmodel.getEmail()%>&contact=<%=pmodel.getContact()%>'>Update</td>
 
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