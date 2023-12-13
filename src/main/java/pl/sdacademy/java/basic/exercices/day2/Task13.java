package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task13 {
//    Napisz program, który dla podanej tablicy int'ów wyświetli najpierw najmniejszą, największą
//    liczbę z tablicy a następnie sumę wszystkich elementów.
//    Przykład:
//    Input: 12 7 19
//    Min value: 7
//    Max value: 19
//    Total sum: 38
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int sizeTab = scanner.nextInt();

    int[] array = new int[sizeTab];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < sizeTab; i++) {
        array[i] = scanner.nextInt();
    }

    int minValue = findMinValue(array);
    int maxValue = findMaxValue(array);
    int totalSum = calculateTotalSum(array);

    System.out.println("Min value: " + minValue);
    System.out.println("Max value: " + maxValue);
    System.out.println("Total sum: " + totalSum);
}

    private static int findMinValue(int[] array) {   //najmniejsza
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int findMaxValue(int[] array) {   // najwieksza
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int calculateTotalSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
