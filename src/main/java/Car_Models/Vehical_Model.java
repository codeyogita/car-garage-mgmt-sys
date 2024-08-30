package Car_Models;

public class Vehical_Model {
	
	@Override
	public String toString() {
		return "Vehical_Model [vid=" + vid + ", comname=" + comname + ", vnum=" + vnum + ", model=" + model
				+ ", updateId=" + updateId + ", cmodel=" + cmodel + "]";
	}
	private int vid;
	private String comname;
	private String vnum;
	private String model;
	private String updateId;
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	Custumer_model cmodel;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getVnum() {
		return vnum;
	}
	public void setVnum(String vnum) {
		this.vnum = vnum;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Custumer_model getCmodel() {
		return cmodel;
	}
	public void setCmodel(Custumer_model cmodel) {
		this.cmodel = cmodel;
	}
	
	
	

}
