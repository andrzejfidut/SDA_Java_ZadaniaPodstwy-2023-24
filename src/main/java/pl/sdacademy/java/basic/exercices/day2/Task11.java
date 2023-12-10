package pl.sdacademy.java.basic.exercices.day2;

public class Task11 {
    public static void main(String[] args) {
        String text = "kajak";

        palindrom (text);
    }

    private static void palindrom(String text) {
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        if(text.equals(reversedText.toString())) {
           System.out.println("To jest palindrom");
       } else {
           System.out.println("To nie jest palindrom");
       }
    }
}
