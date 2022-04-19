package com.coderjourney.customer;

public class FraudCheckResponse {
    private boolean isFraudster;

    public FraudCheckResponse() {
    }

    public FraudCheckResponse(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    public boolean isFraudster() {
        return isFraudster;
    }

    public void setFraudster(boolean fraudster) {
        isFraudster = fraudster;
    }
}
