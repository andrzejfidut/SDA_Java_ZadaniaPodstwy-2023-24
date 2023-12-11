package pl.sdacademy.java.basic.exercices.day0;

public class Task2 {
    public static void main(String[] args) {

        //      13. Znajdź maksymalną i minimalną wartość w każdym wierszu tablicy.
//                Utwórz dwuwymiarową tablicę 5x8 typu int i zainicjalizuj ją blokiem inicjalizacyjnym.
//        Znajdź wartość maksymalną i minimalną w każdym "rzędzie" i zapisz te wartości do tablicy dwuwymiarowej 5x2.
//                Wydrukuj tablicę zawierającą wartości maksymalne i minimalne.

        int[][] tabTab = {
                {1, 7, 3, 5, 10, 8, 2, 6},
                {4, 12, 6, 9, 5, 11, 13, 7},
                {8, 15, 9, 14, 6, 10, 12, 11},
                {2, 6, 13, 7, 4, 9, 5, 8},
                {11, 3, 8, 5, 14, 7, 6, 12}
        };

        // Utworzenie dwuwymiarowej tablicy na wartości maksymalne i minimalne

        int[][] minMaxTabTab = new int[5][2];

        // Znalezienie wartości maksymalnych i minimalnych w każdym rzędzie

        for (int i = 0; i < 5; ++i) {
            int min = tabTab[i][0];
            int max = tabTab[i][0];

            for (int j = 1; j < 8; ++j) {
                if (tabTab[i][j] < min) {
                    min = tabTab[i][j];
                }

                if (tabTab[i][j] > max) {
                    max = tabTab[i][j];
                }
            }

            // Zapisanie wartości do tablicy minMaxTablica

            minMaxTabTab[i][0] = min;
            minMaxTabTab[i][1] = max;
        }

        // Wydrukowanie tablicy zawierającej wartości maksymalne i minimalne
        System.out.println("Tablica wartości minimalnych i maksymalnych:");
        for (int i = 0; i < 5; ++i) {
            System.out.println("Rząd " + (i + 1) + ": Min = " + minMaxTabTab[i][0] + ", Max = " + minMaxTabTab[i][1]);
        }

        System.out.println();


//       Zad. 14  Napisać program, który dodaje do siebie dwie tablicy liczb typu int.
//                Obie tablicy mają ten sam rozmiar.
//                Przykład:

        int[] arrayOne = {1, 3, 4, 5};
        int[] arrayTwo = {2, 2, 3, 1};

        // Sprawdzenie, czy obie tablice mają ten sam rozmiar

        if (arrayOne.length != arrayTwo.length) {
            System.out.println("Tablice muszą mieć ten sam rozmiar.");
            return;
        }

        // Utworzenie tablicy wynikowej

        int[] sumaTablic = new int[arrayOne.length];

        // Dodawanie odpowiadających sobie elementów

        for (int i = 0; i < arrayOne.length; ++i) {
            sumaTablic[i] = arrayOne[i] + arrayTwo[i];
        }

        // Wydrukowanie wyniku

        System.out.println("Wynik dodawania tablic:");
        for (int i = 0; i < sumaTablic.length; ++i) {
            System.out.print(sumaTablic[i] + " ");
        }
        System.out.println ();


//        Zad 15 Napisać program, który dodaje do siebie tablice o roznych rozmiarach

        // Przykładowe tablice

        int[] arrayOne15 = {1, 3, 4, 5, 7, 8};
        int[] arrayTwo15 = {2, 2, 3, 1};
        int[] arrayThree15 = {3, 5, 7, 6, 7, 8};

        // Znalezienie minimalnej długości spośród tablic

        int minTab = Math.min(Math.min(arrayOne15.length, arrayTwo15.length), arrayThree15.length);

        // Utworzenie tablicy wynikowej o długości minTab

        int[] sumaTablic15 = new int[minTab];

        // Dodawanie odpowiadających sobie elementów

        for (int i = 0; i < minTab; ++i) {
            sumaTablic15[i] = arrayOne15[i] + arrayTwo15[i] + arrayThree15[i];
        }

        // Wydrukowanie wyniku

        System.out.println("Wynik dodawania tablic:");
        for (int i = 0; i < sumaTablic15.length; ++i) {
            System.out.print(sumaTablic15[i] + " ");
        }


        System.out.println ();


        //       Zad 16 Napisać metodę, która umożliwi stworzenie jednowymiarowej tablicy na podstawie wielowymiarowej.
//                Wartość elementów jednowymiarowej tablicy będzie sumą wszystkich kolumn wielowymiarowej.
//        Metoda powinna obsługiwać wielowymiarowe tablice o różnej długości rzędów.


        int[][] wielowymiarowaTablica = {
                {1, 7, 3, 5},
                {3, 12, 3},
                {2, 3, 0, 0}
        };

        int[] jednowymiarowaTablica = sumaKolumn(wielowymiarowaTablica);

        // Wydrukowanie jednowymiarowej tablicy

        System.out.println("Jednowymiarowa tablica: ");
        for (int i = 0; i < jednowymiarowaTablica.length; i++) {
            System.out.print(jednowymiarowaTablica[i] + " ");
        }

        System.out.println();

    }
    //   Metoda do tworzenia jednowymiarowej tablicy na podstawie wielowymiarowej

    static int[] sumaKolumn(int[][] wielowymiarowaTablica) {
        int iloscRzedow = wielowymiarowaTablica.length;
        int iloscKolumn = 0;

        // Znalezienie maksymalnej liczby kolumn w rzędach

        for (int i = 0; i < iloscRzedow; i++) {
            iloscKolumn = Math.max(iloscKolumn, wielowymiarowaTablica[i].length);
        }

        // Utworzenie jednowymiarowej tablicy o długości ilości kolumn

        int[] jednowymiarowaTablica = new int[iloscKolumn];

        // Obliczenie sumy kolumn

        for (int i = 0; i < iloscRzedow; i++) {
            for (int j = 0; j < wielowymiarowaTablica[i].length; j++) {
                jednowymiarowaTablica[j] += wielowymiarowaTablica[i][j];
            }
        }
        return jednowymiarowaTablica;

    }
}
