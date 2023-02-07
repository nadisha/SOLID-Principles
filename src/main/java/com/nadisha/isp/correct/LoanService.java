package com.nadisha.isp.correct;

public interface LoanService extends PaymentService {
    void intiateLoanSettlement();
    
    void initiateRePayment();
}
