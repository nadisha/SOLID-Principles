package com.nadisha.lsp.correct;

public interface LoanService extends PaymentService {
    void intiateLoanSettlement();
    
    void initiateRePayment();
}
