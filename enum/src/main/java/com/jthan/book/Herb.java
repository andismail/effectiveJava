package com.jthan.book;

/**
 * Created by Jthan on 16/3/1.
 */
public class Herb {
    public enum Type{ ANNUAL, PERENNIAL, BIENNIAL}

    private final String name;
    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }
}
