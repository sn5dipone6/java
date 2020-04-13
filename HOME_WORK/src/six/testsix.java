package six;

import org.junit.jupiter.api.Test;

public class testsix {
    @Test
    public void testcompany() {
        final Company ali = new Company();
        System.out.println("一个月要发的总工资:" + ali.payEmployeSalaries());
        ali.printEmployeeSalaries();
    }
}