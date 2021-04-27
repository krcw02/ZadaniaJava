import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        double[] ciag = null;
        Scanner in = new Scanner(System.in);
        boolean walidacja = false;
        do {
            try {
                walidacja = false;
                System.out.println("Podaj dlugosc ciagu: ");
                ciag = new double[in.nextInt()];
                System.out.println("Podaj liczby: ");
                ciag[0] = in.nextDouble();
                for (int i = 1; i < ciag.length; i++) {
                    ciag[i] = in.nextDouble();

                }
            } catch (Exception e) {
                in.next();
                System.out.println("Akceptowane sa tylko liczby");
                walidacja = true;
            }

        } while (walidacja);

        boolean rosnacy = false;
        boolean malejacy = false;
        boolean nierosnacy = false;
        boolean niemalejacy = false;

        for (int i = 1; i < ciag.length; i++) {
            if (ciag[i - 1] >= ciag[i]) {
                nierosnacy = true;
                if (ciag[i - 1] > ciag[i])
                    malejacy = true;
            }
            if (ciag[i - 1] <= ciag[i]) {
                niemalejacy = true;
                if (ciag[i - 1] < ciag[i])
                    rosnacy = true;
            }
        }
        
        if(malejacy && !niemalejacy) System.out.println("malejacy ");
        else if(rosnacy && !nierosnacy) System.out.println("rosnacy ");
        if(niemalejacy && !malejacy) System.out.println("niemalejacy");
        if(nierosnacy && !rosnacy) System.out.println("nierosnacy");
        if(malejacy && rosnacy) System.out.println("niemonotoniczny");
    }

}
