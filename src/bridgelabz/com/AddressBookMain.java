package bridgelabz.com;

import java.util.Scanner;

public class AddressBookMain {
	
public static void main(String[] args) {
		
		System.out.println("How many Contacts you want to add:  ");
		
		Scanner scanner = new Scanner(System.in);
		int numOfContact = scanner.nextInt();
		addContacts(scanner,numOfContact );
		}
	
	private static void addContacts(Scanner scanner , int numOfContact) {
		
		
		Contacts contact[] = new Contacts[numOfContact];
		
		String firstName;
		String lastName;
		String address;
		String city;
		int zip;
		String email;
		String phoneNumber;
		
		for (int i=0; i<contact.length;i++ ) {
			
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

	
	
}
