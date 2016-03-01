package com.jthan.book;

/**
 * 2016-03-01 觉得此处很巧妙  对内部类的理解与使用很到位,
 *
 * 内部枚举类中有个抽象方法,使得此内部枚举每增加一个类型就必须要实现这个抽象类,
 * 同时也是因为内部类中的pay方法使用了此抽象方法所以必须实现
 *
 * 最后在外边的枚举类型中持有内部类的引用,计算薪酬传参直接调用内部类的pay
 */
public enum PayrollDay1 {
    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;
    PayrollDay1(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    }

    private enum PayType {
        WEEKDAY{
            double overtimePay(double hrs, double payRate) {
                return hrs - HOURS_PER_SHIFT <= 0 ? 0 : (hrs - HOURS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            double overtimePay(double hrs, double payRate) {
                return hrs * payRate / 2;
            }
        };

        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay(double hrs, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay + overtimePay(hoursWorked, payRate);
        }
    }
}
