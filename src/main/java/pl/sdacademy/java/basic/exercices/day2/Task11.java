package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task11 {
//    Napisz program, który będzie sprawdzał czy podane słowo (typu String) jest palindromem.
//    Przykład:
//    Input: kajak
//    Result: true
//    Input: sda
//    Result: false
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Input: ");
    String word = scanner.nextLine();

    boolean isPalindrome = checkPalindrome(word);

    System.out.println("Result: " + isPalindrome);
}
    private static boolean checkPalindrome(String word) {
        // Usuń białe znaki i zamień na małe litery
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        // Porównaj słowo z jego odwróconą wersją
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }
}
