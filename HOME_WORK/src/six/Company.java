package six;

public class Company {
    private Employee[] Employees = new Employee[10];

    public Company() {
        for (int i = 0; i <= 9;i++) {
            String s = ""+i;
            if (i % 2 == 0)
                Employees[i] = new HourWorker("员工"+s);
            if (i % 2 == 1)
                Employees[i] = new MonthWorker("员工"+s);
        }
    }

    public double payEmployeSalaries() {
        double sum_money = 0;
        for (Employee employee : Employees) {
            sum_money += employee.earning();
        }
        return sum_money;
    }

    public void printEmployeeSalaries() {
        for (Employee employee : Employees) {
            System.out.println(employee.getName() + ": " + employee.earning());
        }
    }


}