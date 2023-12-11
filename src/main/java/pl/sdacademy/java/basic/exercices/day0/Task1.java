package pl.sdacademy.java.basic.exercices.day0;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //        zad. 1 Wyświetlić w konsoli cyfry od 1 do 5.
        for (int i = 1; i < 6; i++) {
            System.out.printf(i + " ");
        }
        System.out.println ();
//        Zad. 2 Wyświetlić w konsoli cyfry od 17 do 4.

        for (int i = 17; i > 3; i--) {
            System.out.printf(i + " ");
        }
        System.out.println ();
//        Zad. 3 Wyświetlić w konsoli parzyste liczby w zakresie od 1 do 100;

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println();
//        Zad. 4 Pobrać od użytkownika cyfrę albo liczbę i dla niej wyświetlić w konsoli tablicę mnożenia:
//        4 * 1 = 4
//        4 * 2 = 8
//        4 * 3 = 12
//        4 * 4 = 46

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        System.out.println("Tablica mnożenia dla " + liczba + ":");

        for (int i = 1; i <= 10; ++i) {
            System.out.println(liczba + " * " + i + " = " + (liczba * i));
        }
        System.out.println ();

//        Zad. 5 Wyświetlić w konsoli poniższy ciąg za pomocą pętli:
//       Ciąg - 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i < 100; i += 7) {
            System.out.printf ((i) + " ");
        }
        System.out.println ();
//        Zad. 6 Napisać program, który wyświetli w konsoli ciąg Fibonacciego.

        System.out.println ("Ciąg Fibonacciego:");
        int ilośćElementów = 20;
        int poprzedni = 0;
        int aktualny = 1;
        for (int i = 0; i < ilośćElementów; i++) {
            System.out.printf(poprzedni + "  ");
            int suma = aktualny + poprzedni;
            poprzedni = aktualny;
            aktualny = suma;
        }
        System.out.println();
//        Zad. 7 Napisać program, który wyświetli w konsoli:
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println ();
//        Zad. 8 Sprawdź, czy dany string jest palindromem, korzystając z pętli.

        System.out.println ("Sprawdzamy czy słowo - kajak - jest palindromem: ");
        String text = "kajak";

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        if(text.equals(reversedText.toString())) {
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }
        System.out.println();
//        Zad. 9 Jednowymiarowa tablica typu String. Utwórz tablicę typu String o rozmiarze 7.
//   Wpisz do niej wartości dni tygodnia. Wypisz wartość ostatniego elementu do konsoli.
//   Wypisz wartość środkowego elementu do konsoli.

        System.out.println ("Tablica z dniami tygodnia: ");
        String dzien1 = "Poniedziałek";
        String dzien2 = "Wtorek";
        String dzien3 = "środa";
        String dzien4 = "Czwartek";
        String dzien5 = "Piątek";
        String dzien6 = "Sobota";
        String dzien7 = "Niedziela";
        String[] tabDniTyg = new String[]{dzien1, dzien2, dzien3, dzien4, dzien5, dzien6, dzien7};
        for (int i = 0; i < tabDniTyg.length; i++) {
            System.out.println(tabDniTyg[i]);
        }
        System.out.println ();
        System.out.println(tabDniTyg[6]);
        System.out.println(tabDniTyg[3]);
        System.out.println();
//        Zad. 10 Tablicę jednowymiarową typu double. Utwórz tablicę typu double o rozmiarze 4.
//    Zapisz do niej dowolne wartości za pomocą bloku inicjalizacyjnego. Wypisz na konsolę wartość pierwszego elementu

        double[] tabDouble = new double[]{8.5, 15.0, 21.0, 28.0};
        System.out.println(tabDouble[0]);
        System.out.println ();

//        Zad. 11 Utwórz dwuwymiarową tablicę typu String. Utwórz tablicę typu String o rozmiarze 3x6.
//    Wpisz do niej wartości:
//    a1 a2 a3 a4 a5 a6
//    b1 b2 b3 b4 b5 b6
//    c1 c2 c3 c4 c5 c6
//    Wydrukuj tablicę.

        String[][] tablica = new String[3][6];

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 6; ++j) {
                tablica[i][j] = (char)('a' + i) + Integer.toString (j + 1);
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 6; ++j) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println ();
//        Zad. 12 Dwuwymiarowa tablica char. Utwórz dwuwymiarową tablicę char o rozmiarze 4x2.
//    Zapisz wartości do tablicy za pomocą bloku inicjalizacyjnego. Wydrukuj wartości z tablicy.

        char[][] tabChar = new char[4][2];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                tabChar[i][j] = (char)('a' + i);
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                System.out.print(tabChar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
