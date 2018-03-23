import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        Figuren test = new Figuren();
        test.rechteck(x, y);

        IfElse test1 = new IfElse();
        test1.Score();

        Switch test2 = new Switch();
        test2.Case();

    }
}
