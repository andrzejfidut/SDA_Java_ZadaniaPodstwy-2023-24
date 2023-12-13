package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task4 {
//    Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a następnie dla tego
//    tekstu zamienia wszystkie wystąpienia przecinków i kropek na tekst“
//            -STOP-”, a następnie
//    wyświetla wynik w konsoli.
//    Przykład:
//    Please insert your text: Ala ma, kota. a kot, ma Ale
//    After modifications: Ala ma-STOP- kota-STOP- a kot-STOP- ma Ale

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your text: ");
        String userInput = scanner.nextLine();

        String modifiedText = userInput.replaceAll("[,.]", "-STOP-");

        System.out.println("After modifications: " + modifiedText);
    }
}
