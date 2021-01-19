import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {

        int n = 0;
        boolean poprawna = false;
        Scanner in = new Scanner(System.in);
        do {
            try {
                poprawna = false;
                System.out.println("Wprowadz wartosc: ");
                n = in.nextInt();
            } catch (Exception e) {
                System.out.println("Nieprawidlowa wartosc!");
                in.next();
                poprawna = true;
            }
            if(n<=0){
                System.out.println("Nieprawidlowa wartosc!");
                poprawna = true;
            }
        } while (poprawna);
        boolean[][] a = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nwd(i + 1, j + 1) == 1) {
                    a[i][j] = true;
                    System.out.print(" + ");
                } else {
                    a[i][j] = false;
                    System.out.print(" . ");
                }
            }
            System.out.println("");
        }

    }

    public static int nwd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nwd(b, a % b);
        }
    }
}