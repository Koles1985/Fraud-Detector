package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_2 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1_000_000;
    }

    @Override
    public String getRuleName() {
        return "Rule_2 = Transaction amount > 1_000_000";
    }
}
