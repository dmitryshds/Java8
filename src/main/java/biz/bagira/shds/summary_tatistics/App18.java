package biz.bagira.shds.summary_tatistics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summarizingInt;

public class App18 {
      private static final String PATH_TO_FILE = "D:\\Java_Code\\AsyncServlet\\src\\main\\java\\com\\example\\rmi\\InitDictionaryServiceClient.java";
    public static void main(String[] args) throws IOException {

        System.out.println("\n----->Average line length:");
               System.out.println(
                   Files.lines(Paths.get(PATH_TO_FILE))
                       .map(String::trim)
                       .filter(s5 -> !s5.isEmpty())
                       .collect(averagingInt(String::length))
                       );


               IntSummaryStatistics stats = Files.lines(Paths.get(PATH_TO_FILE))
                       .map(String::trim)
                       .filter(s6 -> !s6.isEmpty())
                       .collect(summarizingInt(String::length));

               System.out.println(stats.getAverage());
               System.out.println("count=" + stats.getCount());
               System.out.println("max=" + stats.getMax());
               System.out.println("min=" + stats.getMin());



        IntSummaryStatistics stats2 = Files.lines(Paths.get(PATH_TO_FILE))
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .mapToInt(String::length)
            .summaryStatistics();


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("123");
        list.add("1234");
        list.add("567");

        Map<Boolean, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(s -> s.startsWith("1")));
        System.out.println(map);



    }
}
