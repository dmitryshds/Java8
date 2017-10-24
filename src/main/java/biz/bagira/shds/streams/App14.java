package biz.bagira.shds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class App14 {

    static List<String> list = Arrays.asList("ddd", "aaa", "ccc", "eee", "bbb");

    public static void main(String[] args) {
        list.stream().filter(s -> (s.contains("a"))).forEach(System.out::println);  //aaa

        list.stream().sorted().forEach(System.out::print); //aaabbbcccdddeee
        System.out.println();
        boolean match = list.stream().anyMatch(Predicate.isEqual("ddd"));  //true
        System.out.println(match);

        list.stream().map(String::toUpperCase).forEach(System.out::print); //DDDAAACCCEEEBBB
        System.out.println();
        System.out.println(list.stream().filter(s -> s.startsWith("b")).count()); //1   count() is final operation


        Optional<String> reduce = list.stream().sorted().reduce((s1, s2) -> s1 + "+" + s2);
        reduce.ifPresent(System.out::println);  //aaa+bbb+ccc+ddd+eee





    }


}
