package Controller_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Car_Models.Custumer_model;
import Car_Models.Vehical_Model;
import Org_Car_Services.CarService;
import Org_Car_Services.Customer_ServiceImp;

/**
 * Servlet implementation class UpdateCV
 */
@WebServlet("/Upd")
public class UpdateCV extends HttpServlet {

	CarService cs = new Customer_ServiceImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String vid=request.getParameter("vid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");	
		String vehiBrand = request.getParameter("comname");
		String vehiNum = request.getParameter("vnum");
		String vehiModel = request.getParameter("model");
		Custumer_model cmodel=new Custumer_model();
		
		cmodel.setName(name);
		cmodel.setEmail(email);
		cmodel.setContact(contact);
		cmodel.setCustId(id);
		boolean b=cs.isUpdatedata(cmodel);
		Vehical_Model vmodel=new Vehical_Model();
		vmodel.setUpdateId(vid);
		vmodel.setComname(vehiBrand);
		vmodel.setVnum(vehiNum);
		vmodel.setModel(vehiModel);
		boolean b1=cs.isUpdateVehi(vmodel);
		if(b && b1) {
			System.out.println("Data Upadted");
			RequestDispatcher rd=request.getRequestDispatcher("/ViewCV.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("data not updated");
		}
		
		

	}
}





/*
 * RequestDispatcher r = request.getRequestDispatcher("DashBord.jsp");
 * r.forward(request, response);
 * 
 * 
 * String btn=request.getParameter("s"); if(btn!=null) { id =
 * request.getParameter("id"); name=request.getParameter("name");
 * email=request.getParameter("email"); contact=request.getParameter("contact");
 * vehiBrand=request.getParameter("vehiBrand");
 * vehiNum=request.getParameter("vehiNum");
 * vehiModel=request.getParameter("vehiModel");
 * 
 * Custumer_model cmodel=new Custumer_model(); Vehical_Model vmodel=new
 * Vehical_Model();
 * 
 * cmodel.setName(name); cmodel.setEmail(email); cmodel.setContact(contact);
 * vmodel.setComname(vehiBrand); vmodel.setVnum(vehiNum);
 * vmodel.setModel(vehiModel); }
 */
