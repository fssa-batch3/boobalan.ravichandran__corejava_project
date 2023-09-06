package day10_exception.practice;

import java.util.*;

class User {
	int id;
	String name;
	String emailId;

	public User(int id, String name, String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

}

class UserRegistration {
	ArrayList<User> userList = new ArrayList<>();

	public void register(User user) throws UserAlreadyExistsException {
		for (User existingUser : userList) {
			if (existingUser.emailId.equals(user.emailId)) {
				throw new UserAlreadyExistsException("User with email ID already exists: " + user.emailId);
			}
		}
		userList.add(user);
		System.out.println("User registered successfully!");
	}

}

public class UserMain {

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();

		try {
			registration.register(new User(1, "John Doe", "john@example.com"));
			registration.register(new User(2, "Jane Smith", "jane@example.com"));
			registration.register(new User(3, "Mike Johnson", "john@example.com")); // This should throw
																					// UserAlreadyExistsException
		} catch (UserAlreadyExistsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
