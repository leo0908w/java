package tw.org.iii.javatest;
public class Will25 {
    public static void main(String[] args) {
        Will251 obj1 = new Will251();
        Will252 obj2 = new Will253();
        Will252 obj3 = new Will254();
        obj2.m2();
        obj3.m2();
    }
}
class Will251 {
    int a;
    void m1(){}
}
 abstract class Will252 {
    int a;
    void m1() {}
    abstract void m2();
}
class Will253 extends Will252 {
    void m2() {System.out.println("Will253!!!!");}
}
class Will254 extends Will252 {
    void m2() {System.out.println("Will254!!!!");}
}
