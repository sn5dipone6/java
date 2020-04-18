package seven.first;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        Payable payableObjects[] = new Payable[4];
        payableObjects[0] = new Invoice("移动硬盘", 2, 375.00);
        payableObjects[1] = new Invoice("U盘", 4, 79.00);
        payableObjects[2] = new SalariedEmployee("小李子", "010010", 2000.00);
        payableObjects[3] = new SalariedEmployee("小贾", "010010", 1200.00);
        System.out.println("发票和员工工资汇总:");
        for (int i = 0; i < payableObjects.length; i++) {
            System.out.println("支付项目:" + i);
            payableObjects[i].pay();
        }
    }
}