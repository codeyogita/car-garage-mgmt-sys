package Car_Models;

public class Custumer_model {
	@Override
	public String toString() {
		return "Custumer_model [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", email=" + email + ", custId=" + custId + "]";
	}
	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String custId;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
	
	
	
	

}
