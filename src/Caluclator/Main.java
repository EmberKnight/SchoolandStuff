package Caluclator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            //   int userNum1 = scan.nextInt();
            //   int userNum2 = scan.nextInt();
            Calculator.division(10, 0);
        } catch (NoDivisionByZeroException e) {
            // System.out.println("Division by 0 is not possible!");
            // System.out.println("Please enter new number!");
            // int newNum1 = scan.nextInt();
            // int newNum2 = scan.nextInt();

            System.out.println(e.getMessage());

            //   try {
            //       Calculator.division(newNum1, newNum2);
            //   } catch (NoDivisionByZeroException e1) {
            //       e1.printStackTrace();
            //   }
        }
        System.out.println("Program runs again!");
    }

}
