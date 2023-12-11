package pl.sdacademy.java.basic.exercices.day1;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę pożyczki (od 100 do 10 000 zł): ");
        double kwota = scanner.nextDouble();
        kwota = Math.max(100, Math.min(10000, kwota));


        System.out.print("Podaj ilość rat (od 6 do 48): ");
        int iloscRat = scanner.nextInt();
        iloscRat = Math.max(6, Math.min(48, iloscRat));


        double odsetki;
        if (iloscRat >= 6 && iloscRat <= 12) {
            odsetki = 2.5;
        } else if (iloscRat >= 13 && iloscRat <= 24) {
            odsetki = 5.0;
        } else {
            odsetki = 10.0;
        }

        double oprocentowanie = 1 + odsetki / 100;
        double miesiecznaRata = (kwota * oprocentowanie) / iloscRat;

        System.out.println("Miesięczna rata pożyczki wynosi: " + miesiecznaRata + " zł");
    }
}

