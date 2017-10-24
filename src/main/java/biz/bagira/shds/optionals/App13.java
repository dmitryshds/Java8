package biz.bagira.shds.optionals;


import java.util.Optional;

public class App13 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        System.out.println(optional.get()); //Hello
        System.out.println(optional.equals("hello")); //false
        System.out.println(optional.isPresent()); //true
        System.out.println(optional.orElse("abc")); //Hello
       optional.ifPresent((s) -> System.out.println(s.substring(0,2))); //He
    }
}
