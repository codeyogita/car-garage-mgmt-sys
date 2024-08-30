package Controller_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Org_Car_Services.CarService;
import Org_Car_Services.Customer_ServiceImp;

/**
 * Servlet implementation class custmSession
 */
@WebServlet("/custmSession")
public class custmSession extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Email=request.getParameter("uname");
		String Contact=request.getParameter("psw");
		
		CarService cs=new Customer_ServiceImp();
		
		int result=cs.verifyCustomer(Email, Contact);
		if(result!=0)
		{
           HttpSession session=request.getSession(true);
           session.setAttribute("ccid",result);
          // System.out.println(session.getId());
           RequestDispatcher r=request.getRequestDispatcher("CustomerDash.jsp");
		     r.forward(request, response);
		
		}
		else
		{
			out.println("<h1>Invalide Username And Password...<h1>");
		}
		
		
	
	
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
