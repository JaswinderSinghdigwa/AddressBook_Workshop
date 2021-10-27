package com.bl.address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class AddressBook {

	// variable
	private static final Scanner scanner = new Scanner(System.in);
	public static List<ContactPerson> person = new ArrayList<ContactPerson>();


	/**
	 * Create Constructor for Initializing the variables with parameters
	 */
	public AddressBook(List<ContactPerson> person) {
		this.person = person;
	}

	// Empty Constructor
	public AddressBook() {
	}

	/**
	 * Create Method to Add the Contact List.
	 */
	public void addContactDetails(Scanner consoleInputReader) {
		System.out.println("How Many Contacts Do You Want to Enter In Address Book");
		int numberOfContacts = consoleInputReader.nextInt();
		for (int i = 1; i <= numberOfContacts; i++) {
			System.out.println("enter the First Name");
			consoleInputReader.nextLine();
			String firstName = consoleInputReader.nextLine();
			addressTest.givenFirstnameIstrue(firstName);
			System.out.println("enter the Last Name");
			String lastName = consoleInputReader.nextLine();
			System.out.println("enter the Address");
			String address = consoleInputReader.nextLine();
			System.out.println("enter the City");
			String city = consoleInputReader.nextLine();
			System.out.println("enter the State");
			String state = consoleInputReader.nextLine();
			System.out.println("enter the Zip Code");
			int zipCode = consoleInputReader.nextInt();
			consoleInputReader.nextLine();
			System.out.println("enter the Email address");
			String email = consoleInputReader.nextLine();
			System.out.println("enter the Phone Number");
			String phoneNumber = consoleInputReader.nextLine();

			String pName = firstName + lastName;
			for (Iterator<ContactPerson> iterator = person.iterator(); iterator.hasNext();) {
				ContactPerson contact = iterator.next();
				String contactName = contact.getFirstName() + contact.getLastName();
				if (contactName.equals(pName)) {
					System.out.println("Sorry this contact already exists.");
					return; // the name exists, so we exit the method.
				}
			}
			// Otherwise... you've checked all the elements, and have not found a duplicate
			person.add(new ContactPerson(firstName, lastName, address, city, state, zipCode, email, phoneNumber)); // Storing
																													// the
																													// Contacts
			System.out.println(person); // Printing the Contacts
		}
	}

}
