package dataStructure.第一单元;

/**
 * Created by llh on 17-3-28.
 */
class A{
    public void f(int x){
        g(x-1);
    }
    public void g(int x){
        f(x);
    }
}
class B extends A{
    public void f(int x){
        if(x>0) g(x-2);
    }
    public void g(int x){
        super.g(x-3);
    }
}
public class Hom1_6 {
    public static void main(String[] args) {
        new B().f(10);
    }
}
