package demo;

public class SavingsAccount extends Bank{

	private double interest;

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
    public String withdraw(double amount) {
    	
    	if(super.getBalance()-amount>0){ 
    	return super.withdraw(amount);
    	}
    	return "Not possilble";
    }
	
}
