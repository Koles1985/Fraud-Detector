package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_5 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        return (transaction.getTrader().getCountry().equals("Germany")
                && transaction.getAmount() > 1000 );
    }
}
