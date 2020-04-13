package six;

public class HourWorker extends Employee {
    private double HourMoney;

    public HourWorker(String name) {
        HourMoney = 100;
        setName(name);
    }

    public void setMoney(double Money) {
        HourMoney = Money;
    }

    public double earning() {
        return HourMoney * 25 * 8;//一天工作8小时，一个月工作25天
    }
}