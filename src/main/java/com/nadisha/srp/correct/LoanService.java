package com.nadisha.srp.correct;

public class LoanService {
	public Float getLoanInterestRate(String loanType) {
		if (loanType.equals("home-loan")) {
			return 2.5f;
		}
		
		if (loanType.equals("personal-loan")) {
			return 12.25f;
		}
		
		if (loanType.equals("vehicle-loan")) {
			return 15.50f;
		}
		
		return null;
	}
}
