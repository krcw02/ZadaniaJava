import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        int p = 16;
        String inNumber = "";

        Scanner in = new Scanner(System.in);
        boolean poprawnaWartosc = false;
        do {
            poprawnaWartosc = false;
            try {
                
                System.out.println("Podaj liczbe: ");
                inNumber = in.next();

            } catch (Exception e) {
                System.out.println("Nieprawidlowa wartosc! Wprowadz jeszcze raz.");
                poprawnaWartosc = true;
                in.next();
            }
        } while (poprawnaWartosc);

        inNumber = inNumber.toUpperCase();
        String[] strArray = inNumber.split("");
        int[] intArray = new int[strArray.length];
        try {

            for (int i = 0; i < strArray.length; i++) {

                switch (strArray[i]) {
                    case "A":
                        intArray[i] = 10;
                        break;
                    case "B":
                        intArray[i] = 11;
                        break;
                    case "C":
                        intArray[i] = 12;
                        break;
                    case "D":
                        intArray[i] = 13;
                        break;
                    case "E":
                        intArray[i] = 14;
                        break;
                    case "F":
                        intArray[i] = 15;
                        break;

                    default:
                    intArray[i] = Integer.parseInt(strArray[i]);
                        break;
                }

                
            }
        } catch (Exception e) {
            System.out.println("Nieprawidlowa wartosc!");
            main(strArray);
            return;
        }

        System.out.println("WYNIK: " + horner(intArray, intArray.length - 1, p));

    }

    static int horner(int wsp[], int st, int x) {
        int wynik = wsp[0];

        for (int i = 1; i <= st; i++)
            wynik = wynik * x + wsp[i];

        return wynik;
    }
}