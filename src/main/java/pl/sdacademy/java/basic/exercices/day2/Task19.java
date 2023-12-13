package pl.sdacademy.java.basic.exercices.day2;

public class Task19 {
//    Napisz program, w którym zdefiniujesz dwie tablice dwuwymiarowe liczb całkowitych.
//            Następnie:
//    a) zwróć tę, w której suma liczb jest większa;
//    b) zwróć największą liczbę z obu tablic;
//    c) zwróć najmniejszą liczbę z obu tablic.
//    Przykład:
//    Input:
//    firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
//    secondArray = {{10,
//            -1, 5}, {-25, 6, 6}, {12, 8, 9}}
//    Result:
//    Bigger array is: 1, 2, 3, 4, 5, 6,7, 8, 9
//    The biggest value is: 12
//    The lowest value is: -25
public static void main(String[] args) {
    // Definicja dwóch tablic dwuwymiarowych
    int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] secondArray = {{10, -1, 5}, {-25, 6, 6}, {12, 8, 9}};

    // Wywołanie metod i wyświetlenie wyników
    System.out.println("Bigger array is: " + arrayToString(getBiggerArray(firstArray, secondArray)));
    System.out.println("The biggest value is: " + getMaxValue(firstArray, secondArray));
    System.out.println("The lowest value is: " + getMinValue(firstArray, secondArray));
}

    // Metoda do zwracania tablicy, w której suma liczb jest większa
    private static int[][] getBiggerArray(int[][] array1, int[][] array2) {
        return sumOfArray(array1) > sumOfArray(array2) ? array1 : array2;
    }

    // Metoda do zwracania największej liczby z obu tablic
    private static int getMaxValue(int[][] array1, int[][] array2) {
        return Math.max(findMaxValue(array1), findMaxValue(array2));
    }

    // Metoda do zwracania najmniejszej liczby z obu tablic
    private static int getMinValue(int[][] array1, int[][] array2) {
        return Math.min(findMinValue(array1), findMinValue(array2));
    }

    // Metoda do sumowania wszystkich liczb w tablicy dwuwymiarowej
    private static int sumOfArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    // Metoda do znajdowania największej liczby w tablicy dwuwymiarowej
    private static int findMaxValue(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    // Metoda do znajdowania najmniejszej liczby w tablicy dwuwymiarowej
    private static int findMinValue(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    // Metoda do konwertowania tablicy na tekst
    private static String arrayToString(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int[] row : array) {
            for (int value : row) {
                result.append(value).append(", ");
            }
        }
        return result.substring(0, result.length() - 2);
    }
}
