package pl.sdacademy.java.basic.exercices.day2;

public class ExtrasTask7 {
    public static void main(String[] args) {
        int[][] tablica = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Tablica dwuwymiarowa:");
        wyswietlTablice(tablica);

        // Oblicz i wyświetl sumę elementów na obu przekątnych
        int sumaPrzekatnej = obliczSumePrzekatnej(tablica);
        System.out.println("Suma elementów na przekątnych: " + sumaPrzekatnej);

        // Oblicz i wyświetl sumę elementów na krawędziach
        int sumaKrawedzi = obliczSumeKrawedzi(tablica);
        System.out.println("Suma elementów na krawędziach: " + sumaKrawedzi);
    }

    // Metoda do wyświetlania tablicy dwuwymiarowej
    public static void wyswietlTablice(int[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // Metoda do obliczania sumy elementów na obu przekątnych
    public static int obliczSumePrzekatnej(int[][] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i][i]; // Elementy na głównej przekątnej
            suma += tablica[i][tablica.length - 1 - i]; // Elementy na drugiej przekątnej
        }
        return suma;
    }

    // Metoda do obliczania sumy elementów na krawędziach
    public static int obliczSumeKrawedzi(int[][] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[0][i]; // Elementy w pierwszym wierszu
            suma += tablica[tablica.length - 1][i]; // Elementy w ostatnim wierszu
            suma += tablica[i][0]; // Elementy w pierwszej kolumnie
            suma += tablica[i][tablica.length - 1]; // Elementy w ostatniej kolumnie
        }
        // Skoryguj podwójne zliczanie narożnych elementów
        suma -= tablica[0][0] + tablica[0][tablica.length - 1];
        suma -= tablica[tablica.length - 1][0] + tablica[tablica.length - 1][tablica.length - 1];
        return suma;
    }
}
