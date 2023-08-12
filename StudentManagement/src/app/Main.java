package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Address;
import model.Name;
import model.Student;

public class Main {

	public static void main(String[] args) throws ParseException {

		Student students[] = new Student[100];
		Scanner scanner = new Scanner(System.in);
		byte choice = 0;

		do {
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Update");
			System.out.println("5. Exit");

			choice = scanner.nextByte();

			switch (choice) {
			case 1:
				// Add Student
				byte rollNo;
				String std;
				String db;
				Date dob;
				String abbr, firstName, middleName, lastName;
				int pinCode = 0;
				String addressLine1, addressLine2, tal, dist, state, country;

				System.out.println("Enter roll number");
				rollNo = scanner.nextByte();

				System.out.println("Enter Class/Standard");
				std = scanner.next();

				System.out.println("Enter roll date of birth(yyyy-MM-dd)");
				db = scanner.next();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				dob = simpleDateFormat.parse(db);

				System.out.println("Enter Initial");
				abbr = scanner.next();

				System.out.println("Enter First Name");
				firstName = scanner.next();

				System.out.println("Enter Middle Name");
				middleName = scanner.next();

				System.out.println("Enter Last Name");
				lastName = scanner.next();

				System.out.println("Enter Address Line 1");
				addressLine1 = scanner.next();

				System.out.println("Enter Address Line 2");
				addressLine2 = scanner.next();

				System.out.println("Enter Taluka");
				tal = scanner.next();

				System.out.println("Enter Dist.");
				dist = scanner.next();

				System.out.println("Enter State");
				state = scanner.next();

				System.out.println("Enter Country");
				country = scanner.next();

				System.out.println("Enter Pin Code");
				pinCode = scanner.nextInt();

				Name name = new Name(abbr, firstName, middleName, lastName);
				Address address = new Address(pinCode, addressLine1, addressLine2, tal, dist, state, country);
				Student student = new Student(rollNo, std, dob, name, address);

				boolean inserted = false;

				for (int i = 0; i <= students.length - 1; i++) {
					if (students[i] == null) {
						students[i] = student;
						inserted = true;
						break;
					}
				}

				if (inserted) {
					System.out.println(student + " Addedd Sucessfully..!!");
				} else {
					System.err.println("No more students can be added..!!!");
				}

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			default:
				if (choice != 5)
					System.out.println("Incorrect Option");
			}

		} while (choice != 5);
		scanner.close();
	}

}
