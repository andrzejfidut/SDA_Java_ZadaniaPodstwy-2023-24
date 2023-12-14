package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class ExtrasTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobierz od użytkownika indeks liczby Fibonacciego
        System.out.print("Podaj indeks liczby Fibonacciego: ");
        int indeks = scanner.nextInt();

        // Sprawdź, czy wprowadzony indeks jest poprawny
        if (indeks < 0) {
            System.out.println("Podaj indeks nieujemny!");
            return;
        }

        // Oblicz i wyświetl liczbę Fibonacciego o podanym indeksie
        long wynik = obliczFibonacci(indeks);
        System.out.println("Liczba Fibonacciego o indeksie " + indeks + " to: " + wynik);

        scanner.close();
    }

    // Metoda do obliczania liczby Fibonacciego rekurencyjnie
    public static long obliczFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return obliczFibonacci(n - 1) + obliczFibonacci(n - 2);
        }
    }
}
