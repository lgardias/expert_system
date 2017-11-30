package com.lgardias.assertion;

public class Assertion {
    private String assertion;
    private int stepNumber;

    public Assertion(String assertion, int stepNumber){
        this.assertion = assertion;
        this.stepNumber = stepNumber;
    }

    public String getAssertion() {
        return assertion;
    }

    public int getStepNumber() {
        return stepNumber;
    }
}
