package pl.sdacademy.java.basic.exercices.day1;
import java.util.Scanner;
import java.util.Random;
public class Task11 {

//    Napisz program, który będzie grał z użytkownikiem w „za dużo, za mało”.
//    a) W pierwszym kroku komputer losuje liczbę z zakresu od 0 d 100 (skorzystaj z metody
//Random.nextInt()).
//    b) Następnie czeka na podanie liczby przez użytkownika.
//            c) Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer, program powinien
//    wypisać „too much” i czekać na podanie kolejnej liczby. Jeśli użytkownik poda liczbę mniejszą,
//    program powinien wypisać „not enough” i analogicznie czekać na następną liczbę. Jeśli podana
//    wartość jest tą szukaną, to program powinien wypisać słowo „Bingo!” i zakończyć się.
//            Przykład:
//    Please insert digit: 5
//    Not enough
//    Please insert digit: 15
//    Too much
//    Please insert digit: 10
//    Bingo!
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberDrawn = random.nextInt(101);

        System.out.println("Welcome to the 'Too much, too little' game!");
        System.out.println("Guess a number between 0 and 100.");

        while (true) {
            System.out.print("Enter the number: ");
            int proposal = scanner.nextInt();

            if (proposal < numberDrawn) {
                System.out.println("Too few!");
            } else if (proposal > numberDrawn) {
                System.out.println("Too much!");
            } else {
                System.out.println("Bingo! You guessed it!");
                break;
            }
        }
    }
}
