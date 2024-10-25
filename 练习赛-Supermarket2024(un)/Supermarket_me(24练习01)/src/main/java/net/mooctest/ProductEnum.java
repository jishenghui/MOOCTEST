package net.mooctest;

public enum ProductEnum {

    BOOK("书籍"),
    DRINK("饮料"),
    ELECTRONICS("电子产品");

    private final String productEnumName;

    ProductEnum(String productEnumName) {
        this.productEnumName = productEnumName;
    }

    public String getProductEnumName() {
        return productEnumName;
    }

}
