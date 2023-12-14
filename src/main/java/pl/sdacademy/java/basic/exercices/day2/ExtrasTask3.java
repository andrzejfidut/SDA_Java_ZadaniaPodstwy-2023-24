package pl.sdacademy.java.basic.exercices.day2;
import java.util.Arrays;
public class ExtrasTask3 {
    public static void main(String[] args) {
        int[] inputArray = {1, 0, 5, 10, 0, 6};

        System.out.println("Input: " + Arrays.toString(inputArray));

        moveZerosToEnd(inputArray);

        System.out.println("Output: " + Arrays.toString(inputArray));
    }

    public static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;

        // Przesuwanie wszystkich niezerowych elementów na początek tablicy
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }

        // Uzupełnianie pozostałej części tablicy zerami
        for (int i = nonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
