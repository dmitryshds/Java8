package biz.bagira.shds.lambda_action;


import biz.bagira.shds.functional_interfaces.Converter;

public class App6 {

    public static void main(String[] args) {
          int i = 5;

        Converter<String,Integer> converter=(from) -> Integer.valueOf(from)+i;

        System.out.println(converter.convert("5"));

//        int i = 10;  //   Error:(15, 13) java: local variables referenced from a lambda expression must be final or effectively final


    }
}
