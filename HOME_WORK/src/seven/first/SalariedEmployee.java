package seven.first;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String name, String ID, double salary) {
        setName(name);
        setID(ID);
        weeklySalary = salary;
    }

    public double getPaymentAmount() {
        return weeklySalary * 4;
    }
    public void pay(){
        System.out.println("发票:\t员工名称" + getName() + ";\t员工工号:" + getID() + ";\t工资:" + weeklySalary + ";");
        System.out.println("应支付:" + getPaymentAmount());
    }
}