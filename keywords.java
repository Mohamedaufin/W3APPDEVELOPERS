package project1;

class Alpha {
    int value = 100;
}

class Beta extends Alpha {
    int value = 200;

    void show() {
        System.out.println("Beta value: " + this.value);
        System.out.println("Alpha value: " + super.value);
    }
}

public class keywords {  
    public static void main(String[] args) {
        Beta b = new Beta();
        b.show();
    }
}
