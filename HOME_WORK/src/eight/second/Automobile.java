package eight.second;

abstract class Automobile implements Vehicle {
    private String name;
    private int loadCapacity;
    private int maxSpeed;
    private int Speed;
    private int Capacity;

    public Automobile() {
        name = "111";
        maxSpeed = 100;
        Speed = 0;
        Capacity = 0;
        loadCapacity = 100;
    }

    public Automobile(String name, int Speed, int maxSpeed, int Capacity, int loadCapacity) {
        this.name = name;
        this.Speed = Speed;
        this.maxSpeed = maxSpeed;
        this.Capacity = Capacity;
        this.loadCapacity = loadCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void stop() {
        System.out.println(name + " is stop");
    }

    public void speedUp() {
        if (Speed + 10 > maxSpeed)
            System.out.println("the speed is max,failed to speedup.");
        else
        {
            Speed = Speed + 10;
            System.out.println("the speed is " + Speed);
        }
    }

    public void speedDown() {
        if(Speed-10<0)
            System.out.println("the speed is min,failed to speeddown.");
        else
        {
            Speed = Speed - 10;
            System.out.println("the speed is " + Speed);
        }
    }

}