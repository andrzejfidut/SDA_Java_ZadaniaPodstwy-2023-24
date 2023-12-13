package pl.sdacademy.java.basic.exercices.day2;
import java.util.Arrays;
import java.util.Scanner;
public class Task17 {
//    Napisz program, który pobierze od użytkownika 10 liczb (typu int). Następnym krokiem powinno
//    być zapisanie ich w tablicy, posortowanie jej rosnąco oraz wypisanie wyniku sortowania na
//    ekran.
//            Przykład:
//    Insert digit: 2
//    Insert digit: 4
//    Insert digit: 6
//    Insert digit: 0
//    Insert digit:-5
//    Insert digit:-7
//    Insert digit: 3
//    Insert digit: 9
//    Insert digit:-4
//    Insert digit:-5
//    Result: -7 -5 -5 -4 0 2 3 4 6 9
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];

    for (int i = 0; i < 10; i++) {
        System.out.print("Insert digit: ");
        numbers[i] = scanner.nextInt();
    }

    Arrays.sort(numbers);

    System.out.print("Result: ");
    for (int number : numbers) {
        System.out.print(number + " ");
    }
  }
}
