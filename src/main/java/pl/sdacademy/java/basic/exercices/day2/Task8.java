package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task8 {
//    Napisz program, który przyjmie jako argument tekst (typu String), a następnie zamieni małe
//    litery na duże i odwrotnie, w podanym łańcuchu wejściowym.
//    Przykład:
//    Input: AlaKot
//    Result: aLAkOT

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your text: ");
        String userInput = scanner.nextLine();

        String result = reverseCase(userInput);

        System.out.println("Result: " + result);
    }
    private static String reverseCase(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
