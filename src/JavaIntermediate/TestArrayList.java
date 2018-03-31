package JavaIntermediate;

import java.util.ArrayList;

public class TestArrayList {

    public TestArrayList() {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Denis");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        for (String string : nameList) {
            System.out.println(string.length());
        }

    }

}
