package pl.sdacademy.java.basic.exercices.day1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Napisz program realizujący prosty kalkulator. Program powinien:
//        a) pobrać pierwszą liczbę (typu float);
//        b) pobrać jeden ze znaków: + - / *;
//        c) pobrać drugą liczbę (typu float);
//        d) zwrócić wynik pobranego działania.
//        Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Operator not
//        exist” i zakończyć program.
//                Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki), to
//        program powinien wypisać napis „Wrong operation”
//
// Dodaj funkcjonalność, która pozwoli na wielokrotne wykonywanie działań, a zakończenie
//        działania programu nastąpi po wpisaniu tekstu „Stop”.


        Scanner scanner = new Scanner (System.in);

        do {
            System.out.print("Specify the first number of type float: ");
            float numberFirst = scanner.nextFloat();

            System.out.print("Specify the operator: +, -, *, /   ");
            char operator = scanner.next().charAt(0);

            System.out.print("Specify the second number of type float: ");
            float numberSecond = scanner.nextFloat();

            float result = performOperation(numberFirst, operator, numberSecond);

            if (!Float.isNaN(result)) {
                System.out.println("Result = " + result);
            } else {
                System.out.println("Wrong operation! ");
                break;
            }

            System.out.print("If you want to stop, enter 0: ");
        } while (scanner.nextFloat() != 0);

    }
    static float performOperation(float numberFirst, char operator, float numberSecond) {
        float result = 0;

        switch (operator) {
            case '+':
                result = numberFirst + numberSecond;
                break;
            case '-':
                result = numberFirst - numberSecond;
                break;
            case '*':
                result = numberFirst * numberSecond;
                break;
            case '/':
                if (numberSecond != 0) {
                    result = numberFirst / numberSecond;
                } else {
                    System.out.println("Can't divide by 0: ");
                    return Float.NaN;
                }
                break;
            default:
                System.out.println("Operator not exist: ");
                return Float.NaN;
        }

        return result;
    }
}
