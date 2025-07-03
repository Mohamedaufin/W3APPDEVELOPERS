package project1;
class Creature {
    void sound() {
        System.out.println("Creature makes a sound.");
    }
}

class Puppy extends Creature {
    void sound() {
        System.out.println("Puppy barks.");
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Creature c = new Creature();
        Puppy p = new Puppy();
        Creature ref = new Puppy();

        c.sound();
        p.sound();
        ref.sound();
    }
}
