package Org_Car_Services;

import java.util.List;

import Car_Models.Custumer_model;
import Car_Models.ServiceModel;
import Car_Models.Vehical_Model;
import Org_Car_Repository.Customer_RepositaryImp;
import Org_Car_Repository.Customer_Repository;

public class Customer_ServiceImp  implements CarService {
	
	Customer_Repository cRepo=new Customer_RepositaryImp();

	public boolean isAddCustomer(Custumer_model model) {
		
		return cRepo.isAddNewCustomer(model);
	}

	@Override
	public boolean isAddVehicle(Vehical_Model vmodel) {

		return cRepo.isAddVehical(vmodel);
	}

	@Override
	public boolean isCustVehiJoin(int cid, int vid) {

		return cRepo.isCustVehiJoin(cid, vid);
	}

	@Override
	public List<Object[]> getAllCustomerData() {

		return cRepo.getAllCustomerData() ;
	}

	@Override
	public boolean isDeleteid(int id) {
		
		return cRepo.isDeleteid(id);
	}

	@Override
	public boolean isDeletevid(int vid) {
        
		return cRepo.isDeletevid(vid);
	}

	@Override
	public boolean isDelete(String id) {
		// TODO Auto-generated method stub
		return cRepo.isDeleted(id);
	}

	@Override
	public boolean isDeletevehical(String vid) {
		return cRepo.isDeletedvehical(vid);
	}

	@Override
	public boolean isUpdatedata(Custumer_model model) {
		
		return cRepo.isUpdatedata(model);
	}

	@Override
	public boolean isUpdateVehi(Vehical_Model vmodel) {
		return cRepo.isUpdateVehi(vmodel);
	}

	@Override
	public int verifyCustomer(String email, String contact) {
		
		
		
		
		
		return cRepo.verifyCustomer(email, contact);
	}

	@Override
	public Custumer_model getProfile(int ccid) {
		return cRepo.getProfile(ccid);
	}

	
	

}
