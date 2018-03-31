package JavaIntermediate;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        final long timeStart = System.currentTimeMillis();
        TestLinkedList.getNum(1999999, list);
        final long timeEnd = System.currentTimeMillis();
        System.out.println((timeEnd - timeStart) + " ms");
    }

    public static void getNum(int index, LinkedList<Integer> list) {

        System.out.println(list.get(index));

    }

}
