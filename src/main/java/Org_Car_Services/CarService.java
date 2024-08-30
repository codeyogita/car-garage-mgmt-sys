package Org_Car_Services;
import java.util.List;

import Car_Models.Custumer_model;
import Car_Models.ServiceModel;
import Car_Models.Vehical_Model;


public interface CarService {
	public boolean isAddCustomer(Custumer_model model);
	public boolean isAddVehicle(Vehical_Model vmodel);
	public boolean isCustVehiJoin(int cid,int vid);
	public List<Object[]> getAllCustomerData();
	public boolean isDeleteid(int id);
	public boolean isDeletevid(int vid);
	public boolean isDelete(String id);
	public boolean isDeletevehical(String vid);
	public boolean isUpdatedata(Custumer_model model);
	public boolean isUpdateVehi(Vehical_Model vmodel);
	public int verifyCustomer(String email,String contact);
    public Custumer_model getProfile(int ccid);
    

}
