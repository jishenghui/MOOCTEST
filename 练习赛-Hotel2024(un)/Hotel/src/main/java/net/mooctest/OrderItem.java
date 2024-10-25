package net.mooctest;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class OrderItem {
    private String productName;//商品名称
    private double paymentPrice;//商品单价*disconunt
    private int count;

    public OrderItem(String name, double paymentPrice, int count){
        this.productName = name;
        this.count = count;
        this.paymentPrice = paymentPrice;
    }

    public String PrintOrderItem(){
        return productName + "\t"
                + formatDouble(paymentPrice) + "\t"
                + count + "\t"
                + formatDouble(paymentPrice*count);
    }

    public String getProductName() {
        return productName;
    }

    public double getPaymentPrice() {
        return paymentPrice;
    }

    public int getCount() {
        return count;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPaymentPrice(double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAmount(){
        return paymentPrice*count;
    }
    
    public static String formatDouble(double d) {
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(d);
        
    }
}
