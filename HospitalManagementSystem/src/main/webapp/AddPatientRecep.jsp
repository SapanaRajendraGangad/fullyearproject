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
        
        .btn{
       		margin-left: 35%;
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
  flex: 0 0 30%; /* Adjusted width */
  margin: 0 3%; /* Reduced the margin between forms */
  align-items: center;
}

.side form {
  width: 100%; /* Full width of the form */
}

.side form input[type=submit] {
  width: 60%; /* Full width of the button */
  height: 7vh; /* Set the height */
  border-radius: 5vh;
  background-color: black;
  color: white;
  padding: 5px;
  margin: 0; /* Remove additional margin */
  font-size: 1rem; /* Adjust font size */
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
            }
            .side form {
                width: 100%;
                margin-bottom: 2vh;
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
</style>
</head>
<body>
 <%@include file="DoctorLogin.jsp"%>
 <div class="col">
    <form action="PatientController" name="frm" class="form" method="post">
        <h3>Add Patient</h3>
        <label for="s1">Patient Name:</label>
        <input type="text" name="pname" placeholder="Enter the name of patient" id="s1" value=""/>
        
        <label for="s2">Patient Address:</label>
        <input type="text" name="Address" placeholder="Enter the address of patient" id="s2" value=""/>
        
        <label for="s3">Patient Contact:</label>
        <input type="text" name="contact" id="s3" placeholder="Enter the contact of patient"/>
        
        <label for="s4">Patient Age:</label>
        <input type="text" name="Age" placeholder="Enter the Age of patient" id="s4" value=""/>
        
        <label for="s5">Patient gender:</label>
        <select id="s5" name="gender">
            <option>MALE</option>
            <option>FEMALE</option>
        </select>
        
        <label for="s6">Patient pdate:</label>
        <input type="date" name="pdate" id="s6" value=""/>
        
        <label for="s7">Patient type:</label>
        <input type="text" name="ptype" placeholder="Enter the disease type of patient" id="s7" value=""/>
        
        <label for="s8">Patient Category:</label>
        <select id="s8" name="ptype">
            <option>IPD</option>
            <option>OPD</option>
        </select>
        
        <label for="s9">Patient status:</label>
        <select id="s9" name="status">
            <option>Active</option>
            <option>Inactive</option>
        </select><br><br>
        <div class="btn">
        	<button type="submit">Add Patient</button>
        </div>
        
    </form>
    
    <div class="side">
        <div>
	        <form action="viewPatient.jsp" class="s1" name="frm" method="post">
	            <input type="submit" value="view patient">
	        </form>
        </div>
        <div>
	        <form action="viewBill.jsp" class="s2" name="frm" method="post">
	            <input type="submit" value="view Bill">
	        </form>
        </div>
        <div>
	        <form action="viewmedicine.jsp" class="s1" name="frm" method="post">
	            <input type="submit" value="view Medicine">
	        </form>
        </div>
    </div>
</div>
</body>
</html>