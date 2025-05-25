package corejava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("banana",3);
        map.put("Apple",2);
        System.out.println(map);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());



        }
    }
}
