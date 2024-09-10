<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><style type="text/css">
*{
margin:0;
padding:0;
box-sizing: border-box;
}
.form{
height:60vh;
width:140vh;
margin-left: 15vh;
background-color: blue;
padding: 4vh;
margin-top:10vh;
}
input{
height:5vh;
width:45vh;
}
button{
height:5vh;
width:20vh;
border-radius: 3vh;
background-color: black;
color: white;
}
 h3{
color: white;
}
h1{
margin-left:15vh;
}

#s1{
margin-left: 2vh;
}
#s2{
margin-left:1vh;
}
#s4{
margin-left: 5vh;
}
#s8{
margin-left:;
}
#s6{
margin-left: 3vh;
}
#s7{
margin-left: 3vh;
}
#s9{
margin-left: 1vh;
}
input[type=submit]{
width:15vh;
height:5vh;
margin:5vh 15vh;
border-radius:5vh;
background-color: black;
color:white;
}
</style>
<script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","searchPatient.jsp?n="+str,true)
    		xhttp.open("GET","searchPatient.jsp?m="+str,true)
    	xhttp.send();
    }
 </script>
</head>
<body>
 <%@include file="doctoradmindashboard.jsp"%>
 <div class="col">
<form action="PatientController" name="frm" class="form" method="post">
<h3>Add Patient</h3>
<label style="color:white;">Patient Name:</label>
<input type="text" name="pname" placeholder="Enter the name of patient" id="s1" value=""/>
<label style="color:white;">Patient Address:</label>
<input type="text" name="Address" placeholder="Enter the address of patient"  id="s2" value=""/><br><br>
<label style="color:white;">Patient Contact:</label>
<input type="text" name="contact" id="s3" placeholder="Enter thr contact of patient"/>
<label style="color:white;">Patient Age:</label>
<input type="text" name="Age" placeholder="Enter the Age of patient" id="s4" value=""/><br><br>
<label style="color:white;">Patient gender:</label>
<select style="width:45vh;height:5vh;" id="s5" name="gender">
<option>MALE</option>
<option>FEMALE</option>
</select>
<label style="color:white;">Patient pdate:</label>
<input type="date" name="pdate" placeholder="Enter the Pdate of patient" id="s6" value=""/><br><br>
<label style="color:white;">Patient type:</label>
<input type="text" name="ptype" placeholder="Enter the disease type of patient" id="s7" value=""/>
<label style="color:white;">Patient Category:</label>
<select style="width:45vh;height:5vh;"id="s8" name="ptype">
<option>IPD</option>
<option>OPD</option>
</select><br><br>
<label style="color:white;">Patient status:</label>
<select style="width:45vh;height:5vh;"id="s9" name="status">
<option>Active</option>
<option>InActive</option>
</select>
<br><br> 
<button value="add doctor" >Add Patient</button>
</form>
<form action="viewPatient.jsp" name="frm" method="post">
<input type ="submit" action="viewDoctor.jsp" value="view" >
</form>

</div>
</div>
 </div>
</body>
</html>