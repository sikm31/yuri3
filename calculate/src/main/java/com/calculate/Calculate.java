package com.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
public class Calculate {
    private Operation ops = new OpAdd();
    private ResultWriter wtr = new ScreenWriter();

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.execute(args);
    }


    public void execute(String [] args) {
        long op1 = Long.parseLong("3000");
        long op2 = Long.parseLong("3");
        wtr.showResult("The result of " + op1 +
                ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }
}
