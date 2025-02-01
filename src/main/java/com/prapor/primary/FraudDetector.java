package com.prapor.primary;

import com.prapor.rules.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudList;

    public FraudDetector() {
        fraudList = new ArrayList<>();
        Collections.addAll(fraudList, new FraudRule_1(), new FraudRule_2(), new FraudRule_3(),
                new FraudRule_4(), new FraudRule_5());
    }

    public boolean isFraud(Transaction transaction){
        boolean isNotReliable = false;
        for (FraudRule fr : fraudList){
            isNotReliable = fr.isFraud(transaction);
            if(isNotReliable){
                return isNotReliable;
            }
        }
        return isNotReliable;
        }
}
