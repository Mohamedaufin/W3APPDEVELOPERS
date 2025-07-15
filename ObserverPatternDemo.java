package Aufin;

import java.util.*;

interface Observer {
    void update(String news);
}

class NewsSubscriber implements Observer {
    private String name;
    public NewsSubscriber(String name) {
        this.name = name;
    }
    public void update(String news) {
        System.out.println(name + " received: " + news);
    }
}

class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Observer o1 = new NewsSubscriber("Alice");
        Observer o2 = new NewsSubscriber("Bob");
        agency.addObserver(o1);
        agency.addObserver(o2);
        agency.notifyObservers("New COVID-19 Guidelines!");
    }
}

