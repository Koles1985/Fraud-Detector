package com.prapor.rules;

import com.prapor.primary.Transaction;

public interface FraudRule {

    public String getRuleName();

    public boolean isFraud(Transaction transaction);
}
