package biz.bagira.shds.predicats;


import java.util.Objects;
import java.util.function.Predicate;

public class App8 {
    public static void main(String[] args) {

        Predicate<String>  predicate = (s -> s.length() > 0);
        System.out.println(predicate.test("abc"));    //true
        System.out.println(predicate.negate().test("abc"));    //false

        Predicate<String>  booleanPredicate = String::isEmpty;
        System.out.println(booleanPredicate.test(""));   //true

        Predicate<String> isNullPredicate = Objects::isNull;


        System.out.println(isNullPredicate.test(null));  //true
        System.out.println(isNullPredicate.negate().test(null));  //false
    }
}
