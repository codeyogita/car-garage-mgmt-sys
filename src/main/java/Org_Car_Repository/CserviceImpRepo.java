package Org_Car_Repository;

import java.sql.Date;
import java.util.*;

import Admine_Cofigure_admine.DBConfig;

import Car_Models.ServiceModel;

public class CserviceImpRepo extends DBConfig implements CserviceRepo{
    List<ServiceModel>list=new ArrayList<ServiceModel>();
   public int csvId;
	
		@Override
		
		
		public boolean isAddService(ServiceModel smodel) {
			int sid;
			 
			try {
			
				ps = conn.prepareStatement("insert into service values('0',?,?)");
//				ps.setInt(1, smodel.getSid());
				ps.setString(1, smodel.getName());
				ps.setInt(2, smodel.getPrice());
				
				int value = ps.executeUpdate();
				return value > 0 ? true : false;

			} catch (Exception ex) {
				System.out.println("The Error Is Occur...." + ex);

				return false;
			}

		}

		@Override
		public List<ServiceModel> getAllservice() {
		   try {
			   ps=conn.prepareStatement("select *from service");
			   rs=ps.executeQuery();
			   while(rs.next())
			   {
				   ServiceModel smodel=new ServiceModel();
				   smodel.setSid(rs.getInt(1));
				   smodel.setName(rs.getString(2));
				   smodel.setPrice(rs.getInt(3));
				   list.add(smodel);
				   if(list!=null) {
					   ps=conn.prepareStatement("select cvid from custvehijoin");
				   }
			   }
			   return list.size()>0?list:null;
			   
			   
		   }
		   catch(Exception ex)
		   {
			   return null;  
		   }
			
			
			
		}
		int bid = 0;

		public int getbid(int bid) {
			try {
				ps = conn.prepareStatement("select max(bid) from bill");
				rs = ps.executeQuery();
				if (rs.next()) {
					bid = rs.getInt(1);
				}
				return ++bid;
			} catch (Exception e) {
				return -1;
			}
		
		
		
		}

		@Override
		public boolean isAddCSVJoin(int cvid, int []sid, String date) {
			
				
				try {
					int bid1=this.getbid(bid);
					for (int i = 0; i < sid.length; i++) {
						if(sid!=null) {
							ps=conn.prepareStatement("insert into bill values(?,?,?,?)");
							ServiceModel smodel=new ServiceModel();
							ps.setInt(1,bid1);
							ps.setInt(2,cvid);
							ps.setInt(3,sid[i]);
							ps.setString(4, date);
							int value=ps.executeUpdate();
							i++;
							return value>0?true:false;
						}
					}
					
					
					return true;
				}
				catch(Exception ex)
				{
					System.out.println("Error is"+ex);
					
					return false;
				}
		}
		public int id;
		private int getCustId(String contact) {
			try {
				ps=conn.prepareStatement("select id from customer where contact=?");
				ps.setString(1,contact);
				rs=ps.executeQuery();
				if(rs.next()) {
					id=rs.getInt(1);
				}
				return id;
			} catch (Exception e) {
				System.out.println("Error in getting customer id"+e);
				return 0;
			}
		}
		
		@Override
		public int getCVID(String contact) {
			try {
				int cid=this.getCustId(contact);
				ps=conn.prepareStatement("select cvid from custvehijoin where id=?");
				ps.setInt(1, cid);
				rs=ps.executeQuery();
				if(rs.next()) {
					csvId=rs.getInt(1);
				}
				
				return csvId;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error in generating cvid"+e);
			}
			return 0;
		}

		
		
		
	

		
		
	
	}

	


