public class Main {

    public static void main(String[] args) {
       /* Array test = new Array();
        test.Fullen();
        test.minPos(6,5); */

        Auto bmw = new Auto(4, 5000, "BMW");
        System.out.println(bmw);

        System.out.println("Preis:  " + bmw.preis + " Reifen: "  + bmw.reifen + " Marke: " + bmw.marke);

        Auto audi = new Auto(4, 7000, "Audi");
        audi.comparePrice(10000);
        bmw.comparePrice(3000);

    }

}
