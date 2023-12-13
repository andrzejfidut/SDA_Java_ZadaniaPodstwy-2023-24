package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task6 {
//    Napisz program, który przyjmie jako argument input (typu String) i znak (typu char), a następnie
//    zwróci indeks, na którym znajduje się pierwszy poszukiwany znak (w podanym łańcuchu
//            znaków). Jeżeli znak nie występuje w inpucie, to wynikiem funkcji powinno być-1. Pozycje
//    znaków powinny być numerowane od 0.
//    Przykład:
//    Input: Ala ma kota
//    Searched Character: a
//    Result: 2
//    Przykład:
//    Input: Ala ma kota
//    Searched Character: z
//    Result: -1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your text: ");
        String userInput = scanner.nextLine();

        System.out.print("Searched Character: ");
        char searchedChar = scanner.next().charAt(0);

        int index = findFirstIndex(userInput, searchedChar);

        System.out.println("Result: " + index);
    }

    private static int findFirstIndex(String text, char character) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                return i;
            }
        }
        return -1;
    }
}
