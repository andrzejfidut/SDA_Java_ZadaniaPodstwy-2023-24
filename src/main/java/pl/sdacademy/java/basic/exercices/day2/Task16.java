package pl.sdacademy.java.basic.exercices.day2;
import java.util.Arrays;
public class Task16 {
//    Napisz program, który dla zadanej tablicy 3 int'ów zamieni miejscami pierwszy i trzeci element.
//    Przykład:
//    Input: 12, 7, 19
//    Result: 19, 7, 12
//            * Napisz metodę, którą przyjmie tablicę int'ów o dowolnej długości, i odwróci kolejność jej
//    elementów.
//            Przykład:
//    Input: 12, 7, 19, 33
//    Result: 33, 19, 7, 12

    public static void main(String[] args) {

        int[] array1 = {12, 7, 19, 33};
        swapFirstAndThird(array1);
        System.out.println("Result (1): " + Arrays.toString(array1));

        int[] array2 = {12, 7, 19, 33};
        reverseArray(array2);
        System.out.println("Result (2): " + Arrays.toString(array2));
    }
    private static void swapFirstAndThird(int[] array) {  //zamiana 1 i 3 elementu w tablicy
        if (array.length >= 3) {
            int temp = array[0];
            array[0] = array[2];
            array[2] = temp;
        }
    }
    // Metoda do odwrócenia kolejności elementów w tablicy o dowolnej długości
    private static void reverseArray(int[] array) {   //pdwranie kolejnosci elementow w tablicy
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;   // przesowanie wskaznikow w tablizy
            right--;
        }
    }
}
