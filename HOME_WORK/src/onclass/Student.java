package onclass;


public class Student extends Person {
    private String school;
    private int score;

    public Student(String name, int age, String place, String school) {
        super(name, age, place);//继承父类构造方法，进行赋值
        this.school = school;
    }

    public void sayHello(Student another) {
        System.out.println("Hi!");
        System.out.println("I came from" + getPlace());//用继承的get方法获取private变量place
        if(school == another.school)
            System.out.println("we are Shoolmates");
    }

    public boolean isGoodStudent() {
        return score >= 90;
    }

    public void sayHello() {
        super.sayHello();//调用父类的无参sayHello方法 来输出名字
        System.out.println("My school is " + school);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Wangqiang", 20, "hangzhou", "PKU");
        Student s2 = new Student("Zhangyi", 18, "hangzhou", "THU");
        Person p1 = new Person("Dr Li", 33, "shanghai");
        s1.sayHello();
        s1.sayHello(p1);
        s1.sayHello(s2);
    }
}