package net.mooctest;

public class Product{
    public int id;//商品序号
    public String pid;//商品编号
    public String name;//商品名称
    public double price;//商品价格
    public int count; //商品库存
    public ProductEnum productEnum;//商品类型
    public double discount = 1;//商品折扣

    public Product(int id, String pid, String name, double price, int count, ProductEnum productEnum, double discount) {
        this.id = id;
        this.pid = pid;
        this.setName(name);
        this.setPrice(price);
        this.setCount(count);
        this.productEnum = productEnum;
        this.discount = discount;
    }

    public Product(String name, double price, int count){
        this.setName(name);
        this.setPrice(price);
        this.setCount(count);
    }

    //获取商品售卖时最终定价
    public double getPaymentPrice(){
        return price * discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    //设置商品名称
    public void setName(String name) {
        char [] data = name.toCharArray();
        if (name.length()>20){
            throw new IllegalArgumentException("The length of product's name cannot longer than 20: "+name);
        }
        this.name = name;
    }

    //设置商品价格
    public void setPrice(double price) {
        if(price<=0)
            throw new IllegalArgumentException("Price cannot less than 0: "+price);
        if((price+"").length()-(price+"").indexOf(".")-1 > 2){
            throw new IllegalArgumentException("Price's length is wrong: "+price);
        }
        this.price = price;
    }

    //设置商品数量
    public void setCount(int count) {
        if (count<=0){
            throw new IllegalArgumentException("Quantity should larger than 0: "+count);
        }
        this.count = count;
    }

    public void setProductEnum(ProductEnum productEnum) {
        this.productEnum = productEnum;
    }

    //设置商品折扣
    public void setDiscount(double discount) {
        if(discount<=0)
            throw new IllegalArgumentException("Discount cannot less than 0: "+discount);
        if(discount>1)
            throw new IllegalArgumentException("Discount cannot larger than 1: "+discount);

        int a=(discount+"").length();
        int b=(discount+"").indexOf(".");
        if((discount+"").length()-(discount+"").indexOf(".")-1 > 2){
            throw new IllegalArgumentException("Discount's length is wrong: "+discount);
        }
        this.discount = discount;
    }

    //获取商品信息
    public String getInfo() {
        String discount_info = ""+(int)(this.discount*100)+"%";
        if(this.discount==1)
            discount_info = "No discount";
        return "Product{" +
                "id=" + id +
                ", pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", productEnum=" + productEnum +
                ", discount=" + discount_info +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public ProductEnum getProductEnum() {
        return productEnum;
    }

    public double getDiscount() {
        return discount;
    }
}
