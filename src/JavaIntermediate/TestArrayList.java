package JavaIntermediate;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        final long timeStart = System.currentTimeMillis();
        TestArrayList.getNum(1999999, list);
        final long timeEnd = System.currentTimeMillis();
        System.out.println((timeEnd - timeStart) + " ms");
    }

    public static void getNum(int index, ArrayList<Integer> list) {

        System.out.println(list.get(index));

    }

}
