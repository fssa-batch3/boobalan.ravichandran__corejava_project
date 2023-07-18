package day05.practice;

public class App {
	public static void main(String[] args) {
		Account account = new Account("12E45", 0.0);
		AxisATM axis1 = new AxisATM();

		axis1.deposit(account, 40000);

		try {
			axis1.withdraw(account, 2000);
			System.out.println("Account remaining balance: " + axis1.getBalance(account));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
