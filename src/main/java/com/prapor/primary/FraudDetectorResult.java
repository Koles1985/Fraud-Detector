package com.prapor.primary;

public class FraudDetectorResult {

    private boolean isFraud;
    private String ruleName;

    public FraudDetectorResult(boolean isFraud, String ruleName) {
        this.isFraud = isFraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
