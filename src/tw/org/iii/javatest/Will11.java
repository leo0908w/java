package tw.org.iii.javatest;

/**
 * Created by iii-user on 2016/11/1.
 */
public class Will11 {
    public static void main(String[] args){
        int i = 0, sum = 0, n = 10;
        while (i <= n) {
            sum = sum + i++;
        }
        System.out.println("1 + 2 + 3 + ... + " + n + " = " + sum);
    }
}
