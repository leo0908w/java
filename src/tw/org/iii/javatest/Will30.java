package tw.org.iii.javatest;

import java.io.File;

public class Will30 {
    public static void main(String[] args) {
        File dir1 = new File("dir1");
        if (dir1.isDirectory()) {
            File[] sub = dir1.listFiles();
            for (File sFile: sub) {
                System.out.println(sFile.getName());
            }
        }
        File[] roots =File.listRoots();
        for (File root : roots) {
            System.out.println(root.getAbsolutePath());
        }

//        File dir2 = new File("dir2");
//        System.out.println(dir1.getAbsolutePath());
//        if (dir2.exists()) {
//            System.out.println("OK");
//        } else {
//            dir2.mkdir();
//            System.out.println("XX");
//        }
//        File dir3 = new File("dir1/dir2/dir3/dir4/dir5");
//        if (dir3.exists()) {
//            System.out.println("OK");
//        } else {
//            dir3.mkdirs();      //父目錄不在自動建立父目錄
//            System.out.println("XX");
//        }

    }
}
