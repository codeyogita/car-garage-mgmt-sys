package Org_Car_Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Admine_Cofigure_admine.DBConfig;
import Car_Models.Custumer_model;
import Car_Models.Vehical_Model;

public class Customer_RepositaryImp extends DBConfig implements Customer_Repository {

	List<Object[]> CstDatalist;
	int cid = 0;

	public int getCustomerId(int cid) {
		try {
			ps = conn.prepareStatement("select max(id) from customer");
			rs = ps.executeQuery();
			if (rs.next()) {
				cid = rs.getInt(1);
			}
			return ++cid;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public boolean isAddNewCustomer(Custumer_model cmodel) {
		try {

			int custId = this.getCustomerId(cid);
			cmodel.setId(custId);
			;
			ps = conn.prepareStatement("insert into customer values(?,?,?,?,?)");
			ps.setInt(1, cmodel.getId());
			ps.setString(2, cmodel.getName());
			ps.setString(3, cmodel.getEmail());
			ps.setString(4, cmodel.getContact());
			ps.setString(5, cmodel.getAddress());
			int value = ps.executeUpdate();
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("The Error Is Occur...." + ex);

			return false;
		}

	}

	int vid = 0;

	public int getVehicleId(int vid) {
		try {
			ps = conn.prepareStatement("select max(vid) from vehical");
			rs = ps.executeQuery();
			if (rs.next()) {
				vid = rs.getInt(1);
			}
			return ++vid;

		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public boolean isAddVehical(Vehical_Model vmodel) {

		try {
			int vehiId = this.getVehicleId(vid);
			vmodel.setVid(vehiId);
			ps = conn.prepareStatement("insert into vehical values(?,?,?,?)");
			ps.setInt(1, vmodel.getVid());
			ps.setString(2, vmodel.getComname());
			ps.setString(3, vmodel.getVnum());
			ps.setString(4, vmodel.getModel());
			int value = ps.executeUpdate();

			return value > 0 ? true : false;
		} catch (Exception e) {
			System.out.println("Error is: " + e);
			return false;
		}

	}

	int cvid = 0;

	public int getCVid(int cvid) {
		try {
			ps = conn.prepareStatement("select max(cvid) from custVehijoin");
			rs = ps.executeQuery();
			if (rs.next()) {
				cvid = rs.getInt(1);
			}
			return ++cvid;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public boolean isCustVehiJoin(int cid, int vid) {

		try {
			int cvid1 = this.getCVid(cvid);
			ps = conn.prepareStatement("insert into custvehijoin values(?,?,?)");
			ps.setInt(1, cvid1);
			ps.setInt(2, cid);
			ps.setInt(3, vid);
			int value = ps.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error Is" + ex);
			return false;

		}

	}

	@Override
	public List<Object[]> getAllCustomerData() {
		try {

			CstDatalist = new ArrayList<Object[]>();
			ps = conn.prepareStatement(
					"select c.name,c.email,c.contact,v.compname,v.vnum,v.model from customer c inner join custvehijoin cv on cv.id=c.id inner join vehical v on v.vid=cv.vid");
			rs = ps.executeQuery();
			while (rs.next()) {
				
				Object[] obj = new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6) };
				
				CstDatalist.add(obj);
			}
			return CstDatalist.size() > 0 ? CstDatalist : null;

		} catch (Exception ex) {
			System.out.println("the Error is" + ex);
			return null;

		}

	}

	@Override
	public boolean isDeleteid(int id) {
		try {
			ps = conn.prepareStatement("delete from customer where id=?");
			ps.setInt(1, id);
			int value = ps.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("The Erroe is" + ex);
		}

		return false;
	}

	@Override
	public boolean isDeletevid(int vid) {
		try {
			ps = conn.prepareStatement("delete from vehical where vid=?");
			ps.setInt(1, vid);
			int value = ps.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("The Erroe is" + ex);
		}

		return false;
	}

	@Override
	public boolean isDeleted(String id) {
		try {
			ps=conn.prepareStatement("delete from customer where contact=?");
			ps.setString(1, id);
			int value=ps.executeUpdate();
			return value>0?true:false;
			
		} catch (Exception e) {
			System.out.println("Error in customer delete "+e);
			return false;
		}
	}

	@Override
	public boolean isDeletedvehical(String vid) {
		try {
			ps=conn.prepareStatement("delete from vehical where vnum=?");
			ps.setString(1, vid);
			int value=ps.executeUpdate();
			return value>0?true:false;
		} catch (Exception e) {
			System.out.println("Error in vehical deleted"+e);
			return false;
		}
	}

	@Override
	public boolean isUpdatedata(Custumer_model model) {
		
		try
		{
			
			ps=conn.prepareStatement("update customer set name=?,email=?,contact=? where contact=?");
			
			ps.setString(1,model.getName());
			ps.setString(2,model.getEmail());
			ps.setString(3,model.getContact());
			ps.setString(4, model.getCustId());
			int value=ps.executeUpdate();
			return value>0?true:false;
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
		return false;
	}

	@Override
	public boolean isUpdateVehi(Vehical_Model vmodel) {
		
		try
		{
			
			ps=conn.prepareStatement(" update vehical set compname=?,vnum=?,model=? where vnum=?");
			ps.setString(1,vmodel.getComname());
			ps.setString(2,vmodel.getVnum());
			ps.setString(3,vmodel.getVnum());
			ps.setString(4, vmodel.getUpdateId());
			int value=ps.executeUpdate();
			return value>0?true:false;
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
		
		
		return false;
	}

	@Override
	public int verifyCustomer(String email, String cotact) {
      try {
    	  ps=conn.prepareStatement("select * from customer where email=? and contact=?");
    	  ps.setString(1, email);
    	  ps.setString(2,cotact);
    	  rs=ps.executeQuery();
    	  if(rs.next())
    	  {
    		  return rs.getInt(1);
    	  }
    	  else
    	  {
    		  return 0;
    	  }
    	  
    	  
      }
      catch(Exception ex)
      {
    	  
      }
		
		
		return 0;
	}

	@Override
	public Custumer_model getProfile(int ccid) {
		try {
			ps=conn.prepareStatement("select *from customer where id=?");
			ps.setInt(1, ccid);
			rs=ps.executeQuery();
			Custumer_model cm =null;
			if(rs.next())
			{
				cm=new Custumer_model();
				cm.setId(rs.getInt(1));
				cm.setName(rs.getNString(2));
				cm.setAddress(rs.getString(3));
				cm.setContact(rs.getString(4));
				cm.setEmail(rs.getString(5));
				
			}
			return cm;
			
		}
		catch(Exception ex)
		{
			return null;
		}
		
		
		
		
	}

	
}
