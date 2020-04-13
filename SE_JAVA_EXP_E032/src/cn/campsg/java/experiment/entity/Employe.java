package cn.campsg.java.experiment.entity;

public class Employe {
    private String name;
    private int level;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level <= 0){
            System.out.println("level set to " + level + " is invalid, auto set level to 1");
            level = 1;
        }
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("salary set to " + salary + " is invalid,auto set salary to 0");
            salary = 0;
        }
        this.salary = salary;
    }

    public Employe() {
        name = " ";
        level = 1;
        salary = 0;
    }

    public Employe(String name, int level, int salary) {
        setName(name);
        setLevel(level);
        setSalary(salary);
    }

    public void work() {
        System.out.println(this.name + "做好了本职工作！");
    }
}