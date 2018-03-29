import java.util.Arrays;
import java.util.Random;

public class Array {

    private int[] test;
    private int num;

    public Array() {

        test = new int[10];
        setNum(0);

    }

    public void setNum(int num) {

        if(num <= test.length) {
            this.num = num;
        }
        else {
            System.out.println("False Value");
        }
    }

    public int getNum() {
        return num;
    }

    public void Fullen() {

        int i;
        Random rand = new Random();

        for (i = 0; i < test.length; i++) {
            test[i] = rand.nextInt(10 );
        }

        System.out.println(Arrays.toString(test));
        setNum(10);
        System.out.println(num);

    }

    public void numLeftSmallerThanRight() {

        int anz = 0;
        int i;

        if (num >= 2) {
            for (i = 1; i < test.length; i++) {
                if (test[i - 1] < test[i]) {
                    anz++;
                }
            }
        }
        else {
            System.out.println("Not enough nums!");
        }
        System.out.println(anz);
    }

    public void quotFirstLast() {

        double division;

        if (num >= 2) {
                if ((test[0] != 0) && (test[num - 1] != 0)) {
                    division = test[0] / test[num - 1];
                    System.out.println(division);
                }
                else {
                    System.out.println("Division with 0 is impossible!");
                }
        }
        else {
            System.out.println("Not enough nums!");
        }

    }

    public void minValForward() {

        int i;
        int min = Integer.MAX_VALUE;

        if (num >= 2) {
            for (i = 0; i < test.length; i++) {
                if (test[i] < min) {
                    min = test[i];
                    test[i] = test[0];
                    test[0] = min;
                }
            }
        }
        System.out.println(Arrays.toString(test));

    }

}
