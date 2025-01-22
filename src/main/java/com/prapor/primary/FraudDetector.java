package com.prapor.primary;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    private List<String> scammers;


    public FraudDetector() {
        this.scammers = new ArrayList<>()
        {{
            add("Pokemon");
        }};
    }

    public boolean isFraud(Transaction transaction){
        String nameTrader = transaction.getTrader().getFullName();
        if(scammers.contains(nameTrader)) {
            return true;
        }else {
            return false;
        }
    }

}
