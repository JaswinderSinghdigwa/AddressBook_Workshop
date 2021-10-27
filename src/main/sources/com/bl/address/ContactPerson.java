package com.bl.address;

public class ContactPerson {
	String firstName, lastName, address, city, state, email, phoneNumber;
	int zipCode;

	/**
	 * Create Constructor for Initializing the objects
	 */
	public ContactPerson(String firstName, String lastName, String address, String city, String state, int zipCode,
			String email, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Create Method for implementing getter and setter
	 */
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getMail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setMail(String eMail) {
		this.email = eMail;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Printing the AddressBook
	@Override
	public String toString() {
		return "ContactPerson{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
				+ address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", eMail='" + email + '\''
				+ ", phoneNumber='" + phoneNumber + '\'' + ", zipCode=" + zipCode + '}';
	}

}