package com.springinaction.springidol;

/**
 * Created by y.voytovich on 25.12.2014.
 */
public class Stage {
    private Stage() {
    }
    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }
    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
