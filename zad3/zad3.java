package zad3;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Ten program oblicza średnią ocen z kilku przedmiotów.");

        double[] oceny = new double[3];

        for (int i = 0; i < oceny.length; i++) {
            System.out.print("Podaj ocenę z przedmiotu nr " + (i + 1) + ": ");
            oceny[i] = scanner.nextDouble();
        }

        System.out.println("Twoje oceny to:");
        double sumaOcen = 0;
        for (double ocena : oceny) {
            System.out.println("- " + ocena);
            sumaOcen += ocena;
        }
        System.out.println("Suma ocen: " + sumaOcen);

        double srednia = sumaOcen / oceny.length;

        System.out.println("Twoja średnia ocen to: " + srednia);

        scanner.close();
    }
}
