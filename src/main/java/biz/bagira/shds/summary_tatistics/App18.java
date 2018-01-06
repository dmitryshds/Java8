package biz.bagira.shds.summary_tatistics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summarizingInt;

public class App18 {

    public static void main(String[] args) throws IOException {

        System.out.println("\n----->Average line length:");
               System.out.println(
                   Files.lines(Paths.get("D:\\Java_Code\\AsyncServlet\\src\\main\\java\\com\\example\\rmi\\InitDictionaryServiceClient.java"))
                       .map(String::trim)
                       .filter(s5 -> !s5.isEmpty())
                       .collect(averagingInt(String::length))
                       );


               IntSummaryStatistics stats = Files.lines(Paths.get("D:\\Java_Code\\AsyncServlet\\src\\main\\java\\com\\example\\rmi\\InitDictionaryServiceClient.java"))
                       .map(String::trim)
                       .filter(s6 -> !s6.isEmpty())
                       .collect(summarizingInt(String::length));

               System.out.println(stats.getAverage());
               System.out.println("count=" + stats.getCount());
               System.out.println("max=" + stats.getMax());
               System.out.println("min=" + stats.getMin());

    }
}
