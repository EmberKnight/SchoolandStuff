public class Figuren {

    public void rechteck(int hoehe, int breite) {

        int i, j, stern, leer;
        leer = 0;

        for (i = 0; i < hoehe; i++) {

            for (j = 0; j < leer; j++) {

                System.out.print("  ");

            }

            for (stern = 0; stern < breite; stern++) {

                System.out.print("* ");

            }

            System.out.println();
            leer = leer + 1;

        }


    }

}
