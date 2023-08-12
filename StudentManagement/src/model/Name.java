package model;

public class Name {

	private String abbr, firstName, middleName, lastName;

	public Name() {

	}

	public Name(String abbr, String firstName, String middleName, String lastName) {
		this.abbr = abbr;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [abbr=" + abbr + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + "]";
	}
	
	

}
