package com.prapor.rules;

import com.prapor.primary.Transaction;

public class FraudRule_1 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        if(transaction.getTrader().getFullName().equals("Pokemon")){
            return true;
        }else{
            return  false;
        }
    }
}
