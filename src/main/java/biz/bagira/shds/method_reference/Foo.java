package biz.bagira.shds.method_reference;


public class Foo {

    String reverce(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
