package cn.campsg.java.experiment;

public class MainClass {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("黄世仁", Student.Sex.MALE);
        students[1] = new Student("李紫萱", Student.Sex.FEMALE);
    
    for(Student student:students)
        System.out.println("姓名:" + student.getName() + "的性别是" + student.getSex().value());
    }
}