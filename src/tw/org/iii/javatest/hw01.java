package tw.org.iii.javatest;
public class hw01 {
    public static void main(String[] args) {
        int temp = 0;
        for (int i=2; i<100; i++) {
            for (int j=2; j<(i+1); j++) {
                if ( i%j == 0 ) {
                    temp++;
                }
            }
            if (temp == 1) {
                System.out.print(i +",\t");
            }
            temp = 0;
        }
    }
}
