package Maps.Tree;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap <Integer, String> map1 = new TreeMap<>();
        map1.put(13, "111");
        map1.put(11, "222");
        map1.put(5, "333");
        map1.put(7, "444");
        System.out.println(map1.keySet());
    }
}
