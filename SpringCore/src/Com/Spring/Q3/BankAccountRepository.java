package Com.Spring;

public abstract class BankAccountRepository {
	public abstract double getBalance(long accountId);
    public abstract double updateBalance(long accountID,double newBalance);


}
