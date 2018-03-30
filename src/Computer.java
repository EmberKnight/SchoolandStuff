public class Computer {

    String brand;
    double ghz;
    int ram;
    int storage;
    boolean on;
    Mainboard mainboard;

    public Computer(String brand, double ghz, int ram, int storage, boolean on) {
        setBrand(brand);
        setGhz(ghz);
        setRam(ram);
        setStorage(storage);
        setOn(on);
    }

    //-------------------- setter && getter -------------------------------------------------------------

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getGhz() {
        return this.ghz;
    }

    public int getRam() {
        return this.ram;
    }

    public int getStorage() {
        return this.storage;
    }

    public boolean isOn() {
        return this.on;
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
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ghz=" + ghz +
                ", ram=" + ram +
                ", storage=" + storage +
                ", on=" + on +
                '}';
    }

    public void printString() {
        System.out.println(toString());
    }
}
