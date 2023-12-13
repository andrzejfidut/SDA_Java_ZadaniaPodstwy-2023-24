package pl.sdacademy.java.basic.exercices.day2;
import java.util.Scanner;
public class Task12 {
//    Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu szyfru Cezara.
//    Użytkownik podaje tekst do zaszyfrowania oraz liczbę x, o którą przesunięty jest alfabet za
//    pomocą którego szyfrujemy tekst. Dla uproszczenia można przyjąć, że łańcuch wejściowy
//    składa się tylko z małych liter alfabetu angielskiego, tj. ’a’ – ’z’ (26 znaków) oraz spacji.
//    Przykład:
//    Please insert your text: bardzo lubie programowac
//    Please insert shift: 2
//    Encrypted text: dctfbqnwdkgrtqitcoqyce
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please insert your text: ");
    String originalText = scanner.nextLine();

    System.out.print("Please insert shift: ");  // przesuniecie
    int shift = scanner.nextInt();

    String encryptedText = encryptCaesar(originalText, shift);

    System.out.println("Encrypted text: " + encryptedText);
}

    private static String encryptCaesar(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder ();

        for (int i = 0; i < text.length (); i++) {
            char currentChar = text.charAt (i);

            if (Character.isLetter (currentChar)) {
                char base = Character.isUpperCase (currentChar) ? 'A' : 'a';  // nowy indeks znaku
                int newIndex = (currentChar - base + shift) % 26;
                if (newIndex < 0) {
                    newIndex += 26;
                }

                encryptedText.append ((char) (base + newIndex));
            } else {
                encryptedText.append (currentChar);

            }
        }
        return encryptedText.toString ();
    }
}
