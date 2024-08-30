package Admine_Cofigure_admine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Car_Models.Custumer_model;


public class DBConfig {
	
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	public DBConfig() {
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalprocar","root","root");
	}
	catch(Exception ex)
	{
	System.out.println("The Exeption is..."+ex);	
	}
}


	
	

	
		
		
		
		
		
		

	

}
