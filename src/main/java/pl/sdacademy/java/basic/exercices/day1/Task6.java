package pl.sdacademy.java.basic.exercices.day1;

public class Task6 {
    public static void main(String[] args) {

//    Metoda do drikowania tabliczki mnożenia

        printMultiplicationTable (5,1,10);
    }
//    Metoda do wydrukowania fragmentu tabliczki mnożenia
    static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int multiplicand = minMultiplicand; multiplicand <= maxMultiplicand; multiplicand++) {
            int result = multiplier * multiplicand;
            System.out.println (multiplier + " * " + multiplicand + " = " + result);
        }
    }
}
