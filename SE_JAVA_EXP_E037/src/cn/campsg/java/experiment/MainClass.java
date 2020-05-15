package cn.campsg.java.experiment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("请输入取款金额:");
        Scanner in = new Scanner(System.in);
        String cash = in.nextLine();
        long getmoney = 0L;
        try {
            getmoney = Long.parseLong(cash);
        } catch (NumberFormatException a) {
            System.out.println("输入金额不正确，请重新输入取款金额。");
            in.close();
            return;
        }
        Bank bank = new Bank();
        try {
            bank.withDraw(getmoney);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        in.close();
    }
}