package pl.sdacademy.java.basic.exercices.day2;

public class Task3 {
//    Napisz program, który przyjmie jako parametry input oraz word (oba typu String), a następnie
//    sprawdzi czy word występuje w input. Jeżeli tak, wtedy wynikiem jest pozycja na której zaczyna
//    się word. Jeżeli nie udało się znaleźć szukanego tekstu wtedy wynikiem powinno być-1.
//    Przykład:
//    Input: Ala ma kota
//    Word: ma
//    Result: 4
//    Input: Ala ma kota
//    Word:
//    Result: -1

    public static void main(String[] args) {

        System.out.println("Input: Ala ma kota");
        System.out.println("Word: ma");
        System.out.println("Result: " + findWordPosition("Ala ma kota", "ma"));

        System.out.println("Input: Ala ma kota");
        System.out.println("Word: ");
        System.out.println("Result: " + findWordPosition("Ala ma kota", ""));
    }
    private static int findWordPosition(String input, String word) {
        if (input != null && word != null && !word.isEmpty()) {
            int position = input.indexOf(word);
            return position != -1 ? position : -1;
        } else {
            return -1;
        }
    }
}
