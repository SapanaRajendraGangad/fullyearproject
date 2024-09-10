<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
margin:0;
padding:0;
box-sizing: border-box;
}
form{
height:40vh;
width:80vh;
margin:17vh 70vh;
background-color: blue;
padding: 4vh;
}
.all{
height:700px;
width:100%;
background-image: url("images/medicine.jpg");
background-position: center;
background-repeat: no-repeat;
background-size: cover;
}
input{
height:5vh;
width:60vh;
}
input[type=submit]{
height:5vh;
width:20vh;
border-radius: 6vh;
background-color: black;
color:white;
}
h2{
color: white;
}
</style>
</head>
<body>
<%
int did=Integer.parseInt(request.getParameter("did"));
int pid=Integer.parseInt(request.getParameter("pid"));
%>
<div class="all">
 <%@include file="admindashboard.jsp"%>
 <div class="col">
<form action="finalprescription" name="frm" method="post">
<h2>Add Medicine</h2>
<input type="hidden" name="pid"  value='"+pid+"'/>
<input type="hidden" name="did"  value='"+did+"'/>
<label style="color:white;">Medicine  Name:</label><br>
<input type="text" name="Mname" placeholder="Enter the name of Medicine" value=""/><br><br>
<input type="submit" name="submit" value="Add Madicine" >
</form>
</div>
</div>
</div>
 </div>
</body>
</html>