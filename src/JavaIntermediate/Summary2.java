package JavaIntermediate;

import java.util.*;

class CompareStringLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int length1 = o1.length();
        int length2 = o2.length();

        if (length1 > length2) {
            return 1;
        }
        else if (length2 > length1) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

class ReverseOrderString implements  Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -(o1.compareTo(o2));
    }
}

public class Summary2 {

    public static void main(String[] args) {

        List<String> employee = new ArrayList<>();

        employee.add("Dennis");
        employee.add("Max");
        employee.add("Denis");
        employee.add("Fabian");
        employee.add("Abraham");

        Collections.sort(employee, new ReverseOrderString());

        for (String string : employee) {
            System.out.println(string);
        }

    }

}
