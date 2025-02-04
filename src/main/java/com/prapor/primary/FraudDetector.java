package com.prapor.primary;

import com.prapor.rules.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudList;
    private String rule;


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
                    rule = fr.getRuleName();
                    return isForbidden;
                }
            }
        return isForbidden;
    }

    public String getRule(){
       return this.rule;
    }

    public FraudDetectorResult isFraud2(Transaction transaction){
        for (FraudRule fr : fraudList){
            if(fr.isFraud(transaction)){
                rule = fr.getRuleName();
                return new FraudDetectorResult(true, rule);
            }
        }
        return new FraudDetectorResult(false, null);
    }


}
