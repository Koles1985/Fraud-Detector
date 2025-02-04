package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_2 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1_000_000;
    }
}
