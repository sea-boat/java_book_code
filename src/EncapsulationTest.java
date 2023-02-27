
class Account {
	private double balance = 0;

	public void withdraw(double num) {
		if (num < 0)
			System.out.println("error");
		else
			balance = balance - num;
	}

	public void deposit(double num) {
		if (num < 0)
			System.out.println("error");
		else
			balance = balance + num;
	}

	public double getBalance() {
		return balance;
	}
}

public class EncapsulationTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(20.5);
		account.deposit(20.5);
		account.withdraw(-10);
		System.out.println("the balance is " + account.getBalance());
	}
}