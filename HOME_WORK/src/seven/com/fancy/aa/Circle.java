package seven.com.fancy.aa;

import seven.com.fancy.Shapeable;

public class Circle implements Shapeable {
    private double r;

    public Circle() {
        r = 1;
    }
    public void setR(double r){
        this.r = r;
    }
    public double clacArea(){
        return 3.14*r*r;
    }
    public double clacGirth() {
        return 3.14*2*r;
    }
}