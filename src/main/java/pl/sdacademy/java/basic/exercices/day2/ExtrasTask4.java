package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class ExtrasTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobierz od użytkownika liczbę dodatnią
        System.out.print("Podaj liczbę dodatnią: ");
        int dlugoscFali = scanner.nextInt();

        // Sprawdź, czy wprowadzona liczba jest dodatnia
        if (dlugoscFali <= 0) {
            System.out.println("Wprowadź liczbę dodatnią!");
            return;
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= dlugoscFali; j++) {

                if ((i + j) % 4 == 0 || (j - i) % 4 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
