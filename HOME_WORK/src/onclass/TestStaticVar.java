package onclass;

class Count {
    public static int counter = 0;
    private int serialNumber;

    public Count() {
        counter++;
        serialNumber = counter;
    }

    static {
        counter = 10;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
public class TestStaticVar {
    public static void main(String[] args) {
        Count[] cc = new Count[10];
        for (int i = 0; i < cc.length; i++,System.out.println(Count.counter)) {
            cc[i] = new Count();
            System.out.println("cc[" + i + "].serialNumber = " + cc[i].getSerialNumber());
        }
}
}