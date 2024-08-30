package Controller_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Car_Models.ServiceModel;
import Org_Car_Services.CserviceImp_service;
import Org_Car_Services.CserviceServices;

/**
 * Servlet implementation class AddService
 */
@WebServlet("/AddService")
public class AddService extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		
		ServiceModel smodel=new ServiceModel();
		smodel.setName(sname);
		smodel.setPrice(price);
		
		CserviceServices css=new CserviceImp_service();
		boolean b=css.isAddService(smodel);
		if(b)
		{
			
			System.out.println("The Service is Added..");
		}
		else
		{
			System.out.println("the Service is not Added..");
		}
	
	
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
