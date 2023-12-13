package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task10 {
//    Napisz program, który pobierze od użytkownika liczbę (typu int), która określi ile wyrazów
//    użytkownik chce wprowadzić. Następnie wczyta od użytkownika te wyrazy (typu String).
//    Wynikiem jest wyraz składający się z ostatnich liter każdego z wprowadzonych słów.
//    Przykład:
//    How many words would you like insert? 3
//    Kurs
//            Nerd
//    Java
//    Result: sda
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("How many words would you like to insert? ");
    int wordCount = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Insert words:");

    String[] words = new String[wordCount];
    for (int i = 0; i < wordCount; i++) {
        words[i] = scanner.nextLine();
    }

    String result = concatenateLastLetters(words);

    System.out.println("Result: " + result);
}

    private static String concatenateLastLetters(String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char lastLetter = word.charAt(word.length() - 1);
                result.append(lastLetter);
            }
        }
        return result.toString();
    }
}
