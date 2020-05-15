package cn.campsg.java.experiment;

public class Bank {
    private long balance;

    public Bank() {
        balance = 1000L;
    }

    public void withDraw(long getmoney) throws InterruptedException {
        try{
            if (getmoney > balance||getmoney<0) {
                throw new InterruptedException("Withdrawal amount cannot be more than the deposit amount or cannot be less than zero.");
            }
            else {
                balance = balance - getmoney;
                System.out.println("您的取款为:"+getmoney+"; 账户余额为"+balance);
            }
        }finally{}
    }
}