package com.prapor.rules;

import com.prapor.primary.Trader;
import com.prapor.primary.Transaction;

public class FraudRule_5 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if(trader.getCountry() == null){
            trader.setCountry("none");
        }
        return (trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1_000 );
    }

    @Override
    public String getRuleName() {
        return "Rule_5 Trader country is Germany and transaction amount > 1_000";
    }
}
