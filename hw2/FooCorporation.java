package hw2;

public class FooCorporation {

    public static void calculatePay(double base, double hours) {
        double total = 0;

        if (base < 8.0) {
            System.out.println("Error: Base pay is less than minimum wage ratge($8.00 per hour)!");
            return;
        }

        if (hours > 60) {
            System.out.println("Error: Hours worked is greater than 60 hours!");
        } else if (hours <= 60 && hours > 40) {
            total = 40 * base + (hours - 40) * 1.5 * base;
            System.out.println("Total Pay is: $" + total + ".");
        } else {
            total = base * hours;
            System.out.println("Total Pay is: $" + total + ".");
        }
    }

    public static void main(String[] arguStrings) {
        System.out.println("Employee 1's pay:");
        calculatePay(7.50, 35);

        System.out.println("Employee 2's pay:");
        calculatePay(8.20, 47);

        System.out.println("Employee 3's pay:");
        calculatePay(10.00, 73);
    }
}