package Superclass;

class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 3; i++)
         System.out.println("From MyThread (extends Thread): " + i);
 }
}


class MyRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 3; i++)
         System.out.println("From MyRunnable (implements Runnable): " + i);
 }
}

public class ThreadVsRunnable {
 public static void main(String[] args) {
     MyThread t1 = new MyThread(); 
     Thread t2 = new Thread(new MyRunnable()); 

     t1.start();
     t2.start();

     for (int i = 1; i <= 3; i++)
         System.out.println("From Main Thread: " + i);
 }
}
