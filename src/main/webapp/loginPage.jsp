<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            /* Added a fallback font */
        }

        .mainbody {
            background: linear-gradient(rgba(0, 0, 0, 0.20), rgba(0, 0, 0, 0.20)), url(img/jakob-rosen-9VXMt6YRHEA-unsplash.jpg);
            height: 100vh;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            display: flex;
            justify-content: flex-start;
             align-items: center; 
        }

        .main1 {
            width: 300px;
            padding: 20px;
            background: rgba(63, 60, 60, 0.4);
            /* Semi-transparent background */
            border-radius: 10px;
            backdrop-filter: brightness(40%);
            /* Brightness effect */
            color: #000;
            margin-left: 80px;
        }


        .input-field {
            width: 100%;
            height: 40px;
            margin-bottom: 15px;
            /* Adjusted margin for spacing between input fields */
            padding: 8px;
            /* Added padding for better spacing */
            border: 1px solid #ccc;
            line-height: 20px;
            gap: 20px;
            /* Added a border for clarity */
            border-radius: 5px;
            /* Added border radius for a nicer look */
            box-shadow: none;
            /* Removed box shadow */
        }

        .submit-btn {
            width: 100%;
            height: 40px;
            background-color: #4CAF50;
            /* Changed button color */
            color: white;
            border: none;
            border-radius: 5px;
            /* Added border radius for a nicer look */
            cursor: pointer;
        }

        .submit-btn:hover {
            background-color: #45a049;
            /* Darker color on hover */
        }
        
  .t1 {
	width: 80%;
	heigth: 300px;
	margin-left: 270px;
	margin-top: -670px;
	position: absolute;
	background-color: white;
}
    </style>
</head>

<body>
<form name="frm"  action=" AddService"  method=" POST" autocomplete="off">
<%@include file="DashBord.jsp"%>
	<div class="t1">


<div class="container mainbody">
        <div class="main1">
            <input class="input-field" type="text" name="name" value="" placeholder="Enter the name Of  Service" />
            <input class="input-field" type="text" name="price" value="" placeholder="Enter the Price Of Service" />
            <input class="submit-btn" type="submit" name="s" value="Register" />
        </div>
    </div>
    
    
    </div>
    </div>
    
    </form>
</body>

</html>




