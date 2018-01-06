package biz.bagira.shds.predicats;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App20 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,5,8,15,24,48,75,2,0,41);

        System.out.println(sumAll(numbers, n -> true));     // summ all elements
        System.out.println(sumAll(numbers, n -> n % 2 == 0));  // summ elements if n%2==0
        System.out.println(sumAll(numbers, n -> n > 3));    //summ all elements that > 3

    }


    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
