package biz.bagira.shds.static_variables;


import biz.bagira.shds.functional_interfaces.Converter;

public class Foo2 {

    static int var;



    int convert(String number){
        Converter<String,Integer> converter = (Integer::valueOf);
        Integer value = converter.convert(number);
        var = value;
       return value;
    }
}
