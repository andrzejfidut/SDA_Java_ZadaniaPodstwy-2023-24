package pl.sdacademy.java.basic.exercices.day0;

public class Task4 {
    public static void main(String[] args) {


//        18. Napisz metodę w Javie, która znajdzie i zwróci najmniejszą wartość w wybranym wierszu tablicy wielowymiarowej.

        int[][] wielowymiarowaTablica = {
                {1, 7, 3, 5},
                {3, 12, 3},
                {2, 3, 0, 0}
        };

        int numerWiersza = 1;             // Wybierz numer wiersza (indeksowany od 0)

        int najmniejszaWartosc = znajdzNajmniejszaWWierszu(wielowymiarowaTablica, numerWiersza);

        // Wydrukowanie najmniejszej wartości
        System.out.println("Najmniejsza wartość w wybranym wierszu: " + najmniejszaWartosc);
    }

    // Metoda do znajdowania najmniejszej wartości w wybranym wierszu
    static int znajdzNajmniejszaWWierszu(int[][] wielowymiarowaTablica, int numerWiersza) {
        // Sprawdzenie, czy numer wiersza jest prawidłowy
        if (numerWiersza < 0 || numerWiersza >= wielowymiarowaTablica.length) {
            System.out.println("Nieprawidłowy numer wiersza.");
            return Integer.MIN_VALUE; // Zwróć wartość minimalną dla typu int
        }

        // Początkowa wartość dla porównań
        int najmniejszaWartosc = wielowymiarowaTablica[numerWiersza][0];

        // Znalezienie najmniejszej wartości w wybranym wierszu
        for (int j = 1; j < wielowymiarowaTablica[numerWiersza].length; j++) {
            if (wielowymiarowaTablica[numerWiersza][j] < najmniejszaWartosc) {
                najmniejszaWartosc = wielowymiarowaTablica[numerWiersza][j];
            }
        }

        return najmniejszaWartosc;

    }
}
