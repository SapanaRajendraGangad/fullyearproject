<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/adminStyle.css" rel="stylesheet">
<link href="CSS/login.css" rel="stylesheet">

</head>
<body>
<div class='Container'>
<form action="validate" name="frm" method="post">
<ul class='subContainer'>
<li><input type='text' name='email' value='' placeholder='enter email as user name' class='controler'/></li>
<li><input type='text' name='contact' value='' placeholder='enter contact as pasword' class='controler'/></li>
<li><input type='submit' name='s' value='login' /></li>

</ul>
</form>
</div>
</body>
</html>