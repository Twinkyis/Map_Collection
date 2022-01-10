package Collection.Set;

import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<String> q = new HashSet<>();
        q.add("044-44-44");
        q.add("044-00-00");
        q.add("044-44-44");
        q.add("044-65-55");

        System.out.println(q);
        System.out.println("after");


//        Iterator<String> s = q.iterator();
//        while (s.hasNext())
//            System.out.println(s.next());
    }
}
