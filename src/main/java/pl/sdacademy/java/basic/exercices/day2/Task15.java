package pl.sdacademy.java.basic.exercices.day2;
import java.util.Arrays;
public class Task15 {
//    Napisz program, w którym zdefiniujesz dwie tablice przechowujące Stringi. Napisz metodę,
//    która porówna obie tablice i sprawdzi czy są one dokładnie takie same (takie same wartości
//            i kolejności elementów).
//    Przykład:
//    Input:
//    FirstArray: "Ala", "ma", "kota”
//    SecondArray: "Ala", "ma", "kotaa"
//    Result: false
public static void main(String[] args) {

    String[] firstArray = {"Ala", "ma", "kota"};
    String[] secondArray = {"Ala", "ma", "kota"};

    boolean result = compareArrays(firstArray, secondArray);

    System.out.println("Result: " + result);
}
    private static boolean compareArrays(String[] array1, String[] array2) {
        return Arrays.equals(array1, array2);
    }
}
