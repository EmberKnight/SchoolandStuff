package JavaBasics;

public abstract class OnePlus {

    private double price;
    private String productType;

    public OnePlus(double price, String productType) {
        super();
        setPrice(price);
        setProductType(productType);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
