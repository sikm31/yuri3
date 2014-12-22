package com.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
public class OpMultiply implements Operation {
    public OpMultiply() {
    }

    public String getOpsName() {
        return " times ";
    }

    public long operate(long op1, long op2) {
        return op1 * op2;
    }
}
