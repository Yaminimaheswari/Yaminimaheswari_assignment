package Com.Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccount {
	long accountId;
    String accountHolderName;
    String accountType;
    long accountBalance;

    
    public BankAccount(BankAccountController bankheart) {
    	this.bankheart=bankheart;
    	System.out.println("constructor is getting called");
    }
		
		
    
    private BankAccountController bankheart=new BankAccountController();
    @Autowired
    public void setBankAccountController(BankAccountController bankheart)
    {
    	
    this.bankheart =bankheart;
     System.out.println("setter method called");
    }
    
    public void showingDetails() 
    {
    	if(bankheart!=null)
    	{
    		bankheart.Controller();
        }
    	else {
    		System.out.println("above data entry  is failed");
    	}
   
    }


	public BankAccount(long accountId, String accountHolderName, String accountType, long accountBalance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
   
    }


	 public long getAccountId() {
		return accountId;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}


public String getAccountType() {
		return accountType;
	}


public long getAccountBalance() {
		return accountBalance;
	}


public void setAccountId(long accountId) {
		this.accountId = accountId;
	}


public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

public void showDetails()
	 {
	        System.out.println("AccountId:-"+getAccountId()+ 
	           "accountHolderName :-"+getAccountHolderName() 
	           +"accountType :-"+getAccountType() 
	           +" accountBalance:-"+getAccountBalance());
	       
	        //System.out.println("displaying the result");
	    
	 }


}
