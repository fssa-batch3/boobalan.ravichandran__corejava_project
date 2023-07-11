package day02.practice;

class UserDetails {
	String email;
	int id;
	String name;
	String password;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}
}

public class User {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setName("Vijay Kumar");
		user.setId(23456);
		user.setPassword("VijayKR@202");
		user.setEmail("vijaykumarkr476@gmail.com");

		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Id: " + user.getId());
		System.out.println("Password: " + user.getPassword());

	}

}
