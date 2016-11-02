package tw.org.iii.javatest;
public class Will19 {
    public static void main(String[] args) {
        Scooter s1 = new Scooter();
        s1.upSpeed();
        s1.upSpeed(1.2);
        s1.upSpeed(2);
        System.out.println(s1.getSpeed());
    }
}
