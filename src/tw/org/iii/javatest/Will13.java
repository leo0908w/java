package tw.org.iii.javatest;
public class Will13 {
    public static void main(String[] args){
        int[] a;
        int p1, p2, p3, p4, p5, p6;
        p1 = p1 = p2 = p3 = p4 = p5 = p6 = 0;
        for (int i = 0; i < 100; i++) {
            double b = Math.random();
            int c = (int) (b * 6 + 1);
            switch (c) {
                case 1:p1++; break;
                case 2:p2++; break;
                case 3:p3++; break;
                case 4:p4++; break;
                case 5:p5++; break;
                case 6:p6++; break;
            }
        }
        System.out.println("第一點 :" + p1);
        System.out.println("第二點 :" + p2);
        System.out.println("第三點 :" + p3);
        System.out.println("第四點 :" + p4);
        System.out.println("第五點 :" + p5);
        System.out.println("第六點 :" + p6);

//        a = new int[3];     //[3] 元素，array[] 都已經初始化，且值都為0
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (int v: a) {
//            System.out.println("-- "+ v);
//        }       //PHP: foreach


    }
}
