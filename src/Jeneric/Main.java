package Jeneric;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        dop<String> test1 = new dop<>("Какое то значение");
        System.out.println(test1);

        String s = test1.getValue();

        dop<Integer> test2 = new dop<Integer>(55);
        System.out.println(test2);

        Integer i = test2.getValue();
        System.out.println(i);


    }
}

class dop <T> {
    private T value;
    public dop (T value) {
        this.value = value;
    }
    public String toString(){
        return "[[" + value + "]]";
    }

    public T getValue() {
        return value;
    }
}

class dopMethod {
   public static <T> T getsecNum (ArrayList<T> al) {
       return al.get(1);
   }
}


// T - universal E -array  K - key V - value = for comfort; T - type set holder
//