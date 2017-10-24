package biz.bagira.shds.functional_interfaces;

public class App3 {
    public static void main(String[] args) {
//        Converter<String, Integer> converter = (from)-> Integer.valueOf(from);
        Converter<String, Integer> converter = Integer::valueOf;    //same
        Integer first = converter.convert("25");
        Integer second = converter.convert("25");
        System.out.println(first+second); //50
    }
}
