package bridgelabz.com;

import java.util.Scanner;

public class AddressBookMain {
	
public static void main(String[] args) {
		
		System.out.println("How many Contacts you want to add:  ");

		Scanner scanner = new Scanner(System.in);
		
		int numOfContact = scanner.nextInt();	
		Contacts contact[] = new Contacts[numOfContact];
		addContacts(scanner,numOfContact,contact );
		
		String email = scanner.next();
		System.out.println("Enter a person email to edit the contact");
		editContacts(scanner, contact, email);
		}
	
	private static void addContacts(Scanner scanner , int numOfContact , Contacts contact[]) 
	{
		int id;
		String firstName;
		String lastName;
		String address;
		String city;
		int zip;
		String email;
		String phoneNumber;
		
		for (int i=0; i<contact.length;i++ ) {
			
		    System.out.println("Enter id ");
		    id = scanner.nextInt();
			
			System.out.println("Enter First name: ");
			firstName = scanner.next();
			
			System.out.println("Enter Last name: ");
			lastName = scanner.next();
			
			System.out.println("Enter your Address: ");
			address = scanner.next();
			
			System.out.println("Enter Your City: ");
			city = scanner.next();
			
			System.out.println("Enter Zip code: ");
			zip = scanner.nextInt();

			System.out.println("Enter Your Email");
			email = scanner.next();

			System.out.println("Enter Your Number:");
			phoneNumber = scanner.next();
			
			contact[i] = new Contacts(firstName, lastName , address, city, zip, email ,phoneNumber);

		}
		
		for (int i = 0 ; i<contact.length; i++) 
		{
			System.out.println(contact[i]);
		}
		
	}
	private static void editContacts(Scanner scanner , Contacts[] contact, String email) 
	{
		
		String firstName;
		String lastName;
		String address;
		String city;
		int zip;
		String phoneNumber;
		
		for (int i=0; i<contact.length;i++ ) {
			
			if (contact[i].getEmail().equalsIgnoreCase(email)) {
			
			System.out.println("Enter First name: ");
			firstName = scanner.next();
			contact[i].setFirstName(firstName);
			
			System.out.println("Enter Last name: ");
			lastName = scanner.next();
			contact[i].setLirstName(lastName);
			
			System.out.println("Enter your Address: ");
			address = scanner.next();
			contact[i].setAddress(address);
			
			System.out.println("Enter Your City: ");
			city = scanner.next();
			contact[i].setCity(city);
			
			System.out.println("Enter Zip code: ");
			zip = scanner.nextInt();
			contact[i].setZip(zip);

			System.out.println("Enter Your Email");
			email = scanner.next();
			contact[i].setEmail(email);

			System.out.println("Enter Your Number:");
			phoneNumber = scanner.next();
			contact[i].setPhoneNumber(phoneNumber);
			
			}

		}
		
		for (int i = 0 ; i<contact.length; i++) 
		{
			System.out.println(contact[i]);
		}
		
	}
}
