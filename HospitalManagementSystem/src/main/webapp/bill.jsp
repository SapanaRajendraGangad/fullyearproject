<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function add(){
	var a=document.getElementById("r").value;
	var b=document.getElementById("f").value;
	var c=parseInt(a)+parseInt(b);
	document.getElementById("l").value=c;
}
</script>
<style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .all {
            height: 100vh;
            width: 100%;
            background-image: url("images/bill.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
        }
        .menu {
            height: 15vh;
            width: 100%;
            background-color: blue;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .menu h1 {
            color: white;
        }
        form {
            max-width: 90%;
            width: 500px;
            background-color: blue;
            margin: 5vh auto;
            padding: 20px;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            align-items: flex-start;
        }
        input, select {
            height: 50px;
            width: calc(100% - 20px);
            margin: 10px;
            padding: 0 10px;
            border: none;
            border-radius: 5px;
        }
        input[type=submit], button {
            width: 20%;
            height: 5vh;
            border-radius: 5vh;
            background-color: black;
            color: white;
            margin-top: 2vh;
        }
        label {
            margin-left: 10px;
            color: white;
            margin-bottom: 5px;
        }
        h1 {
            margin-left: 20px;
            color: white;
        }
        @media (max-width: 768px) {
            form {
                width: 95%;
                padding: 2vh;
            }
            input, select {
                height: 6vh;
                font-size: 1em;
            }
        }
        @media (max-width: 480px) {
            input, select {
                height: 6vh;
                font-size: 1em;
            }
        }
    </style>
</head>
<body>
<div class="all">
<%!
int pid;
%>
<%
pid=Integer.parseInt(request.getParameter("pid"));
%>
<div class="menu">
<h1>
Hospital Management System
</h1>
</div>
<form action="bill" name="frm" method="get">
<h1>Bill</h1>
<input type='hidden' name="pid" value=<%=pid %> value="">
<label>Date</label>
<input type='date' id="sr1" name="date" placeholder="Enter the date" value="">
<label>  Doctor Fee</label>
<input type=text name="doctor_Fee" id="r" placeholder="Enter the Doctor Fees" value="">
<label>Room Fee</label>
<input type=text name="room_Fee" id="f" placeholder="Enter the Medical Fees" value="">
<label>Total</label>
<input type=text name="total" id="l" onclick="add()" value="">
<input type="submit" name="s" value="Add Bill">
</form>
</div>
</body>
</html>