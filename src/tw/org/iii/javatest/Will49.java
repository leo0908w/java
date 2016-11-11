package tw.org.iii.javatest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Will49 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        while (set.size() < 6) {
            set.add((int)(Math.random() * 49 + 1));
        }
        System.out.println(set.toString());
        System.out.println("-----------------------------");
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 4);
        list.add(0, 5);
        System.out.println(list.toString());

    }
}
