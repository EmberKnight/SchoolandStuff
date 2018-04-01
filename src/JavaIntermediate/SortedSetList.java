package JavaIntermediate;

import java.util.*;

public class SortedSetList{

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Dennis");
        set.add("Denis");
        set.add("Max");
        set.add("Fabian");
        set.add("Christian");
        set.add("Jonas");

        for (String string : set) {
            System.out.println(string);
        }

    }

}
