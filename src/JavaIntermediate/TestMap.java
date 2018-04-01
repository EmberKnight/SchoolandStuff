package JavaIntermediate;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "Lenovo");
        map1.put(2, "Apple");
        map1.put(3, "Dell");

        for (Map.Entry<Integer, String> map : map1.entrySet()) {
            Integer key = map.getKey();
            String value = map.getValue();

            System.out.println(key + value);

        }
    }

}
