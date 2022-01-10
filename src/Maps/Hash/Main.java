package Maps.Hash;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map <Integer, String> map1 = new HashMap<>(); // ключ может быть любого типа, который мы укажем
        map1.put(111, "first");
        map1.put(222, "second");
        map1.put(333, "third");
        map1.put(444, "four");
        map1.put(555, "first");
        //map1.put(555, "some");
        System.out.println(map1);

        map1.putIfAbsent(111, "other");
        System.out.println(map1);

        System.out.println(map1.get(333));

        map1.remove(222);


        System.out.println(map1.containsValue("four"));
        System.out.println(map1.containsKey(555));

        System.out.println(map1.keySet());
        System.out.println(map1.values());

       // map1.entrySet(); // разобрать

        for (Map.Entry <Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

     //  Map <String, Integer> map2 = new HashMap<>(15, 0.75f);

    }
}
