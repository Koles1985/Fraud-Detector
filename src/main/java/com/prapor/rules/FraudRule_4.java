package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_4 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        if(transaction.getTrader().getCountry().equals("Jamaica")){
            return true;
        }else{
            return false;
        }
    }
}
