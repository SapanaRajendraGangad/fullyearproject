<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        .head {
            height: 12vh;
            width: 100%;
            background-color: blue;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .head h1 {
            color: white;
        }
        .allpage {
            height: 100vh;
            width: 100%;
            background-image: url("images/receplogin.jpg");
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        form {
            width: 60vh;
            max-width: 90%;
            height: auto;
            background-color: blue;
            padding: 2vh;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            
        }
        .box {
            width: 50vh;
            max-width: 90%;
            height: 5vh;
            margin: 1vh 0;
            padding: 0 10px;
            border: none;
            border-radius: 5px;
        }
        button {
            margin-top: 2vh;
            padding: 2vh;
            width: 20vh;
            max-width: 50%;
            background-color: black;
            color: white;
            border: none;
            border-radius: 5vh;
        }
        form h1 {
            margin-bottom: 2vh;
            color: white;
        }
        label {
            color: white;
            width: 100%;
            margin: 1vh 0;
        }
        .my {
            height: 25vh;
        }
        @media (max-width: 768px) {
            .head h1 {
                padding-left: 0;
                padding-top: 1vh;
                text-align: center;
                font-size: 1.5em;
            }
            form {
                width: 80%;
                padding: 2vh 4vh;
            }
            .box, button {
                width: 100%;
                max-width: none;
            }
        }
        @media (max-width: 480px) {
            .head h1 {
                font-size: 1.2em;
            }
            form h1 {
                font-size: 1.5em;
            }
            .box, button {
                height: 6vh;
                font-size: 1em;
            }
        }
    </style>
</head>
<body>
<div class="head">
<h1>Hospital Management System</h1>
</div>
<div class="allpage">
<div class="my"></div>
<form name="frm" action="DoctorLogin" method="POST">
<h1>Doctor login form</h1>
<label style="color:white;margin-left: 5vh;">User Name:</label>
 <input type='email' name='name' placeholder='Enter the username' value='' class='box'/>
 <label style="color:white;margin-left: 5vh;">Password:</label>
<input type='password' name='pass' placeholder='Enter the password' value='' class='box'/>
<button  value="Login">Login</button>
</form>
</div>
</body>
</html>