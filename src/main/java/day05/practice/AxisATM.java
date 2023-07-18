package day05.practice;

public class AxisATM implements ATM {
	private static final double WITHDRAWAL_CHARGES = 5.0;

	@Override
	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new Exception("Insufficient balance to withdraw");
		}
		double totalAmount = amount + WITHDRAWAL_CHARGES;
		if (account.getBalance() >= totalAmount) {
			account.setBalance(account.getBalance() - totalAmount);
			return true;
		}
		return false;
	}

	public double getBalance(Account account) {
		return account.getBalance();
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
