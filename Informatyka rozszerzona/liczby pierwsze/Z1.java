import java.util.Scanner;

class Z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        boolean walidacja = false;
        do{
        try {
            walidacja = false;
            System.out.println("Wprowadz wartosc: ");
            x = in.nextInt();
        } catch (Exception e) {
            System.err.println("Blad: "+e);
            in.next();
            walidacja = true;
        }}while(walidacja);
        System.out.println(liczbaPierwsza(x));
    }

    static boolean liczbaPierwsza(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
}