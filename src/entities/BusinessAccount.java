package entities;

public class BusinessAccount extends Account{
//O Exetends serve para puxar as Classes e não objetos.
	private Double loanLimit;
	
	public BusinessAccount() {
		super ();
	}

	public BusinessAccount(Integer number, String holder, Double balancer, Double loanLimit) {
		super(number, holder, balancer);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount<=loanLimit) {
		
			deposit(amount);
	   }
	}
	
}
