package test.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("mark");
        queue.add("bob");
        queue.add("jack");
        queue.add("nick");
        queue.add("karl");
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue);

        queue.remove("bob");


    }
}
