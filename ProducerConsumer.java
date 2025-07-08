package Superclass;

class Buffer {
    int value;
    boolean hasValue = false;

    synchronized void produce(int val) throws InterruptedException {
        while (hasValue)
            wait();
        value = val;
        System.out.println("Produced: " + value);
        hasValue = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!hasValue)
            wait();
        System.out.println("Consumed: " + value);
        hasValue = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;
    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        int i = 1;
        try {
            while (i <= 5) {
                b.produce(i++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}

class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Producer(b).start();
        new Consumer(b).start();
    }
}
