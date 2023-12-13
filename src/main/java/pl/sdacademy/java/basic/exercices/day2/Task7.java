package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task7 {
//    Napisz program, który pobierze od użytkownika tekst (typu String) i policzy jakim procentem
//    wszystkich znaków tekstu był znak spacji.
//
//    liczba soacji / liczba wszystkich zankow * 100%
//
//    Przykład:
//    Input: Ala ma kota
//    Result: 18.181818181818183

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your text: ");
        String userInput = scanner.nextLine();

        double spacePercentage = calculateSpacePercentage(userInput);

        System.out.println("Result: " + spacePercentage + "%");
    }

    private static double calculateSpacePercentage(String text) {
        int spaceCount = 0;
        int totalCharacterCount = text.length();

        for (int i = 0; i < totalCharacterCount; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        if (totalCharacterCount > 0) {
            return ((double) spaceCount / totalCharacterCount) * 100;
        } else {
            return 0;
        }
    }
}
