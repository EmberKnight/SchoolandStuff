import java.util.Scanner;

public class Figuren {

    public void Rechteck(int hoehe, int breite) {

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

    public void aT(int hoehe) {

        int leer, i, j, a;
        leer = 1;

        for (i = 0; i < hoehe; i++) {

            for (j = 0; j < hoehe - leer; j++) {

                System.out.print(" ");

            }

            for (a = 0; a < leer; a++) {

                System.out.print("@");

            }
            System.out.println();
            leer = leer + 1;
        }

    }

}
