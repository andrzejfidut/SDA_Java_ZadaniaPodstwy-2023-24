package pl.sdacademy.java.basic.exercices.day2;

public class Task2 {
//    Napisz program, który przyjmie jako argumenty input i prefix (oba typu String), a następnie
//    sprawdzi czy zmienna input rozpoczyna się od słowa przesłanego pod argumentem prefix.
//            * Spróbuj napisać program, który będzie robił to samo ale z podanym suffixem.
//            Przykład:
//    Input: programowanie, Prefix: pro
//    Result: true
//    Input: programowanie, Suffix: nie
//    Result: true

    public static void main(String[] args) {


        System.out.println(checkPrefix("programowanie", "pro"));
        System.out.println(checkSuffix("programowanie", "nie"));
    }
    private static boolean checkPrefix(String input, String prefix) {
        return input != null && prefix != null && input.startsWith(prefix);
    }

    private static boolean checkSuffix(String input, String suffix) {
        return input != null && suffix != null && input.endsWith(suffix);
    }
}
