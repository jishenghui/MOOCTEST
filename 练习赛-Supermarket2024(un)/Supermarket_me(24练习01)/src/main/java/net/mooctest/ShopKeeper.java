package net.mooctest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopKeeper {

    private Shop shop = new Shop();

    public void setShop(Shop shop){
        this.shop = shop;
    }

    public void showAllProducts(){
        System.out.print(shop.getAllProductsInfo());
    }

    /**
     * 销售一批商品
     * @param products
     */
    public void sellProducts(Map<String, Integer> products){
        List<OrderItem> items = new ArrayList<>();
        for (String productName:products.keySet()){
            try{
                shop.sellProduct(productName, products.get(productName));
                Product product = shop.getProductByName(productName);
                items.add(new OrderItem(productName, product.getPaymentPrice(), products.get(productName)));
                System.out.println("Selld Successfully:"+productName+"*"+products.get(productName));
            }catch (Exception e){
            	System.out.println("Selld Failed:"+e.getMessage());
                continue;
            }
        }
        if (items.size()>0){
            Order.createOrder(items);
        }
    }

}
