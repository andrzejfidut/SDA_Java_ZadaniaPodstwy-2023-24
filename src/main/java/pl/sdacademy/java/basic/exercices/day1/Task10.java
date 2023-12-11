package pl.sdacademy.java.basic.exercices.day1;
import java.util.Scanner;

// Napisz program, który pobierze od użytkownika liczbę całkowitą (typu int), a następnie obliczy
//         sumę cyfr podanej liczby.
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please insert digit: ");
            int number = scanner.nextInt();

            int result = calculateTheSumOfTheGigits (number);
            System.out.println("Sum Of the digits: " + result);
            break;
        }
    }

    static int calculateTheSumOfTheGigits(int number) {

        int result = 0;

        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}