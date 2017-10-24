package biz.bagira.shds.functions;


import java.util.function.Function;

public class App9 {
    public static void main(String[] args) {
        Function<String,Integer> function = Integer::valueOf;

        Integer rezult = function.apply("10");
        System.out.println(rezult);    //10

        String apply = function.andThen(String::valueOf).apply("25"); // string "25"

        Function<Integer,Integer> incrFunction = (s) -> s + 1;
        Function<Integer,Integer> multFunction = (s) -> s * 2;

        Integer rezultTwoFunction = incrFunction.compose(multFunction).apply(5);
        System.out.println(rezultTwoFunction);  //5*2  + 1 = 11
    }
}
