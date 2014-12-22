package com.spring.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
public class ScreenWriter implements ResultWriter {

    public void showResult(String result) {
        System.out.println(result);
    }
}
