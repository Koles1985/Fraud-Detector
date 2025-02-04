package com.prapor.rules;

import com.prapor.primary.Trader;
import com.prapor.primary.Transaction;

public class FraudRule_4 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if(trader.getCountry()== null){
            trader.setCountry("none");
        }
        return trader.getCountry().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "Rule_4  Trader country is Jamaica";
    }
}
