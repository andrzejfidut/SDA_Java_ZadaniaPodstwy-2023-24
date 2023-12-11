package pl.sdacademy.java.basic.exercices.day1;

public class Task12 {
    public static void main(String[] args) {
        // Testujemy własną implementację modulo
        System.out.println("Own Modulo Implementation:");
        System.out.println("Result of 2 % 4: " + ownModuloImplementation(2, 4));
        System.out.println("Result of 4 % 2: " + ownModuloImplementation(4, 2));
        System.out.println("Result of 3 % 4: " + ownModuloImplementation(3, 4));
        System.out.println("Result of 4 % 3: " + ownModuloImplementation(4, 3));

        // Sprawdzamy poprawność własnej implementacji
        System.out.println("\nCheck if Own Modulo Implementation is Correct:");
        System.out.println(ifOwnModuloImplementationIsCorrect(2, 4));  // true
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 2));  // true
        System.out.println(ifOwnModuloImplementationIsCorrect(3, 4));  // true
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 3));  // true
        System.out.println(ifOwnModuloImplementationIsCorrect(5, 3));  // false
    }

    // Własna implementacja funkcji modulo
    private static int ownModuloImplementation(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    // Funkcja sprawdzająca poprawność własnej implementacji
    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownModuloImplementation(a, b) == a % b;
    }
}



