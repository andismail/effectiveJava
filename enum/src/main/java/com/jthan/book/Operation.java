package com.jthan.book;

import java.util.HashMap;
import java.util.Map;

/**
 * 带抽象方法的枚举
 */
public enum Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) { return x - y; }
    };

    private static final Map<String, Operation> stringToEnum = new HashMap<>();
    static{
        for (Operation operation : values()) {
            stringToEnum.put(operation.toString(), operation);
        }
    }
    //2016-02-29 18:26 放在Map里感觉挺巧妙
    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }

    //若新增枚举,则必须要实现此方法
    public abstract double apply(double x, double y);

    private final String symbol;

    Operation(String symbol){
        this.symbol = symbol;
    }

    public String symbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
