package Aufin;

import java.util.*;

public class ListBenchmark {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int size = 10000;

      
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        
        long start = System.nanoTime();
        arrayList.add(size / 2, 99999);
        long end = System.nanoTime();
        System.out.println("ArrayList insert time: " + (end - start) + " ns");

       
        start = System.nanoTime();
        linkedList.add(size / 2, 99999);
        end = System.nanoTime();
        System.out.println("LinkedList insert time: " + (end - start) + " ns");
    }
}
