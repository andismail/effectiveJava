package com.jthan.book;

/**
 * 大体看这里是没有问题的,但若增加枚举的时候,维护起来很有问题
 */
public enum PayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY;

    private static final int HOURS_PER_SHIFT = 8;

    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;

        double overtimePay;

        switch (this) {
            case SATURDAY:
            case SUNDAY:
                overtimePay = hoursWorked * payRate / 2;
                break;
            default:
                overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
                        0 : hoursWorked - HOURS_PER_SHIFT;
                break;
        }
        return basePay + overtimePay;
    }
}
