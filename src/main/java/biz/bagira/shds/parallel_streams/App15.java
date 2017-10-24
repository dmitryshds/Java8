package biz.bagira.shds.parallel_streams;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class App15 {

    public static void main(String[] args) {
        int val = 1000000;

        List<String> list = new ArrayList<>(val);
        for (int i = 0; i < val; i++) {
            list.add(UUID.randomUUID().toString());
        }

//        list.forEach(System.out::println);

        //stream sort

        long start = System.nanoTime();

        long count = list.stream().sorted().count();

        System.out.println(count);

        long end = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(end - start);

        System.out.println(String.format("work time %d ", millis));     //  work time 612 ms

        //parallel sort
        long startP = System.nanoTime();

        long countP = list.parallelStream().sorted().count();

        System.out.println(countP);

        long endP = System.nanoTime();

        long millisP = TimeUnit.NANOSECONDS.toMillis(endP - startP);

        System.out.println(String.format("parallel work time %d ", millisP));     //  parallel work time 340 ms


    }
}
