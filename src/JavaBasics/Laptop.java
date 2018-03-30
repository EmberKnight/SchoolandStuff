package JavaBasics;

public class Laptop {

    int ram;
    int preis;
    String marke;

    public Laptop(int ram, int preis, String marke) {
        setRam(ram);
        setPreis(preis);
        setMarke(marke);
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPreis(int preis) {
        if (preis < 2000 && preis > 500) {
            this.preis = preis;
        } else {
            System.out.println("Der Preis stimmt nicht!");
        }
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String toString() {

        return "Marke: " + marke + "\nRam: " + ram + "\nPreis: " + preis;

    }

    public void printToString() {
        System.out.println(toString());
    }

}
