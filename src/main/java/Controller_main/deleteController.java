package Controller_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Org_Car_Services.CarService;
import Org_Car_Services.Customer_ServiceImp;


/**
 * Servlet implementation class deleteController
 */
@WebServlet("/deleteCont")
public class deleteController extends HttpServlet {
	CarService cs=new Customer_ServiceImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		   PrintWriter out=response.getWriter();
		   String id=request.getParameter("id");
		   System.out.println(id);
		   boolean b=cs.isDelete(id);
		   String vid=request.getParameter("vid");
		   System.out.println(vid);
		   boolean b1=cs.isDeletevehical(vid);
		   if(b && b1)
		   {
			   System.out.println("data deleted");
			   RequestDispatcher r=request.getRequestDispatcher("ViewCV.jsp");
			   r.forward(request, response);
		   }
		   else
		   {
			   out.println("There Is Some Problem");
		   }
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
