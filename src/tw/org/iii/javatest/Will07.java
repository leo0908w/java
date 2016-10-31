package tw.org.iii.javatest;
public class Will07 {
    public static void main(String[] args){
        System.out.println( 3 ^ 1 );
        int a = 10, b = 3;
        if (a++ <= 10 && --b >= 3){
            System.out.println("OK:a = " + a + ", b = " + b);
        }else{
            System.out.println("NO:a = " + a + ", b = " + b);
        }
    }
}
