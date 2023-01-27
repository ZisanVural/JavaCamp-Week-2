package javaCamp_2;


public class Customer {
	
	private int id;
	private String customerNumber;
	private String phoneNumber; // things that do not perform mathematical operations on are strings.


	public int getId() {
		// getter
		return id;
	}

	public void setId(int id) { 
		// setter
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
