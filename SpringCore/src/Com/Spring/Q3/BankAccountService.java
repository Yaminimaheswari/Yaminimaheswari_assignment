package Com.Spring;

public abstract class BankAccountService {
	public abstract double withdraw(long accountId, double balance);
	 public abstract double deposit(long accountId, double balance);
	 public abstract double getBalance(long accountId);
	 public abstract boolean fundTransfer(long fromAccount, long toAccount, double amount);


}
