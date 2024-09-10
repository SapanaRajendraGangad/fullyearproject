<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
}

.form {
    width: 60%;
    max-width: 800px;
    margin: 5vh auto;
    background-color: blue;
    padding: 4vh;
    border-radius: 10px;
}

input, select, button {
    width: 100%;
    height: 5vh;
    border-radius: 5px;
    margin-bottom: 2vh;
    padding: 0 10px;
    border: none;
    font-size: 1rem;
}

input[type=submit] {
    width: 100%;
    border-radius: 5vh;
    background-color: black;
    color: white;
    margin-top: 2vh;
}

.button-wrapper {
    text-align: center;
}

button {
    width: auto;
    padding: 0 20px;
    background-color: black;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s ease;
    border-radius: 5vh;
}

.btn {
    margin-left: 20%;
    width:15%;
}

button:hover {
    background-color: #333;
}

label {
    color: white;
    display: block;
    margin-bottom: 0.5vh;
}

h3 {
    color: white;
    text-align: center;
    margin-bottom: 2vh;
}

.side {
    display: flex;
    justify-content: space-between;
    margin-top: 2vh;
    margin-left: 50px;
}

.side > div {
    flex: 0 0 30%;
    margin: 0 3%;
    align-items: center;
}

.side form {
    width: 100%;
}

.side form input[type=submit] {
    width: 60%;
    height: 7vh;
    border-radius: 5vh;
    background-color: black;
    color: white;
    padding: 5px;
    margin: 0;
    font-size: 1rem;
    align-items: center;
}

@media (max-width: 768px) {
    .form {
        width: 95%;
        padding: 2vh;
    }
    input, select, button {
        height: 6vh;
    }
    .side {
        flex-direction: column;
        margin-left: 0;
    }
    .side form {
        width: 100%;
        margin-bottom: 2vh;
    }
    .side form input[type=submit] {
        width: 100%;
    }
    .btn {
        margin-left: 0;
    }
}

@media (max-width: 480px) {
    input, select {
        height: 6vh;
        font-size: 1em;
        width: 100%;
    }
    button, input[type=submit] {
        width: 100%;
    }
    .side form {
        margin-bottom: 1vh;
    }
}
.btn{
   
	display: flex;
	align-items: center;
}
</style>
</head>
<body>
 <%@include file="admindashboard.jsp"%>
 <div class="col">
<form action="AddRecptionestController" name="frm" class="form" method="post" style="#1abc9c">
<h1>Add Receptionist</h1>
<label>Name:-   </label>
<input type="text" name="rname" placeholder="Enter the name of receptionist" value=""/><br><br>
<label>Email:-  </label>
<input type="text" name="email" placeholder="Enter the Email of receptionist" value=""/><br><br>
<label>Contact:-</label>
<input type="text" name="contact" placeholder="Enter the Contact of receptionist" value=""/><br><br>
<button value="add Receptionist" >Add Receptionist</button>
</form>
<div class="btn">
	<form action="viewReceptionest.jsp" name="frm" method="post">
		<input type ="submit" action="viewDoctor.jsp" value="view" >
	</form>
</div>

</div>
</div>
 </div>
</body>
</html>