package JavaBasics;

import java.util.Scanner;

public class WhileLoop {


    public void Count() {

        int anzahlGegner = 0;

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println("Choose difficulty!");

        if (userInput == 1) {

            anzahlGegner = 10;

        } else if (userInput == 2) {

            anzahlGegner = 15;

        }

        while (anzahlGegner != 0) {
            System.out.println("Gegner erstellt!");
            anzahlGegner--;
        }

    }

}
