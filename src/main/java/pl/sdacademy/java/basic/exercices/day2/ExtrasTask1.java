package pl.sdacademy.java.basic.exercices.day2;

public class ExtrasTask1 {
    public static void main(String[] args) {
        String wejscie = "Ala ma kota, a kot ma myszkę.";
        String wyjscie = skrocTekstSMS(wejscie);

        System.out.println("Input: " + wejscie);
        System.out.println("Output: " + wyjscie);
    }
    public static String skrocTekstSMS(String tekst) {
        StringBuilder skroconyTekst = new StringBuilder();
        boolean poprzedniZnakBylSpacja = false;

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                if (poprzedniZnakBylSpacja) {
                    skroconyTekst.append(Character.toUpperCase(znak));
                } else {
                    skroconyTekst.append(Character.toLowerCase(znak));
                }
                poprzedniZnakBylSpacja = false;
            } else if (Character.isWhitespace(znak)) {
                poprzedniZnakBylSpacja = true;
            } else {
                skroconyTekst.append(znak);
                poprzedniZnakBylSpacja = false;
            }
        }

        return skroconyTekst.toString();
    }
}
