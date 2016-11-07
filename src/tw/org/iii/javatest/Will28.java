package tw.org.iii.javatest;

public class Will28 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] d = {0, 1, 2, 3};
        try {
//            System.out.println(d[4]);
            int c = a/b;
            System.out.println(d[4]);
        }
        catch(ArithmeticException ae) {
            System.out.println("OK");
        }
// catch(ArrayIndexOutOfBoundsException ae) {
//            System.out.println("OK2");
//        }
        catch(RuntimeException ae) {
            System.out.println("OK3");
        }
        System.out.println("Game Over!!");
    }
}
