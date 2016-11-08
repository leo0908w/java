package tw.org.iii.javatest;

import java.io.*;

public class Will38 {
    public static void main(String[] args) {
        Will383 obj = new Will383();
        try {
            ObjectOutputStream oout =
                    new ObjectOutputStream(new FileOutputStream("dir1/will.o2"));
            oout.writeObject(obj);
            oout.flush();
            oout.close();
        } catch (IOException ee) {System.out.println(ee.toString());}
        System.out.println("------------");

        // 解序列化
        try {
            ObjectInputStream oin = new ObjectInputStream(
                    new FileInputStream("dir1/will.o2"));
            Will383 obj3 = (Will383) oin.readObject();
            oin.close();
            System.out.println("OK");
        } catch (Exception e) {System.out.println(e.toString());}
    }
}
class Will381 {
    Will381() {System.out.println("Will381()");}
}
class Will382 extends Will381 {
    Will382() {System.out.println("Will382()");}
}
class Will383 extends Will382 implements Serializable {
    Will384 obj;
    Will383() {
        obj = new Will384();
        System.out.println("Will383()");
    }
}
class Will384 implements Serializable {}