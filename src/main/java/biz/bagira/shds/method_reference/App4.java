package biz.bagira.shds.method_reference;
import biz.bagira.shds.functional_interfaces.Converter;

public class App4 {
    public static void main(String[] args) {

        Foo foo = new Foo();
        Converter<String, String> converter = foo::reverce;

        System.out.println(converter.convert("Hello"));  //olleH


    }
}
