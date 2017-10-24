package biz.bagira.shds.consumers;


import java.util.function.Consumer;

public class App11 {

    public static void main(String[] args) {

        Consumer<Integer> printConsumer = System.out::println;
        Consumer<String> printStringConsumer = System.out::println;

        printConsumer.accept(10);   //10
        printStringConsumer.accept("abc"); //abc
    }
}
