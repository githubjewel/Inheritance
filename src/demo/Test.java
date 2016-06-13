package demo;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount obj = new SavingsAccount();
		obj.setAccountNo("I-123");
		obj.setCustomerName("customer-1");
		obj.deposit(100000);
		System.out.println(obj.withdraw(10000000));
	}
}
