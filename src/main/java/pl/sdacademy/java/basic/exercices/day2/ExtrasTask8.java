package pl.sdacademy.java.basic.exercices.day2;

public class ExtrasTask8 {
    public static void main(String[] args) {
        // Stwórz dwuwymiarową tablicę o trzech wierszach
        int[][] tablica = new int[3][10];

        // Wypełnij pierwszy wiersz liczbami od 1 do 10
        for (int i = 0; i < 10; i++) {
            tablica[0][i] = i + 1;
        }

        // Wypełnij drugi wiersz kwadratami liczb z pierwszego wiersza
        for (int i = 0; i < 10; i++) {
            tablica[1][i] = (i + 1) * (i + 1);
        }

        // Wypełnij trzeci wiersz sześcianami liczb z pierwszego wiersza
        for (int i = 0; i < 10; i++) {
            tablica[2][i] = (i + 1) * (i + 1) * (i + 1);
        }

        // Wyświetl tablicę
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
