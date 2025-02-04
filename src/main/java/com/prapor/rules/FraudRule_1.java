package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_1 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

    @Override
    public String getRuleName() {
        return "Rule_1 = Trader name Pokemon";
    }
}
