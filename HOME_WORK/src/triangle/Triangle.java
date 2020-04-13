package triangle;


public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        sideA = 1;
        sideB = 1;
        sideC = 1;
    } 

    public void modifySides(final double a, final double b, final double c) {
        setSideA(a);
        setSideB(b);
        setSideC(c);
    }

    public void setSideA(final double a) {
        if (a > 0) {
            sideA = a;
        } else {
            System.out.println("sideA " + a + " is invalid, auto sideA to 1");
            sideA = 1;
        }
    }

    public void setSideB(final double b) {
        if (b > 0) {
            sideB = b;
        } else {
            System.out.println("sideB " + b + " is invalid, auto sideB to 1");
            sideB = 1;
        }
    }

    public void setSideC(final double c) {
        if (c > 0) {
            sideC = c;
        } else {
            System.out.println("sideC " + c + " is invalid, auto sideC to 1");
            sideC = 1;
        }
    }

    public void getSideA() {
        System.out.println("sideA is " + sideA);
    }

    public void getSideB() {
        System.out.println("sideB is " + sideB);
    }

    public void getSideC() {
        System.out.println("sideC is " + sideC);
    }

    public void getAllSide() {
        getSideA();
        getSideB();
        getSideC();
    }

    public void getArea() {
        final double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("This triangle's area is " + area+".");
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.getAllSide();
        tri.modifySides(1.0, 2.5, 3.4);
        tri.getAllSide();
        tri.setSideA(2.0);
        tri.setSideB(2.0);
        tri.setSideC(2.0);
        tri.getAllSide();
        tri.getArea();
    }
}