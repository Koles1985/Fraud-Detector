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
        String cityTrader = transaction.getTrader().getCity();
        String countryTrader = transaction.getTrader().getCountry();


        if (scammers.contains(nameTrader)){
            return true;
        }
        if (transaction.getAmount() > 1_000_000){
            return  true;
        }
        if (cityTrader.equals("Sydney")) {
            return true;
        }
        if (countryTrader.equals("Jamaica")){
            return true;
        }
        if(transaction.getAmount() > 1000 & countryTrader.equals("Germany")){
            return  true;
        }
        else {
            return false;
        }
    }

}
