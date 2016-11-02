package tw.org.iii.javatest;
public class Pokerv3 {
    public static void main(String[] args) {
        int[] poker = new int[52];
        int temp;
        for (int j=0; j<poker.length; j++) {
            poker[j] = j;
            System.out.print(poker[j] + ",\t");
        }
        System.out.println();
        System.out.println("----------");
        for (int i=1; i<=poker.length; i++) {
            int a = poker.length-i;
            int change = (int)(Math.random() * (poker.length-i));
            temp = poker[change];
//            System.out.print(temp + "\t");
            poker[change] = poker[a];
//            System.out.print(temp2 + "\t");
            poker[a] = temp;
        }
        for (int k=0; k<poker.length; k++) {
            System.out.print(poker[k] + ",\t");
        }
    }
}
