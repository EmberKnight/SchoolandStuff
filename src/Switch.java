import java.util.Scanner;

public class Switch {

        public void Case() {


            Scanner test1 = new Scanner(System.in);
            int userInput = test1.nextInt();

            switch(userInput) {

                case 0:
                    System.out.println("0");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 5:
                    System.out.println("5");
                    break;
            }

        }

}
