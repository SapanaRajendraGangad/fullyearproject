<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.Hospital.admin.service.*,java.util.*,org.Hospital.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","searchDoctor.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
  <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .form {
            height: auto;
            width: 90%;
            max-width: 600px;
            margin: 5vh auto;
            background-color: blue;
            padding: 4vh;
            border-radius: 10px;
        }
        input[type=submit] {
            width: 15%;
            height: 5vh;
            border-radius: 5vh;
            background-color: black;
            color: white;
            margin-top: 2vh;
        }
         button {
            width: 25%;
            height: 5vh;
            border-radius: 5vh;
            background-color: black;
            color: white;
            margin-top: 2vh;
        }
        form h1 {
            margin-bottom: 2vh;
            text-align: center;
        }
        input, select {
            height: 5vh;
            width: calc(100% - 20px);
            margin-bottom: 2vh;
            padding: 0 10px;
            border: none;
            border-radius: 5px;
        }
        label {
            color: white;
            display: block;
            margin-bottom: 0.5vh;
        }
        h1 {
            color: white;
        }
        @media (max-width: 768px) {
            .form {
                width: 95%;
                padding: 2vh;
            }
            input[type=submit], button {
                height: 6vh;
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
 <%@include file="admindashboard.jsp"%>
 
 <div class="col">
<form action="adddoctor" name="frm" method="post" class="form">
<h1>Add Doctor</h1>
<label style="color:white;">Doctor Name:</label>
<input type="text" name="dname" placeholder="Enter the name of doctor" value=""/>
<label style="color:white;">Doctor Contact:</label>
<input type="text" name="contact" placeholder="Enter thr contact of doctor"/>
<label style="color:white;">Doctor Email:</label>
<input type="text" name="email" placeholder="Enter thr email of doctor"/>
<label style="color:white;">Doctor Category:</label>
<input type="text" name="category" placeholder="Enter the category of doctor" value=""/>
<label style="color:white;">Doctor Time:</label>
<select type="text" name="time"  value=""/>
<option>9:00AM-12:00</option>
<option>12:00-3:00PM</option>
<option>3:00PM-6:00PM</option>
<option>6:00PM-9:00PM</option>
<option>other </option>
</select>
<button value="add doctor" >Add Doctor</button>
</form>
<form action="viewDoctor.jsp" name="frm" method="post">
<input type ="submit" value="view" >
</form>

</div>
</div>
</div>
</div>
 </div>
</body>
</html>