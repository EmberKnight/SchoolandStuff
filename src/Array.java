import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Objects;

public class Array {

    private int[] temp;
    private int num;
    int i = 0;

    public Array() {

        temp = new int[15];
        setNum(0);

    }

    public void setNum(int num) {

        if (num <= temp.length) {
            this.num = num;
        } else {
            System.out.println("False Value");
        }
    }

    public int getNum() {
        return num;
    }

    public void Fullen() {

        int i;
        Random rand = new Random();

        for (i = 0; i < temp.length; i++) {
            temp[i] = rand.nextInt(50);
        }

        System.out.println(Arrays.toString(temp));
        setNum(10);
        System.out.println(num);

    }

    public void numLeftSmallerThanRight() {

        int anz = 0;
        int i;

        if (num >= 2) {
            for (i = 1; i < temp.length; i++) {
                if (temp[i - 1] < temp[i]) {
                    anz++;
                }
            }
        } else {
            System.out.println("Not enough nums!");
        }
        System.out.println(anz);
    }

    public void quotFirstLast() {

        double division;

        if (num >= 2) {
            if ((temp[0] != 0) && (temp[num - 1] != 0)) {
                division = temp[0] / temp[num - 1];
                System.out.println(division);
            } else {
                System.out.println("Division with 0 is impossible!");
            }
        } else {
            System.out.println("Not enough nums!");
        }

    }

    public void minValForward() {

        int i;
        int min = Integer.MAX_VALUE;

        if (num >= 2) {
            for (i = 0; i < temp.length; i++) {
                if (temp[i] < min) {
                    min = temp[i];
                    temp[i] = temp[0];
                    temp[0] = min;
                }
            }
        }
        System.out.println(Arrays.toString(temp));

    }


    public void minPos(int pos1, int pos2) {
        Objects.requireNonNull(temp);
        if (num <= temp.length) {
            if (pos1 != pos2) {
                if (pos1 < pos2) {
                    if (pos1 >= 0 && pos2 <= num) {
                        int min = temp[pos1];
                        int minPos = pos1;
                        for (int i = pos1 + 1; i <= pos2; i++) {
                            if (temp[i] < min) {
                                min = temp[i];
                                minPos = i;
                            }
                        }
                        System.out.println(minPos);
                    } else {
                        throw new IllegalArgumentException("Pos1 und Pos2 müssen zwischen 0 und " + num + " liegen!");
                    }
                } else {
                    throw new IllegalArgumentException("Pos1 darf nicht größer als Pos2 sein!");
                }
            } else {
                throw new IllegalArgumentException("Pos1 darf nicht Pos2 sein!");
            }
        } else {
            throw new IllegalArgumentException("Anzahl ist nicht gültig!");
        }
    }


}