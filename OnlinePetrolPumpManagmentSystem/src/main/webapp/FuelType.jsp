<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form{
border:2px solid black;
background-color:Lemonchiffon;
width:80vh;
height:40vh;
margin-top:20vh;
}
input{
margin-top:50vh;
width:50vh;
height:10vh;
border-radius:3vh;

}
</style>
</head>
<body>
<%@include file="admindashboard.jsp"%>
<div class="col-md-8 col-sm-12 py-3">
<center>
<form name="frm" action="fueltype" method="get">
<h1>Fuel Information</h1>
<input type="text" name="fueltype" placeholder="     Enter the Fuel type" value=""><br><br>
<input type="submit" name="submit" value="Add Fuel"><br><br>
</form>
</center>
</div>
</body>
</html>


