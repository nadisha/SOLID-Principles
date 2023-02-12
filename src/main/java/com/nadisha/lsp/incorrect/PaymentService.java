package com.nadisha.lsp.incorrect;

import java.util.List;

public interface PaymentService {

	/*
	 * This is a bank payment operation, but not a loan payment operation
	 */
    void initiatePayments();
    
	/*
	 * This is a bank and loan payment operation
	 */    
    Object status();
    
	/*
	 * This is a bank and loan payment operation
	 */    
    List<Object> getPayments();
    
	/*
	 * This is a loan payment operation, but not a bank payment operation
	 */
    void intiateLoanSettlement();
    
	/*
	 * This is a loan payment operation, but not a bank payment operation
	 */
    void initiateRePayment();    
}
