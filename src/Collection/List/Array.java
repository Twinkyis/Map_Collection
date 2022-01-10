package Collection.List;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {


        ArrayList <String> num = new ArrayList<>();
        num.add("00");
        num.add("01");
        num.add("02");
        num.add("03");
        num.add("04");
        num.add("05");
        num.add("06");
        num.add("07");
        num.add("07");
        num.add("asd");

        System.out.println(num.size());

        num.remove(3);
        System.out.println(num);

        num.remove("05");
        System.out.println(num);

        num.addAll(num);
        System.out.println(num);

        System.out.println(num);



    }
}
