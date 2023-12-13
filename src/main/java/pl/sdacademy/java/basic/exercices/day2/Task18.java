package pl.sdacademy.java.basic.exercices.day2;
import java.util.Random;
public class Task18 {
//    Napisz program, który utworzy tablicę zawierającą 10 losowych liczb całkowitych z przedziału
//0. . . 9. Następnie wypisze ile razy dana liczba pojawiła się w tablicy.
//    Przykład:
//    Input: 4 3 9 4 5 7 6 4 8 8
//            0: 0
//            1: 0
//            2: 0
//            3: 1
//            4: 3
//            5: 1
//            6: 1
//            7: 1
//            8: 2
//            9: 1
public static void main(String[] args) {

    int[] numbers = generateRandomArray(10, 0, 9);

    System.out.print("Input: ");
    printArray(numbers);

    countAndPrintOccurrences(numbers);  // zliczanie wystapien
}
    private static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
    private static void printArray(int[] array) {   // wypisywanie tablicy
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    private static void countAndPrintOccurrences(int[] array) {  // zliczanie wystapien
        int[] occurrences = new int[10];

        for (int number : array) {
            occurrences[number]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(i + ": " + occurrences[i]);
        }
    }
}
