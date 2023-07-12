package day03.practice;

public class TestUser {

	public static void main(String[] args) {

		User user1 = new User();
		// user
		user1.setName("Vijay Kumar");
		user1.setEmailId("vijaykumar457@gmail.com");
		user1.setPassword("xyz@2004");

		System.out.println(user1.getName() + " - " + user1.getEmailId() + " - " + user1.getPassword());

//		second instance
		User user2 = new User("Ragunath", "ragunath45@gmail.com", "abx@2005");

		System.out.println(user2.getName() + " - " + user2.getEmailId() + " - " + user2.getPassword());

	}

}
