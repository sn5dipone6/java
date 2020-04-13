package six;

public class MonthWorker extends Employee{
    private double MonthMoney;

    public MonthWorker(String name) {
        MonthMoney = 10000;
        setName(name);
    }

    public void setMoney(double Money) {
        MonthMoney = Money;
    }

    public double earning() {
        return MonthMoney;
    }

}