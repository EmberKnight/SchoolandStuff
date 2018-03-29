public class Auto {

    int reifen;
    int preis;
    String marke;

    public Auto(int reifen, int preis, String marke) {
        setReifen(reifen);
        setPreis(preis);
        setMarke(marke);
    }

    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void comparePrice(int preis) {
        if (this.preis <= preis) {
            System.out.println("Der " + this.marke + " ist billiger!");
        }
        else {
            System.out.println("Der " + this.marke + " ist teuerer!");
        }
    }

}
