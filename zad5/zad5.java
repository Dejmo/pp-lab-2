package zad5;

import java.util.Arrays;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Ten program oblicza średnią i medianę ocen z kilku przedmiotów.");

        double[] oceny = new double[3];

        for (int i = 0; i < oceny.length; i++) {
            double ocena;
            do {
                System.out.print("Podaj ocenę z przedmiotu nr " + (i + 1) + ": ");
                ocena = scanner.nextDouble();
                if (ocena <= 0 || ocena >= 6) {
                    System.out.println("Ocena musi być dodatnia i mniejsza od 6. Spróbuj ponownie.");
                }
            } while (ocena <= 0 || ocena >= 6);
            oceny[i] = ocena;
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

        Arrays.sort(oceny); 
        double mediana;
        if (oceny.length % 2 == 0) {
            mediana = (oceny[oceny.length / 2 - 1] + oceny[oceny.length / 2]) / 2;
        } else {
            mediana = oceny[oceny.length / 2];
        }
        System.out.println("Mediana ocen to: " + mediana);

        scanner.close();
    }
}
