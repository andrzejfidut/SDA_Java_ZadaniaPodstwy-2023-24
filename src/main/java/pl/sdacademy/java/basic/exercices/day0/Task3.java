package pl.sdacademy.java.basic.exercices.day0;

public class Task3 {

    public static void main(String[] args) {

        
        //        17. Napisz metodę w Javie, która znajdzie i zwróci średnią wartość w tablicy wielowymiarowej.


        int[][] wielowymiarowaTablica = {
                {1, 7, 3, 5},
                {3, 12, 3},
                {2, 3, 0, 0}
        };

        double srednia = znajdzSrednia(wielowymiarowaTablica);

        // Wydrukowanie średniej
        System.out.println("Średnia wartość w tablicy wielowymiarowej: " + srednia);
    }

    // Metoda do znajdowania średniej w tablicy wielowymiarowej
    static double znajdzSrednia(int[][] wielowymiarowaTablica) {
        int iloscElementow = 0;
        double suma = 0;

        for (int i = 0; i < wielowymiarowaTablica.length; i++) {
            for (int j = 0; j < wielowymiarowaTablica[i].length; j++) {
                suma += wielowymiarowaTablica[i][j];
                iloscElementow++;
            }
        }

        if (iloscElementow == 0) {
            return 0; // Aby uniknąć dzielenia przez zero
        }

        return suma / iloscElementow;
    }
}
