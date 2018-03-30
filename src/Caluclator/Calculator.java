package Caluclator;

public class Calculator {

    public static void addition(int userNum1, int userNum2) {
        System.out.println("Result: " + (userNum1 + userNum2));
    }

    public static void subtraction(int userNum1, int userNum2) {
        System.out.println("Result: " + (userNum1 - userNum2));
    }

    public static void division(int userNum1, int userNum2) throws NoDivisionByZeroException {
        if ((userNum2 == 0) || (userNum1 == 0)) {
            throw new NoDivisionByZeroException("No division by zero possible!");
        } else {
            System.out.println("Result: " + (userNum1 / userNum2));
        }
    }

    public static void multiplication(int userNum1, int userNum2) {
        System.out.println("Result: " + (userNum1 * userNum2));
    }

}
