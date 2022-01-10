package Jeneric;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {

        ArrayList <String> test1 = new ArrayList<>();
        test1.add("green");
        test1.add("yellow");
        test1.add("red");
        test1.add("orange");
        System.out.println(test1);

        String a = Met.getMed(test1);
        System.out.println(a);

        ArrayList <Integer> test2 = new ArrayList<>();
        test2.add(11);
        test2.add(22);
        test2.add(33);
        test2.add(44);
        System.out.println(test2);

        int i = Met.getMed(test2);
        System.out.println(i);
    }
}

class Met {
    public static <T> T getMed (ArrayList <T> gt) {
        return gt.get(1);
    }
}
