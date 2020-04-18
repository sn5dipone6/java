package seven.first;



public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partName, int count, double price) {
        this.partName = partName;
        quantity = count;
        pricePerItem = price;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public void pay() {
        System.out.println("发票:\t物品名称" + partName + ";\t物品数量:" + quantity + ";\t物品单价:" + pricePerItem + ";");
        System.out.println("应支付:" + getPaymentAmount());
    }
}