package biz.bagira.shds.map;


import java.util.HashMap;
import java.util.Map;

public class App16 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 20; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((key, val) -> System.out.println("Key = " + key + " Value = " + val));

        map.computeIfPresent(5, (num, val) -> val + num);
        System.out.println(map.get(5));    //val55

        map.computeIfAbsent(53, (val) -> "val"+val );
        System.out.println(map.get(53));   //val53

        map.remove(53,"val5");
        System.out.println(map.get(53)); //val53

        map.remove(53,"val53");
        System.out.println(map.get(53)); //null

        System.out.println(map.getOrDefault("1000","def"));  //def

        map.merge(1,"new_Value", String::concat);
        System.out.println(map.get(1)); //val1new_Value

    }
}
