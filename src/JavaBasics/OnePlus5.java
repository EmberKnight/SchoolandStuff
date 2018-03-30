package JavaBasics;

public class OnePlus5 extends OnePlus implements IMobilePhone {

    private String colour;

    public OnePlus5(double price, String productType) {
        super(price, productType);
    }

    @Override
    public void powerOn() {
        System.out.println("Phone is booting!");
    }

    @Override
    public boolean phoneRings() {
        return false;
    }

    @Override
    public boolean call() {
        return false;
    }

}
