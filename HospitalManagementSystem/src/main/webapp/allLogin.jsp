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
.container{
height:650px;
width:100%;
background-image: url("images/alllogin.jpg");
background-position: center;
background-size: cover;
background-repeat: no-repeat;
}
.myside{
height:80px;
width:100%;
}
.b1{
height:200px;
width:80%;
margin:0 auto;
display:flex;
}
.box1{
height:250px;
width:20%;
margin-left:150px;
flex:right;
border:2px solid black;
background-color:blue;
border-radius:10vh;
}
.box2{
height:250px;
width:20%;
margin-left:300px;
flex:left;
border:2px solid black;
background-color:blue;
border-radius:10vh;
}
.box img{
height:100px;
width:40%;
}
.box3{
margin-left:550px;
height:200px;
width:200px;
background-color:blue;
border:2px solid black;
border-radius:10vh;
}
.box3 img{
height:200px;
width:80%;
}
.box1 h1{
margin-left:4vh;
}
.box2 h1{
margin-left:10vh;
}
.box3 h1{
margin-left:50px;
}

</style>
</head>
<body>

<div class="container">

<div class="myside">
</div>
<div class="box3">
<a href="Login.jsp"><img alt="" src="<%="images/admin1-removebg-preview (1).png"%>"></a>
<h1>Admin</h1>

</div>
<div class="b1">
<div class="box1">
<a href="ReceptioniestLogin.jsp"><img alt="" src="<%="images/rec-removebg-preview.png"%>"></a>
<br><br>
<h1>Receptionist</h1>
</div>
<div class="box2">
<a href="DoctorLogin.jsp"><img href="DoctorLogin.jsp" src="<%="images/doctor1-removebg-preview.png"%>"></a>
<br><br>
<h1>Doctor</h1>
</div>
</div>
</div>
</body>
</html>