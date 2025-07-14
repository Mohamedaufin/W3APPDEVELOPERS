package Aufin;

import java.util.*;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class TaskComparator implements Comparator<Task> {
    public int compare(Task t1, Task t2) {
        return t1.priority - t2.priority;  
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());

        taskQueue.add(new Task("Email", 3));
        taskQueue.add(new Task("Bug Fix", 1));
        taskQueue.add(new Task("Code Review", 2));

        while (!taskQueue.isEmpty()) {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }
}
