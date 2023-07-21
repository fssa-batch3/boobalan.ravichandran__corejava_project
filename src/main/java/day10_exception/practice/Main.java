package day10_exception.practice;

import java.util.Scanner;

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {

		if (" ".equals(emailId)) {
			return true;
		} else if (emailId.contains("@") && emailId.contains(".")) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email address!");
		}
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an email address: ");
		String email = sc.nextLine();

		try {
			boolean isValid = EmailValidator.isValidEmail(email);
			System.out.println("Email is valid: " + isValid);
		} catch (InvalidEmailException e) {
			System.out.println("Invalid email: " + e.getMessage());
		}
	}
}
