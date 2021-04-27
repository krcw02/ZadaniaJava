import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean walidacja = false;
        do {
            try {
                walidacja = false;
                System.out.println("Podaj dlugosc ciagu: ");
                double[] ciag = new double[in.nextInt()];
                System.out.println("Podaj liczby: ");
                ciag[0] = in.nextDouble();
                for (int i = 1; i < ciag.length; i++) {
                    ciag[i] = in.nextDouble();
                    if(ciag[i-1] > ciag[i]){ 
                        System.out.println("Ciag nie jest niemalejacy");
                        return;
                    }
                }
            } catch (Exception e) {
                in.next();
                System.out.println("Akceptowane sa tylko liczby");
                walidacja = true;
            } 

        } while (walidacja);
        System.out.println("Ciag jest niemalejacy");
    }

}
