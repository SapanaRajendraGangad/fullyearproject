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
background-color:#C39BD3;
width:80vh;
height:88vh;
margin-top:5vh;
}
.about :hover{
background-color: black;
color: white;
font-family: fantasy;
}
.control{
width:30vh;
height: 10vh;
}
.apti{
width:50vh;
height:8vh;
border-radius: 10vh;
}
input[type=submit]{
background-color: yellow;
border:5px solid black;
border-radius: 20px;
width:25vh;
height:7vh;
}
input[type=submit]:hover{
background-color: aqua;
}
</style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<center>
<form name="frm" action="addemp" method="get" class="about">
<br>
<h1>Employee Login form</h1>
<br>
<input type="text" name="name" class="apti" placeholder="     Enter the Name of Employee" value=""><br><br>
<input type="text" name="email" class="apti" placeholder="     Enter the email" value=""><br><br>
<input type="text" name="contact" class="apti" placeholder="     Enter the contact" value=""><br><br>
<input type="text" name="address" class="apti" placeholder="     Enter the Address" value=""><br><br>
<input type="text" name="sal" class="apti" placeholder="     Enter the salary" value=""><br><br>

<br>
<input type="submit" name="submit" value="Add Employee"><br><br>
</form>
</center>
</div>
</body>
</html>


