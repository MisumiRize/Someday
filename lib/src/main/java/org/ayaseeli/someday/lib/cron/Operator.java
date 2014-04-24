package org.ayaseeli.someday.lib.cron;

public class Operator {
    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public int calculateNext(int before) {
        return before;
    }

    public long calculateInterval() {
        return 1;
    }
}
