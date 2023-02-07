package com.nadisha.isp.incorrect;

import java.util.List;

public interface PaymentService {

	// Bank Payment Operations
    void initiatePayments();
    
    Object status();
    
    List<Object> getPayments();
    
    // Loan Payment Operations
    void intiateLoanSettlement();
    
    void initiateRePayment();    
}
