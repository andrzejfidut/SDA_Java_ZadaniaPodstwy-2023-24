package pl.sdacademy.java.basic.exercices.day1;
import java.util.Scanner;
public class Task13 {
//    Napisz program, który wczytuje od użytkownika liczby całkowite, do momentu aż zostanie
//    podana liczba 0 (wartość ta jest pomijana w dalszych operacjach), następnie wyliczy i wyświetli:
//    a) średnią arytmetyczną podanych liczb;
//    b) ilość wszystkich podanych liczb;
//    c) ilość liczb parzystych.
//            Przykład:
//    Please insert digit: 2
//    Please insert digit: 4
//    Please insert digit: 5
//    Please insert digit: 10
//    Please insert digit: 0
//    Total Number Of Digits: 4
//    Total Number Of Even Digits: 3
//    Arithmetic Average: 5.25
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int count = 0;
            int evenCount = 0;

            while (true) {
                System.out.print("Please insert digit: ");
                int number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                sum += number;
                count++;

                if (number % 2 == 0) {
                    evenCount++;
                }
            }

            if (count > 0) {
                double average = (double) sum / count;

                System.out.println("Total Number Of Digits: " + count);
                System.out.println("Total Number Of Even Digits: " + evenCount);
                System.out.println("Arithmetic Average: " + average);
            } else {
                System.out.println("No digits were entered.");
            }

    }
}
