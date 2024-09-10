<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/adminStyle.css" rel="stylesheet">
<style>
.sidebar{
background-image: url("images/doctor.jpg");
width:100%;
height:120vh;
background-repeat: no-repeat;
background-size: cover;
}
.bt{
height:35vh;
width:100%;
display:flex;

}
.box{
height:50vh;
width:100%;
display:flex;

}
.b1{
height:50vh;
width:20%;
flex: right;
background-color: white;
margin-left:40px;
}
.b2{
height:50vh;
width:20%;
flex: right;
background-color: white;
margin-left:40px;
}
.b3{
height:50vh;
width:20%;
flex: right;
background-color: white;
margin-left:40px;
}
.b4{
height:50vh;
width:20%;
flex: right;
background-color: white;
margin-left:40px;
}
img{
margin:60px 80px;
}
h2{
margin-left:20px;
}
p{
margin-left:20px;
}
</style>
</head>
<body>
<div class='mypage'>
<div class='menu-bar'>
<div class='logo'>
<h1>🏣 Hospital🏣 </h1>
</div>
<div class='menu'>
<ul>
<li><a href="logindashboard.jsp">Home</a></li>
<li><a href="contact.jsp">contact</a></li>
<li><a href="AboutUs.jsp">about us</a></li>
<li><a href="service.jsp">facility</a></li>
<li><a href="allLogin.jsp">Login</a></li></div>
</div>

<div class='sidebar'>
<div class="bt"></div>
<div class="box">
<div class="b1">
<img src="images/doctor.png">
<h2>Qualified Doctors</h2>
<p>Even the all powerful pointing has no control about the blind texts it is an almost unorthographic</p>
</div>
<div class="b2">
<img src="images/ambulance.png">
<h2>Emergency Care</h2>
<p>Even the all powerful pointing has no control about the blind texts it is an almost unorthographic</p>
</div>
<div class="b3">
<img src="images/tetoscope.png">
<h2>Outdoor Cheakup</h2>
<p>Even the all powerful pointing has no control about the blind texts it is an almost unorthographic</p>
</div>
<div class="b4">
<img src="images/watch.png">
<h2>24hours service</h2>
<p>Even the all powerful pointing has no control about the blind texts it is an almost unorthographic</p>
</div>
</div>
</div>
</div>
</body>
</html>