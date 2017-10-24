package biz.bagira.shds.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Vova","Misha","Anna","Dasha","Petja");
        System.out.println(stringList);

        Collections.sort(stringList,(String a,String b) -> b.compareTo(a) );
        System.out.println(stringList);

        Collections.sort(stringList,( a, b) -> a.compareTo(b) );
        System.out.println(stringList);

    }
}
