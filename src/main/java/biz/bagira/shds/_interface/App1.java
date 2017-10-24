package biz.bagira.shds._interface;


public class App1 {
    public static void main(String[] args) {

        Calculate calculate = new Calculate() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };

        System.out.println(calculate.calculate(5,8)); //13
        System.out.println(calculate.getPi()); //3.141592653589793
    }
}
