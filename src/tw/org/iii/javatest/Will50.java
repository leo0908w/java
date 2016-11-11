package tw.org.iii.javatest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Will50 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "brad");
        map.put("gender", false);
        map.put("weight", 80);
        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("weight"));

//        TreeSet<Character> set = new TreeSet();
//        set.add('a');
//        set.add('c');
//        set.add('b');
//        set.add('e');
//        set.add('d');
//        System.out.println(set.toString());

    }
}
