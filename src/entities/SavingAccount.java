package entities;

public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount() {
    	super();
    }

	public SavingAccount(Integer number, String holder, Double balancer, Double interestRate) {
		super(number, holder, balancer);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
     public void updateBalance() {
    	 balance+=balance*interestRate;
     }
}
