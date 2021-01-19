import java.util.*;

public class Z1 {
    public static void main(String[] args) {
        int p = 0;
        String inNumber = "";

        Scanner in = new Scanner(System.in);
        boolean poprawnaWartosc = false;
        do {
            poprawnaWartosc = false;
            try {
                System.out.println("Podaj p: ");
                p = in.nextInt();

                System.out.println("Podaj liczbe: ");
                inNumber = in.next();

            } catch (Exception e) {
                System.out.println("Nieprawidlowa wartosc! Wprowadz jeszcze raz.");
                poprawnaWartosc = true;
                in.next();
            }
        } while (poprawnaWartosc);

        String[] strArray = inNumber.split("");
        int[] intArray = new int[strArray.length];
        try {

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        } catch (Exception e) {
            System.out.println("Nieprawidlowa wartosc!");
            main(strArray);
            return;
        }
        
    System.out.println("WYNIK: " + horner(intArray,intArray.length-1,p));

    }

    static int horner(int wsp[], int st, int x) {
        if (st == 0)
            return wsp[0];

        return x * horner(wsp, st - 1, x) + wsp[st];
    }
}