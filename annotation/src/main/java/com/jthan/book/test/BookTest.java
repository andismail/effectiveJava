package com.jthan.book.test;

/**
 * Created by Jthan on 16/2/29.
 */
public class BookTest {

    public static void main(String[] args) {
        System.out.println(Planet.MARS.surfaceGravity());

        Operation[] ops = Operation.values();
        double x = 2, y = 4;
        for (Operation op : ops) {
            System.out.printf("%f %s %f = %f%n", 2, op, 4, op.apply(x, y));
        }

    }
}
