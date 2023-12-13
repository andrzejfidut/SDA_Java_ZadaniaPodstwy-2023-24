package pl.sdacademy.java.basic.exercices.day2;

public class Task20 {
//    Napisz program za pomocą który stworzy ciąg arytmetyczny o podanych (jako argumenty
//metody) właściwościach: długość, pierwszy element, różnica ciągu.
//            Podpowiedź: ciąg jest ciągiem arytmetycznym jeżeli różnica pomiędzy każdym elementem jest
//    dokładnie taka sama.
//* Napisz metodę która sprawdzi, czy podany ciąg liczb jest ciągiem arytmetycznym.
//    Przykład:
//    private static int[] generateArithmeticProgression(int length, int firstElement, int odds)
//    Input: length = 5, firstElement = 3, odds = 3
//    Result:
//            3 6 9 12 15
//            true
public static void main(String[] args) {
    int length = 5;
    int firstElement = 3;
    int odds = 3;

    // Generowanie ciągu arytmetycznego
    int[] progression = generateArithmeticProgression(length, firstElement, odds);
    System.out.println("Generated arithmetic progression:");
    printArray(progression);

    // Sprawdzanie, czy dany ciąg liczb jest ciągiem arytmetycznym
    boolean isArithmetic = checkArithmeticProgression(progression);
    System.out.println("Is the generated progression an arithmetic progression? " + isArithmetic);
}

    // Metoda do generowania ciągu arytmetycznego
    private static int[] generateArithmeticProgression(int length, int firstElement, int odds) {
        int[] progression = new int[length];
        progression[0] = firstElement;
        for (int i = 1; i < length; i++) {
            progression[i] = progression[i - 1] + odds;
        }
        return progression;
    }

    // Metoda do sprawdzania, czy dany ciąg liczb jest ciągiem arytmetycznym
    private static boolean checkArithmeticProgression(int[] array) {
        int odds = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != odds) {
                return false;
            }
        }
        return true;
    }

    // Metoda do wyświetlania tablicy
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
}
}
