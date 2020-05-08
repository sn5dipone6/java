package onclass.nine;

import org.junit.jupiter.api.Test;

public class Testmain {
    @Test
    public void main() {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tom", 1, 5, "white");
        cats[1] = new Cat("Tom", 1, 5, "white");
        cats[2] = new Cat("Ann", 5, 8, "yellow");
        cats[3] = new Cat("Ben", 6, 9, "purple");
        Cat.toString(cats);
    }
}