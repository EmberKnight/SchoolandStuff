package JavaBasics;

public abstract class Computer {

    String brand;
    double ghz;
    int ram;
    int storage;
    boolean on;
    Mainboard mainboard;

    public Computer(String brand, double ghz, int ram, int storage, boolean on, Mainboard mainboard) {
        setBrand(brand);
        setGhz(ghz);
        setRam(ram);
        setStorage(storage);
        setOn(on);
        setMainboard(mainboard);
    }

    //-------------------- setter && getter -------------------------------------------------------------

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getGhz() {
        return this.ghz;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Mainboard getMainboard() {
        return this.mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    //--------------------------------------------------------------------------------------------------

    public void turnOn(String brand) {

        if ((this.brand.equals(brand)) && (!isOn())) {
            System.out.println("The laptop is booting!");
            on = true;
        }
        else {
            System.out.println("This laptop is already on!");
        }
    }

    @Override
    public String toString() {
        return  "Brand: " + brand + "\n" +
                "GHz: " + ghz + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + storage + "\n" +
                "Booting: " + on + "\n" +
                "JavaBasics.Mainboard: " + "PCI Slots: " + mainboard.getPciSlots() +
                " RAM Slots: " + mainboard.getRamSlots() + " USB Ports: " + mainboard.getUsbPorts();
    }

    public void printString() {
        System.out.println(toString());
    }

}
