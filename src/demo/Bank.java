package demo;

public class Bank {

	private String accountNo;
	private String customerName;
	private double balance;
	
	public String deposit(double amount){
		
		  balance += amount;
		  return "Successfully Deposited...";
	}
	
	public String withdraw(double amount){
		
		balance -= amount;
		return "Withdraw Successfully completed...";
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	

	

	
}
