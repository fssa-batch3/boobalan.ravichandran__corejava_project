package day05.practice;

class IciciATM implements ATM {

	private static final double WITHDRAWAL_CHAGRES = 10.0;

	public boolean deposit(Account account, double amount) {

		account.setBalance(account.getBalance() + amount);
		return true;
	}

	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 10000) {
			throw new Exception("Insufficient balance to withdraw");
		}
		double totalAmount = amount + WITHDRAWAL_CHAGRES;

		if (account.getBalance() >= totalAmount) {

			account.setBalance(account.getBalance() - totalAmount);
			return true;

		} else {

			return false;
		}

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
