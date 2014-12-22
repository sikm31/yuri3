package com.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
public interface Operation {
    long operate(long op1, long op2);
    String getOpsName();

}
