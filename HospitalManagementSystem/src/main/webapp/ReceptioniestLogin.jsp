<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
padding:0;
margin:0;
box-sizing:border-box;
}
.form{
width:60vh;
height:40vh;
background-color: blue;
margin:22vh 10vh;
}
.box{
height:5vh;
width:50vh;
margin-left:5vh;
margin-top:5vh;
}
button{
margin-left: 20vh;
padding:2vh;
width:20vh;
}
.main{
height:800px;
width:100%;
background-image: url("images/rep.jpg");
background-repeat: no-repeat;
background-size: cover;
background-position: center;
}
.myheader{
background-color: blue;
height:15vh;
font-size:5vh;
width: 100%;
}
.myheader img{
height:80px;
width:90px;
padding-top:8px;
margin-right:20vh;
}

</style>
</head>
<body>
<div class="main">
<div class="myheader">
<h1><img src="images/logo.jpg">Hospital Management System</h1>
</div>
<div class="head1">
<form name="frm" action="RecepLogin" class="form mt-5" method="POST">
<h1>Receptioniest login form</h1>
 <input type='email' name='pass' placeholder='Enter the username' value='' class='box'/><br>
<input type='password' name='Username' placeholder='Enter the password' value='' class='box'/><br><br> 
<button  value="Login">Login</button>
</form>
</div>
</div>
</body>
</html>