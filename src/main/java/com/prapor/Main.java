package com.prapor;

import com.prapor.primary.FraudDetector;
import com.prapor.primary.Trader;
import com.prapor.primary.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Trader trader = new Trader("Tom", "Japan", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        boolean isFraud = fraudDetector.isFraud(transaction);
        String rule =fraudDetector.getRule();
        System.out.println("isFraud = " + isFraud);
        System.out.println("rule = " + rule);
    }
}