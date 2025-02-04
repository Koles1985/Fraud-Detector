package com.prapor.primary;

import com.prapor.rules.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudList;
    private int indexOfRule = -1;

    public FraudDetector() {
        fraudList = new ArrayList<>();
        Collections.addAll(fraudList, new FraudRule_1(), new FraudRule_2(), new FraudRule_3(),
                new FraudRule_4(), new FraudRule_5());
    }

    public boolean isFraud(Transaction transaction){
        boolean isForbidden = false;
        for (FraudRule fr : fraudList){
            isForbidden = fr.isFraud(transaction);
                if(isForbidden){
                    indexOfRule = fraudList.indexOf(fr);
                    return isForbidden;
                }
            }
        return isForbidden;
    }

    public String getRule(){
        String className = null;
        if(indexOfRule >= 0) {
            System.out.println("FraudDetector getRule indexOfRule = " + indexOfRule);
            className = fraudList.get(indexOfRule).getClass().toString();
        }
        System.out.println("indexOfRule < 0 ? - " + indexOfRule + " className = " + className);
        return className;
    }


}
