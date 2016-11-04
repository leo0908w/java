package tw.org.iii.javatest;
public class Will22 {
    public static void main(String[] args) {
        String s1 = "woo";
        String s2 = "woo";
        String s3 = new String("woo");
        String s4 = new String("woo");
        System.out.println(s3 == s1);
        System.out.println(s1.equals(s4));
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        Pen1 p11 = new Pen1();
        System.out.println(p1.equals(p2));
        String s5 = s3;
        System.out.println(s3.concat("oooooooooooooooooo"));
        System.out.println(s3);
        System.out.println(p1);
        System.out.println(p11);
    }
}
class Pen {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class Pen1 {
    @Override
    public String toString() {
        return "apple";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
