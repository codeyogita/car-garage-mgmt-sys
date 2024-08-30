package Org_Car_Services;

import java.sql.Date;
import java.util.List;

import Car_Models.ServiceModel;

public interface CserviceServices{
	
	public boolean isAddService(ServiceModel model);
	public List<ServiceModel>getAllservice();
	public boolean isAddCSVJoin(int cvid,int []sid,String date);
	public int getCVID(String contact);
	
}
