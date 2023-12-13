package pl.sdacademy.java.basic.exercices.day2;

public class Task1 {
//    Napisz program, który przyjmie jako parametr tekst (typu String), a następnie zwróci jego
//    ostatni znak.
//    Przykład:
//    Original word: ala
//    Last Char: a
//    Original word: domek
//    Last Char: k
public static void main(String[] args) {

    System.out.println("Original word: ala");
    System.out.println("Last Char: " + getLastChar("ala"));

    System.out.println("Original word: domek");
    System.out.println("Last Char: " + getLastChar("domek"));
}
    private static char getLastChar(String text) {
        if (text != null && !text.isEmpty()) {
            return text.charAt(text.length() - 1);
        } else {
            return 0;
        }
}
}
