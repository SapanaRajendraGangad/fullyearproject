<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
*{
margin:0;
padding:0;
box-sizing: border-box;
}
.mypage{
width:100%;
height:100vh;
}
.menu-bar{
height:15vh;
width:100%;
background-color: pink;
display: flex;
}
.logo{
flex:left;
width:80vh;
}
.menu{
flex: right;
list-style-type: none;
padding-top: 5vh;

}
.menu ul li{
display: inline;
padding:5vh;
font-size: 4vh;

}
.menu ul li a{
color: white;
text-decoration: none;
}
h1{
margin-top: 3vh;
margin-left:4vh;
}
.sidebar{
background-image: href("images/logo.png");
}
.sidebar{
background-image: url("images/hos1.jpg");
width:100%;
height:90vh;
background-repeat: no-repeat;
background-size: cover;
}

.sidebar h1{
padding-top:30vh;
margin-left:50vh;
}
.sidebar h3{
margin-left:50vh;
}
.logo{
display: flex;
}
.l1{
margin-left:4vh;
}
.myintro{
height:800px;
width:100%;
background-color: lightyellow;
}
.intro-part{
height:700px;
width:100%;
background-image:url("images/vecteezy_healthcare-theme-3d-illustration-of-an-empty-emergency-room_26977435.jpg");
background-position: center;
background-size: cover;
margin-top:40px;
}

.box2{

height:700px;
width:50%;
padding:1vh;
margin-left:50vh;
}

.box2 p{
border:2px solid black;
margin:60px;
padding:10px;
font-size:20px;
}
.sidebar1{
background-image: url("images/theator.jpg");
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
#srg1{
margin-top:90px;
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
.box img{
margin:60px 80px;
height:90px;
width:60px;
}
h2{
margin-left:20px;
}
p{
margin-left:20px;
}
.sidebar3{
background-image: url("images/Contact-us.jpg");
width:100%;
height:100vh;
background-repeat: no-repeat;
background-size: cover;
}
.l1 img{
height:80px;
width:90px;
padding-top:12px;
}
</style>
</head>
<body>
<div class='mypage'>
<div class="sticky">
<div class='menu-bar'>
<div class='logo'>
<div class='l1'>
<img src="images/logo.jpg">
</div>
<div class='l2'>
<h1> Hospital</h1>
</div>
</div>
<div class='menu'>

<ul>
<li><a href="logindashboard.jsp">Home</a></li>
<li><a href="#srg4">contact</a></li>
<li><a href="#srg1">about us</a></li>
<li><a href="#srg2">facility</a></li>
<li><a href="allLogin.jsp">Login</a></li></div>
</div>
</div>
<div class='sidebar'>
</div>
</div>
</div>
<div id="srg1">
<div class="intro-part">
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
<div id="srg2">
<div class='sidebar1'>
<div class="bt"></div>
<div class="box">
<div class="b1">
<img src="images/194915.png">
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
</div>
<div id="srg4">
<div class='mypage'>
<div class='sidebar3'>
</div>
</div>
</div>
</body>
</html>