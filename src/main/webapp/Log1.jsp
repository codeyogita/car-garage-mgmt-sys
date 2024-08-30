<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
*{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins',sans-serif;
        }

        body
        {
             display: flex;
             height: 150vh;
             justify-content: center;
             padding: 10px;
             align-items: center;
             background: linear-gradient(135deg,#71b7e6,#9b59b6);
             margin-right:150px;

        }
        .container
        {
            max-width: 900px;
            width: 100%;
            background-color: white;
            padding: 25px 30px;
            border-radius: 5px;

        }
        .container .title{
            font-size: 25px;
            font-weight: 500;
            position: relative;


        }
        .container .title::before
        {
            content: '';
            position: absolute;
            left: 0;
            bottom: 0;
            height: 3px;
            width: 30px;
            background: linear-gradient(135deg, #71b7e6,#9b59b6);
        }

        .container form.user-details
        {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        form .user-details .input-box
        {
            width: calc(100% / 2 - 20px );
            margin: 20px 0 12px 0;

            
        }

        .user-details .input-box .details
        {
            display: block;
            font-weight: 500;
            margin-bottom: 5px;
        }

        .user-details .input-box input
        {
            height: 45px;
            width: 100%;
            outline: none;
            border-radius: 5px;
            border: 1px solid #ccc;
            padding-left: 15px;
            font-size: 16px;
            border-bottom-width:2px;
            transition: all 0.3s ease;

        }
        .formarae
        {
         position:absolute ;
         left:200px;
         top:50px;
         
        
        }

        .user-details .input-box input:focus,
        .user-details .input-box input:valid
        {
            border-color: #9b59b6;
        }
        
        form .button
        {
            height: 45px;
            margin: 45px 0;
        }
        form .button input
        {
            height: 100%;
            width: 100%;
            outline: none;
            color: #fff;
            border: none;
            font-size: 18px;
            font-weight: 500;
            letter-spacing: 1px;
            background: linear-gradient(135deg,#71b7e6,#9b59b6);
        }

        form .button input:hover{
            background: linear-gradient(-135deg,#71b7e6,#9b59b6);

        }
        @media (max-width:584px)
        {
            .container{
                max-width: 100%;

            }

            form .user-details .input-box
            {
                margin-bottom: 15px;
                width: 100%;
            }
            .container form .user-details
            {
                max-height: 300px;
                overflow: scroll;
            }
        }








</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="DashBord.jsp"%>

</div>
    </div>

<div class="container" >

    <div class="title"> Registration</div>
   <form name="frm"  action=" AddCustomer1"  method=" GET">

        <div class="user-details">
<h1 style="color: #9b59b6; font-family: Poping; margin-left: 50px;">Customer Information</h1>

            <div class="input-box">
                <span class="details">Enter Name</span>
                <input type="text" placeholder="Enter Your Name"  name="name" required>
            </div>
            <div class="input-box">
                <span class="details">Address</Address></span>
                <input type="text" placeholder="Enter Your Address"  name="address" required>
            </div>

            <div class="input-box">
                <span class="details">Contact</span>
                <input type="text" placeholder="Enter Your Contact"  name="contact"  required>
            </div>

            <div class="input-box">
                <span class="details">Email</span>
                <input type="text" placeholder="Enter Your Email" name="email"  required>
            </div>
        </div>
        
        
        
       <h1 style="color: #9b59b6; font-family: Poping; margin-left: 50px;">Vehical Information</h1>

        <div class="user-details">

            <div class="input-box">
                <span class="details">Enter Name comapany</span>
                <input type="text" placeholder="Enter Your Name Comapany"  name="comname" required>
            </div>
            <div class="input-box">
                <span class="details">Enter the Num</Address></span>
                <input type="text" placeholder="Enter Your Vehical Num"  name="vnum" required>
            </div>

            <div class="input-box">
                <span class="details">Enter Model</span>
                <input type="text" placeholder="Enter Your vehical Model" name="model" required>
            </div>

           
        </div>
    
        <div class="button">

            <input type="submit"  value="Registrater">
        </div>



    </form>

    </div>




</body>
</html>
        
        
        
        
        
        
        
        
        
        
        
        
    
      





