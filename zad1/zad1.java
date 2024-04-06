package zad1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Ten program oblicza średnią ocen z kilku przedmiotów.");
        
        System.out.print("Podaj ocenę z matematyki: ");
        double matematyka = scanner.nextDouble();

        System.out.print("Podaj ocenę z fizyki: ");
        double fizyka = scanner.nextDouble();

        System.out.print("Podaj ocenę z chemii: ");
        double chemia = scanner.nextDouble();

        double srednia = (matematyka + fizyka + chemia) / 3;

        System.out.println("Twoja średnia ocen to: " + srednia);
        
        scanner.close();
    }
}
