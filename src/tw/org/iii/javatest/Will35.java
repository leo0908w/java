package tw.org.iii.javatest;

public class Will35 {
    public static void main(String[] agrs) {
//        Will351 obj1= new Will351();
//        obj1.m1();
//        Will351.m2();
        Will353 obj1 = new Will353();
//        Will353.m2();
    }
}
class Will351 {
    static {System.out.println("Will351:static{...}");}
    {System.out.println("Will351:{...}");}
    Will351() {System.out.println("Will351()");}
    void m1() {System.out.println("Will351:m1()");}
    static void m2() {System.out.println("Will351:m2()");}
}
class Will352 extends Will351 {
    static {System.out.println("Will352:static{...}");}
    {System.out.println("Will352:{...}");}
    Will352() {System.out.println("Will352()");}
    void m1() {System.out.println("Will352:m1()");}
    static void m2() {System.out.println("Will352:m2()");}
}
class Will353 extends Will352 {
    static {System.out.println("Will353:static{...}");}
    {System.out.println("Will353:{...}");}
    Will353() {System.out.println("Will353()");}
    void m1() {System.out.println("Will353:m1()");}
    static void m2() {System.out.println("Will351:m2()");}
}
