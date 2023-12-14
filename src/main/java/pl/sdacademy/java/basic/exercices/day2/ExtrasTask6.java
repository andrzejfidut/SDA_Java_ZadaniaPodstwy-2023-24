package pl.sdacademy.java.basic.exercices.day2;

public class ExtrasTask6 {
    public static void main(String[] args) {

        int rozmiar = 10;

        System.out.print("   ");
        for (int i = 1; i <= rozmiar; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-----------------------------------------");

        // Wyświetl tabliczkę mnożenia
        for (int i = 1; i <= rozmiar; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= rozmiar; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
