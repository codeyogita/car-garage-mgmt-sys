package Org_Car_Services;

import java.sql.Date;
import java.util.List;

import Car_Models.ServiceModel;
import Org_Car_Repository.CserviceImpRepo;
import Org_Car_Repository.CserviceRepo;

public class CserviceImp_service implements CserviceServices{
	
	CserviceRepo Crepo=new CserviceImpRepo();

	@Override
	public boolean isAddService(ServiceModel model) {
	
		return Crepo.isAddService(model);
	}

	@Override
	public List<ServiceModel> getAllservice() {
		
		return Crepo.getAllservice();
	}

//	@Override
//	public boolean isAddCSVJoin(int cvid, String sid,String date) {
//		
//		return Crepo.isAddCSVJoin(cvid, cvid, date);
//	}

	@Override
	public int getCVID(String contact) {
		// TODO Auto-generated method stub
		return Crepo.getCVID(contact);
	}

	@Override
	public boolean isAddCSVJoin(int cvid, int[] sid, String date) {
		
		return Crepo.isAddCSVJoin(cvid, sid, date);
	}
	
	

}
