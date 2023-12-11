package day3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task1 {

        public static void main(String[] args) {
            String email1 = "aaa@com.pl";
            String email2 = "aaa";

            System.out.println("If email address " + email1 + " has correct format: " + isValidEmail(email1));
            System.out.println("If email address " + email2 + " has correct format: " + isValidEmail(email2));
        }

        public static boolean isValidEmail(String email) {
            // Wzorzec do sprawdzania poprawności adresu e-mail
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            return matcher.matches();
        }
}
