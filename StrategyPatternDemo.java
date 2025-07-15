package Aufin;

interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Sorting with Bubble Sort");
    }
}

class QuickSort implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Sorting with Quick Sort");
    }
}

class SortContext {
    private SortStrategy strategy;
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
        SortContext context = new SortContext();
        context.setStrategy(new BubbleSort());
        context.executeStrategy(new int[]{5, 2, 9});
        context.setStrategy(new QuickSort());
        context.executeStrategy(new int[]{3, 8, 1});
    }
}

