package com.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
public class OpAdd implements Operation {
    public OpAdd() {
    }

    public String getOpsName() {
        return " plus ";
    }

    public long operate(long op1, long op2) {
        return op1 + op2;
    }
}
