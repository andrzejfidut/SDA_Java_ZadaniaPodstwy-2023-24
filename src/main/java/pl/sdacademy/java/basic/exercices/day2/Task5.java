package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task5 {
//    Napisz program, który przyjmie jako argument input (typu String) i znak (typu char), a następnie
//    zwróci liczbę wystąpień podanego znaku w danym łańcuchu znaków.
//            Przykład:
//    Input: Ala ma kota
//    Searched Character: a
//    Result: 3

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your text: ");
        String userInput = scanner.nextLine();

        System.out.print("Searched Character: ");
        char searchedChar = scanner.next().charAt(0);

        int occurrences = countOccurrences(userInput, searchedChar);

        System.out.println("Result: " + occurrences);
    }

    // Metoda zliczająca wystąpienia podanego znaku w tekście
    private static int countOccurrences(String text, char character) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}
