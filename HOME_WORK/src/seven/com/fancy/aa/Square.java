package seven.com.fancy.aa;

import seven.com.fancy.Shapeable;

public class Square implements Shapeable {
    private double side;
    public Square() {
        side = 1;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double clacArea() {
        return side * side;
    }

    public double clacGirth() {
        return 4 * side;
    }
}