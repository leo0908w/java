package tw.org.iii.javatest;
public class Will24 {
    public static void main(String[] args) {
        
        Will241 obj1 = new Will241("bran");
        Will241 obj2 = new Will241("LALALa");
        Will241 obj3 = new Will241("blue");
        System.out.println(obj1.a);
        obj2.sayYA();
        obj3.sayYA();
    }
}
class Will241 {
    String name;
    int a;
    static private int b;
    Will241(String name) {
        this.name = name;
        a++;
        b++;
    }
    void sayYA() {
        System.out.println(name + " : YA!!");
    }
    static int getB() {
        return b;
    }
}