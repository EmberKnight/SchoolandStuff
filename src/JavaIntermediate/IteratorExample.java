package JavaIntermediate;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Dennis");
        list.add("Max");
        list.add("Denis");
        list.add("Fabian");
        list.add("Abraham");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);

            if(value.equals("Fabian")) {
                it.remove();
            }

        }

        System.out.println();

        for(String string : list) {
            System.out.println(string);
        }

    }

}
