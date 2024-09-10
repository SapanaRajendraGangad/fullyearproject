<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/adminStyle.css" rel="stylesheet">
<style>
.myintro{
height:800px;
width:100%;
background-color: lightyellow;
}
.intro-part{
height:700px;
width:100%;
display:flex;
}
.box1{
height:700px;
width:50%;
flex:right;
background-image: url("images/hos.jpg");
margin:20px;
background-position: center;
background-size: cover;
}
.box2{
height:700px;
width:50%;
flex:left;
}

.box2 p{
border:2px solid black;
margin:60px;
padding:10px;
font-size:20px;
}
</style>
</head>
<body>
<div class='myintro'>
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

<div class="intro-part">
<div class="box1">

</div>
<div class="box2">
<p>Hospital, an institution that is built, staffed, and equipped for the diagnosis of disease; for the 
treatment, both medical and surgical, of the sick and the injured; and for their housing during this 
process. The modern hospital also often serves as a centre for investigation and for teaching.

To better serve the wide-ranging needs of the community, the modern hospital has often developed 
outpatient facilities, as well as emergency, psychiatric, and rehabilitation services. In addition, 
“bedless hospitals” provide strictly ambulatory (outpatient) care and day surgery. Patients arrive 
at the facility for short appointments. They may also stay for treatment in surgical or medical units 
for part of a day or for a full day, after which they are discharged for follow-up by a primary care 
health provider.

Hospitals have long existed in most countries. Developing countries, which contain a large proportion 
of the world’s population, generally do not have enough hospitals, equipment, and trained staff to 
handle the volume of persons who need care. Thus, people in these countries do not always receive the 
benefits of modern medicine, public health measures, or hospital care, and they generally have lower
 life expectancies.

In developed countries the hospital as an institution is complex, and it is made more so as modern 
technology increases the range of diagnostic capabilities and expands the possibilities for treatment.
 </p>
 </div>
</div>
</div>
</body>
</html>