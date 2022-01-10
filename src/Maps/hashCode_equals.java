package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashCode_equals {
    public static void main(String[] args) {

        Map <stick, Integer> arr1 = new HashMap<>();
        stick st1 = new stick("clone_01", "red", 15);
        stick st2 = new stick("clone_02", "yellow", 11);
        stick st3 = new stick("clone_03", "green", 65);
        stick st4 = new stick("clone_04", "green", 44);
        stick st5 = new stick("clone_01", "red", 15);

        arr1.put(st1, 15);
        arr1.put(st2, 14);
        arr1.put(st3, 68);
        arr1.put(st4, 54);
        arr1.put(st5, 15);
        System.out.println(arr1);

        System.out.println(st1.hashCode());
        System.out.println(st5.equals(st1));
    }
}



class stick {
    String name;
    String color;
    int size;


    public String toString() {
        return "stick{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public stick (String name, String color, int size){
        this.color = color;
        this.name = name;
        this.size = size;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stick stick = (stick) o;
        return size == stick.size &&
                Objects.equals(name, stick.name) &&
                Objects.equals(color, stick.color);
    }


    public int hashCode() {
        return Objects.hash(name, color, size);
    }
}
