package encapsulationExample;

public class Student {

	// Bean class
	// keyword this
	// encapsulation
	
	
	private String firstName;
	private String lastName;
	
	public Student() {
		firstName = "";
		lastName = "";
	}
	
	// getter for the first name - make sure that your return data type matches the variable
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	// setters - you gonna return nothing - void. but you have to get the new data in as your parameter
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
}