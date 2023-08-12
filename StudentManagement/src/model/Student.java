package model;

import java.util.Date;

public class Student {

	private byte rollNo;
	private String std;
	private Date dob;

	// Has a relationship
	private Name name;
	private Address address;

	public Student() {

	}

	public Student(byte rollNo, String std, Date dob, Name name, Address address) {
		super();
		this.rollNo = rollNo;
		this.std = std;
		this.dob = dob;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", dob=" + dob + ", name=" + name + ", address=" + address
				+ "]";
	}

}
