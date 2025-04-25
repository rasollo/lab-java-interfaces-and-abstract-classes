package Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    // Round with two numbers and returns double
    public static double rounder(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
    // Change signal and round with one number
    public static BigDecimal changeSignal(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }
    public static void main(String[] args) {
        // Double examples:
        System.out.println(rounder(BigDecimal.valueOf(4.25435)));
        // only for certificate the method returns a double:
        double b = rounder(BigDecimal.valueOf(4.257));
        System.out.println(b);

        // Change signal and round examples:
        System.out.println(changeSignal(BigDecimal.valueOf(1.2345)));
        System.out.println(changeSignal(BigDecimal.valueOf(-45.67)));
    }
}