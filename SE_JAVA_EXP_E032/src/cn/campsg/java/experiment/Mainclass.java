package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class Mainclass {
    public static void main(String[] args) {
        Employe Alan = new Employe("Alan", 6, 5000);
        Employe Mike = new Employe("Mike", 10, 5000);
        Employe Ann = new Employe("Ann", 20, 5000);
        Hrstaff Bob = new Hrstaff("Bob");
        Alan.work();
        Mike.work();
        Ann.work();
        Bob.work();
        Bob.paySalary(Alan);
        System.out.println(Alan.getName() + "的薪水:" + Alan.getSalary());
        Bob.paySalary(Mike);
        System.out.println(Mike.getName() + "的薪水:" + Mike.getSalary());
        Bob.paySalary(Ann);
        System.out.println(Ann.getName() + "的薪水:" + Ann.getSalary());
        Bob.paySalary(Bob);
        System.out.println(Bob.getName() + "的薪水:" + Bob.getSalary());
    }
}