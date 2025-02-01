package com.prapor.rules;

import com.prapor.primary.Transaction;

public interface FraudRule {

    public boolean isFraud(Transaction transaction);
}
