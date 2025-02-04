package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_3 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }
}
