package heaps;

import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(4);
        pq.add(-10);
        System.out.println(pq.peek());
        pq.add(-35); 
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.remove();
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
