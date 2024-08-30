package Controller_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Car_Models.Custumer_model;
import Car_Models.Vehical_Model;
import Org_Car_Services.CarService;
import Org_Car_Services.Customer_ServiceImp;

/**
 * Servlet implementation class AddCustomer
 */
@WebServlet("/AddCustomer1")
public class AddCustomer extends HttpServlet {
	
	

   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		
		String vehiBrand=request.getParameter("comname");
		String vehiNum=request.getParameter("vnum");
		String vehiModel=request.getParameter("model");
		
		
//		
//		out.println(name);
//		out.println(email);
//		out.println(address);
//		out.println(contact);
//		
//		out.println(vehiBrand);
//		out.println(vehiNum);
//		out.println(vehiModel);
//


		
		Custumer_model cmodel=new Custumer_model();
		cmodel.setName(name);
		cmodel.setEmail(email);
		cmodel.setAddress(address);
		cmodel.setContact(contact);
		
		
		Vehical_Model vmodel=new Vehical_Model();
		vmodel.setComname(vehiBrand);		
		vmodel.setVnum(vehiNum);
		vmodel.setModel(vehiModel);
		
		
		 CarService cService=new Customer_ServiceImp();
		 boolean b=cService.isAddCustomer(cmodel);
		 System.out.println(b);
		 boolean b1=cService.isAddVehicle(vmodel);
		 int cid=cmodel.getId();
		 int vid=vmodel.getVid();
		 
		 
		 
		 boolean b2=cService.isCustVehiJoin(cid, vid);
		 HttpSession addCust=request.getSession();
		  if(b && b1 && b2)
		  {
			  
			  addCust.setAttribute("addCust", "Data Added Successfully");
			  
		  }
		  else
		  {			 
			  addCust.setAttribute("addCust","Data Not Added");
		  }
		  response.sendRedirect("Log1.jsp");

			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
