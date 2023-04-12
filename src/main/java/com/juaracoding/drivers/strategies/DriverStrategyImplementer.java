package com.juaracoding.drivers.strategies;

import com.juaracoding.utils.Regular;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy) {
        return switch (strategy) {
            case Regular.CHROME -> new Chrome();
            case Regular.FIREFOX -> new Firefox();
            default -> null;
        };
    }
}
