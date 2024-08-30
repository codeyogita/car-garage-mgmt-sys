package Org_Car_Repository;

import java.util.List;

import Car_Models.Custumer_model;
import Car_Models.Vehical_Model;

public interface Customer_Repository {
	
	public boolean isAddNewCustomer(Custumer_model model);
	public boolean isAddVehical(Vehical_Model vmodel);
	public boolean isCustVehiJoin(int cid,int vid);
	public List<Object[]> getAllCustomerData();
	public boolean isDeleteid(int id);
	public boolean isDeletevid(int vid);
	public boolean isDeleted(String id);
	public boolean isDeletedvehical(String vid);
	public boolean isUpdatedata(Custumer_model model);
	public boolean isUpdateVehi(Vehical_Model vmodel);
	public int verifyCustomer(String email,String cotact);
	public Custumer_model getProfile(int ccid); 
	

	
	

}
