package model;

public class Address {

	private int pincode;
	private String addressLine1, addressLine2, tal, dist, state, country;

	public Address() {

	}

	public Address(int pinCode2, String addressLine1, String addressLine2, String tal, String dist, String state,
			String country) {
		this.pincode = pinCode2;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.tal = tal;
		this.dist = dist;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", tal=" + tal + ", dist=" + dist + ", state=" + state + ", country=" + country + "]";
	}

}
