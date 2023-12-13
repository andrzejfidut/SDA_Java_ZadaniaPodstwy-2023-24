package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task14 {
//    Napisz program, który dla zadanej tablicy int'ów policzy ile jest w niej liczb ujemnych. Jeśli takie
//    występują utworzy nową tablicę, do której przepisze tylko te ujemne liczby.
//    Przykład:
//    Input: 12,
//            -7, 19,
//            -5
//    Result: -7,
//            -5
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    int[] originalArray = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        originalArray[i] = scanner.nextInt();
    }

    System.out.println("Original Array:");
    printArray(originalArray);

    int[] negativeNumbersArray = getNegativeNumbersArray(originalArray);

    System.out.println("Result:");
    printArray(negativeNumbersArray);
}
    private static int[] getNegativeNumbersArray(int[] originalArray) {
        int negativeCount = countNegativeNumbers(originalArray);
        int[] negativeNumbersArray = new int[negativeCount];

        int index = 0;
        for (int value : originalArray) {
            if (value < 0) {
                negativeNumbersArray[index++] = value;
            }
        }

        return negativeNumbersArray;
    }
    private static int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value < 0) {
                count++;
            }
        }
        return count;
    }
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
