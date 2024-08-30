<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer Details</title>
<style>
.mainbody{
	max-width:60vw;
	margin: -650px 200px 0 auto;
	padding: 20px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	font-family: Arial, sans-serif;
	 
}

.title {
	text-align: center;
	color: #9b59b6;
	font-size: 24px;
}

.user-details, .vehical-details {
	background: #f2f2f2;
	padding: 20px;
	margin-top: 20px;
	border-radius: 8px;
}

.input-box {
	margin-bottom: 20px;
}

.input-box input {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.button {
	margin-top:30px;
	text-align: center;
}

.button input[type="submit"] {
	padding: 10px 20px;
	background-color: #9b59b6;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

.button input[type="submit"]:hover {
	background-color: #8e44ad;
}

.error {
	color: red;
	font-size: 14px;
	margin-top: 5px;
}
</style>
</head>
<body>
<%
	String id=request.getParameter("id");
	String vid=request.getParameter("vid");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String contact=request.getParameter("Contact");
	String companyName=request.getParameter("comname");
	String vnum=request.getParameter("vnum");
	String vmodel=request.getParameter("Model");
	
%>
	<%@include file="DashBord.jsp"%>
	<div class=" mainbody">
		<div class="title">Customer Information</div>
		<form name="frm" action="Upd" method="GET"
			onsubmit="return validateForm()">
			<div class="user-details">
			<div class="input-box">
			<input type="hidden"
						placeholder="Enter Your Name" name="id"  value="<%=id %>" required>
				</div>
				<div class="input-box">
			<input type="hidden"
						placeholder="Enter Your Name" name="vid"  value="<%=vid %>" required>
				</div>
				<div class="input-box">
					<span class="details">Enter Name</span> <input type="text"
						placeholder="Enter Your Name" name="name"  value="<%=name %>" required>
				</div>
				<div class="input-box">
					<span class="details">Contact</span> <input type="text"
						placeholder="Enter Your Contact" name="contact" value="<%=contact %>" required>
				</div>
				<div class="input-box">
					<span class="details">Email</span> <input type="text"
						placeholder="Enter Your Email" name="email" value="<%=email %>" required>
				</div>
				<div class="input-box">
					<span class="details">Enter Name company</span> <input type="text"
						placeholder="Enter Your Name Company" name="comname" value="<%=companyName %>" required>
				</div>
				<div class="input-box">
					<span class="details">Enter the Number</span> <input type="text"
						placeholder="Enter Your Vehicle Number" name="vnum" value="<%=vnum %>" required>
				</div>
				<div class="input-box">
					<span class="details">Enter Model</span> <input type="text"
						placeholder="Enter Your Vehicle Model" name="model" value="<%=vmodel %>" required>
				</div>
			</div>
			<div class="button">
				<input type="submit"  value="Update">
			</div>
		</form>
	</div>
	</div>
	<script>
		function validateForm() {
			var name = document.forms["frm"]["name"].value;
			var address = document.forms["frm"]["address"].value;
			var contact = document.forms["frm"]["contact"].value;
			var email = document.forms["frm"]["email"].value;
			var comname = document.forms["frm"]["comname"].value;
			var vnum = document.forms["frm"]["vnum"].value;
			var model = document.forms["frm"]["model"].value;

			if (name == "" || address == "" || contact == "" || email == ""
					|| comname == "" || vnum == "" || model == "") {
				alert("All fields must be filled out");
				return false;
			}

			// Validate email format
			var emailRegex = /^\S+@\S+\.\S+$/;
			if (!emailRegex.test(email)) {
				alert("Please enter a valid email address");
				return false;
			}

			// Validate contact number
			var contactRegex = /^\d{10}$/;
			if (!contactRegex.test(contact)) {
				alert("Please enter a 10-digit valid contact number");
				return false;
			}

			return true;
		}
	</script>
</body>
</html>
