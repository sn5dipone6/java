package seven.com.fancy.aa;

import org.junit.jupiter.api.Test;

public class Maintest {
    @Test
    public void test() {
        Circle circle = new Circle();
        circle.setR(5);
        System.out.println("The Circle's area is " + circle.clacArea());
        System.out.println("The Circle's Girth is " + circle.clacGirth());
        Square square = new Square();
        square.setSide(5);
        System.out.println("The Square's area is " + square.clacArea());
        System.out.println("The Square's Girth is " + square.clacGirth());
    }

}