package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class ExtrasTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First char: ");
        char firstChar = scanner.next().charAt(0);

        System.out.print("Second char: ");
        char secondChar = scanner.next().charAt(0);

        int distance = calculateDistance(firstChar, secondChar);

        System.out.println("Distance: " + distance);
    }

    public static int calculateDistance(char firstChar, char secondChar) {
        // Zamiana liter na wartości liczbowe w tabeli ASCII
        int firstValue = Character.toUpperCase(firstChar);
        int secondValue = Character.toUpperCase(secondChar);

        // Sprawdzenie, która litera jest większa
        if (firstValue > secondValue) {
            return firstValue - secondValue - 1;
        } else {
            return secondValue - firstValue - 1;
        }
    }
}
