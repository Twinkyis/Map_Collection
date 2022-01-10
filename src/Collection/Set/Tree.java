package Collection.Set;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> Number = new TreeSet<>();
        Number.add("044-44-44");
        Number.add("044-55-55");
        Number.add("144-66-66");
        Number.add("055-55-55");
        for (Object o : Number) {
            System.out.println(o);
        }
        System.out.println(Number.first());
    }
}



abstract class Number implements Comparable {
    int num;

    public Number(int num) {
        this.num = num;
    }

    public int compareTo(Number t) {
        if (t.num > this.num) {
            return this.num - t.num;
        }
        return 0;
    }
}

