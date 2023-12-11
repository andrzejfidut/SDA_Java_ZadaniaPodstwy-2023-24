package day3;

public class Task3 {
    public static void main(String[] args) {
        String number1 = "1234,1234";
        String number2 = "123a123";

        System.out.println("If digit " + number1 + " has correct format: " + isValidNumberFormat(number1));
        System.out.println("If digit " + number2 + " has correct format: " + isValidNumberFormat(number2));
    }

    public static boolean isValidNumberFormat(String number) {
        try {
            // Spróbuj sparsować liczbę jako double
            Double.parseDouble(number.replace(",", ".")); // Zamiana przecinka na kropkę, aby obsłużyć format z przecinkiem

            // Jeśli parsowanie się powiedzie, zwróć true
            return true;
        } catch (NumberFormatException e) {
            // Jeśli parsowanie się nie powiedzie, zwróć false
            return false;
        }
    }
}
