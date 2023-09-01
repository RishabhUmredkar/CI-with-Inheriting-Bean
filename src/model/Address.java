package model;

public class Address {

	private String Addressline1, city, State ,country;

	public Address(String addressline1, String city, String state, String country) {
		super();
		Addressline1 = addressline1;
		this.city = city;
		State = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [Addressline1=" + Addressline1 + ", city=" + city + ", State=" + State + ", country=" + country
				+ "]";
	}
	
	
}
