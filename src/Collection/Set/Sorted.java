package Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("111");
        sortedSet.add("444");
        sortedSet.add("222");
        sortedSet.add("666");
        sortedSet.add("333");
        System.out.println(sortedSet);

        SortedSet<String> subSet = sortedSet.subSet("111", "444");
        System.out.println("SubSet: " + subSet);

        System.out.println("HeadSet: " + sortedSet.headSet("333"));
        System.out.println("TailSet: " + sortedSet.tailSet("333"));
        System.out.println("Первый элемент: " + sortedSet.first());
        System.out.println("Последний элемент: " + sortedSet.last());
    }
}
