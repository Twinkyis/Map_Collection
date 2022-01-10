package Collection.Queue;

import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("111");
        priorityQueue.add("222");
        priorityQueue.add("333");
        priorityQueue.add("444");
        priorityQueue.add("555");

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());
    }
}
