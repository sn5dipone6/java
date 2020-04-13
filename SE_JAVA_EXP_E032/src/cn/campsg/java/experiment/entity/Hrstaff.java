package cn.campsg.java.experiment.entity;

public class Hrstaff extends Employe{
    public Hrstaff() {
        super();
    }

    public Hrstaff(String name) {
        super(name, 5, 5000);
    }

    public void paySalary(Employe Employer) {
        int money;
        if ((1 <= Employer.getLevel()) && (Employer.getLevel() <= 5)) {
            money = Employer.getSalary() + 500;
            Employer.setSalary(money);
        }
        else if ((6 <= Employer.getLevel()) && (Employer.getLevel() <= 9)) {
            money = Employer.getSalary() + 800;
            Employer.setSalary(money);
        }
        else if ((10 <= Employer.getLevel()) && (Employer.getLevel() <= 15)) {
            money = Employer.getSalary() + 1000;
            Employer.setSalary(money);
        }
        else
            System.out.println(Employer.getName() + "不存在对应的职级,无法发放额外浮动薪水");
    }
}