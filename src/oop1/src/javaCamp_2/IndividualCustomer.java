package javaCamp_2;

public class IndividualCustomer extends Customer { // IndividualCustomer class inherits Customer class
	private String firstName;
	private String lastName;


	public String getFirstName() { // getter
		return firstName;
	}


	public void setFirstName(String firstName) { // setter
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
