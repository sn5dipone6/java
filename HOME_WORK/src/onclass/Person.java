package onclass;

public class Person {
    private String name;
    private int age;
    private String place;

    public Person(String n) {
        name = n;
    }

    public Person(String name, int age, String place) {
        this.age = age;
        this.name = name;
        this.place = place;
    }

    public String getPlace() {//用get方法获取私有变量
        return place;
    }

    public Person() {
        this("", 0, "");
    }

    public boolean isOlderThan(int anAge) {
        return this.age > anAge;
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name);
    }

    public void sayHello(Person another) {
        System.out.println("hello," + another.name + "! My name is" + name);
    }
}