package JavaIntermediate;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        set.add("Dennis");
        set.add("Denis");

        set1.add("Max");
        set1.add("Fabian");

        set2.add("Christian");
        set2.add("Jonas");

        TestSet.getElement(set);
        TestSet.getElement(set1);
        TestSet.getElement(set2);
    }

    public static void getElement(Collection<String> collection) {
        for (String string : collection) {
            System.out.println(string);
        }
    }

}
