package demo;

public class CheckingAccount extends Bank{

	private double charge;

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	public String withdraw(double amount) {

		return super.withdraw(amount);
		
		
	}
	
}
