package biz.bagira.shds.static_variables;


public class App7 {

    public static void main(String[] args) {

        Foo2 foo2 = new Foo2();

        int convert = foo2.convert("67");

        System.out.println(convert);   //67
        System.out.println(Foo2.var);  //67
    }
}
