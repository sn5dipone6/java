package eight.second;

class Van extends Automobile {
    public Van(String name, int Speed, int maxSpeed, int Capacity, int loadCapacity) {
        super(name, Speed, maxSpeed, Capacity, loadCapacity);
    }
}

class Car extends Automobile {
    public Car(String name,int Speed,int maxSpeed, int Capacity, int loadCapacity) {
        super(name, Speed, maxSpeed, Capacity, loadCapacity);
    }
}

public class Mainclass {
    public static void main(String[] args) {
    Automobile[] cars = new Automobile[2];
    cars[0]=new Van("Van",90,100,10,100);
    cars[1]=new Car("Car",10,100,20,50);
    cars[0].speedUp();
    cars[0].speedUp();
    cars[0].move();
    cars[1].move();
    cars[0].stop();
    cars[1].stop();
    }
}