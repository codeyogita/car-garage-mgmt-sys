package Controller_main;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Car_Models.Custumer_model;
import Car_Models.ServiceModel;
import Car_Models.Vehical_Model;
import Org_Car_Services.CarService;
import Org_Car_Services.CserviceImp_service;
import Org_Car_Services.CserviceServices;
import Org_Car_Services.Customer_ServiceImp;


@WebServlet("/servview")
public class servview extends HttpServlet {
	CserviceServices css=new CserviceImp_service();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		
		     response.setContentType("text/html");
	     
	         PrintWriter out=response.getWriter();
	         
	         
	         ServiceModel smodel=new ServiceModel();

	         String contact=request.getParameter("uid");
	         String stype[]=request.getParameterValues("stype");
	         int sid[]=new int[stype.length];
	         for (int i = 0; i < stype.length; i++) {
				sid[i]=Integer.parseInt(stype[i]);
				System.out.println("sid="+sid[i]);
			}
	         
	    	 String date=request.getParameter("date");
	    	 int cvid=css.getCVID(contact);
	    	 int sid1=smodel.getSid();
	    	
	    	boolean b=css.isAddCSVJoin(cvid, sid, date);
	    	if(b)
	    	{
	    		out.println("The Bill Is Added...");
	    	}
	    	else
	    	{
	    		out.println("The Bill is Not Added..");
	    	}
	    	
	     
			 
			 
	         
	        
	
	
	
	
	
	
	
	}
	

}
