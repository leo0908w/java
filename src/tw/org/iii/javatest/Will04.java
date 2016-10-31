package tw.org.iii.javatest;
public class Will04 {
    public static void main(String[] args){
        double Score = Math.random();
        System.out.println(Score);
        int intScore = (int)(Score * 101);
        System.out.println(intScore);
        if (intScore >= 90) {
            System.out.println("A");
        }else {
            if (intScore >= 80) {
                System.out.println("B");
            } else {
                if (intScore >= 70) {
                    System.out.println("C");
                } else {
                    if (intScore >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("E");
                    }
                }
            }
        }
    }
}
