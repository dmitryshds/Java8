package biz.bagira.shds._interface;


public interface Calculate {
    int calculate(int a,int b);
    default double getPi(){
        return Math.PI;
    }
    double divide(double d1,double d2);
}
