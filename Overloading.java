package Superclass;

public class Overloading {
	String brand, model;
    int year;
    
	public Overloading() {
		brand = "Unknown";
        model = "Unknown";
        year = 0;
	}
	 public Overloading(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        this.year = 2020;
	    }

	    public Overloading(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    void display() {
	        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
	    }

	public static void main(String[] args) {
		 Overloading o1 = new Overloading();
	        Overloading o2 = new Overloading("Honda", "Civic");
	        Overloading o3 = new Overloading("Toyota", "Camry", 2022);

	        o1.display();
	        o2.display();
	        o3.display();

	}

}
