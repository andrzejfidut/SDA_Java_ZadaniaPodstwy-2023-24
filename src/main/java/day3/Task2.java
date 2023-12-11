package day3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    public static void main(String[] args) {
        String iban1 = "PL10105000997603123456789123";
        String iban2 = "1324";

        System.out.println("If PL IBAN " + iban1 + " has correct format: " + isValidIban(iban1));
        System.out.println("If PL IBAN " + iban2 + " has correct format: " + isValidIban(iban2));
    }

    public static boolean isValidIban(String iban) {
        // Wzorzec do sprawdzania poprawności polskiego IBAN
        String ibanRegex = "^PL\\d{26}$";

        Pattern pattern = Pattern.compile(ibanRegex);
        Matcher matcher = pattern.matcher(iban);

        return matcher.matches();
    }
}
