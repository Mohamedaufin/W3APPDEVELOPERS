package Aufin;

interface Pizza {
    String getDescription();
    double getCost();
}

class BasicPizza implements Pizza {
    public String getDescription() {
        return "Basic Pizza";
    }
    public double getCost() {
        return 100;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza p) {
        pizza = p;
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza p) {
        super(p);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    public double getCost() {
        return pizza.getCost() + 30;
    }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza p) {
        super(p);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
    public double getCost() {
        return pizza.getCost() + 20;
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new Olives(new Cheese(new BasicPizza()));
        System.out.println(pizza.getDescription() + " costs ₹" + pizza.getCost());
    }
}
