import java.util.Random;
import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
       System.out.println(z1());
       System.out.println(z2());
       System.out.println(z3());
       System.out.println(z4());
       System.out.println(z5());
       System.out.println(z6());

    }
    static boolean z1(){
        Scanner in = new Scanner(System.in);
        double[] tab = null;
        boolean walidacja = false;
        do {
            try {
                walidacja = false;
                System.out.println("Wprowadz liczbe elementow: ");
                int x = in.nextInt();
                tab = new double[x];
                System.out.println("Kolejno wprowadz liczby: ");
                for(int i = 0;i<x;i++){
                    tab[i] = in.nextDouble();
                }
            } catch (Exception e) {
                System.out.println("Bledne dane");
                in.next();
                walidacja = true;

            } 

        } while (walidacja);

        for(double x : tab){
            if(x!=2) return true;
        }
        return false;

    }
    static boolean z2(){
        Random gen = new Random();

        int[] tab = new int[10];

        for(int i =0;i<10;i++){
            tab[i] = (gen.nextInt()%36)+5;
            System.out.print(tab[i]+" ");
        }

        for(int x: tab){
            if(x%3!=0) return false;
        }
        return true;

    }
    static boolean z3(){
        Scanner in = new Scanner(System.in);
        int[] tab = new int[15];
        boolean walidacja = false;
        do {
            try {
                walidacja = false;
                System.out.println("Kolejno wprowadz liczby: ");
                for(int i = 0;i<15;i++){
                    tab[i] = in.nextInt();
                }
            } catch (Exception e) {

                System.out.println("Bledne dane");
                in.next();
                walidacja = true;
            } 

        } while (walidacja);

        for(double x : tab){
            if(x<11) return false;
        }
        return true;

    }
    static boolean z4(){
        Scanner in = new Scanner(System.in);
        double[] tab = null;
        boolean walidacja = false;
        do {
            try {
                walidacja = false;
                System.out.println("Wprowadz liczbe elementow: ");
                int x = in.nextInt();
                tab = new double[x];
                System.out.println("Kolejno wprowadz liczby: ");
                for(int i = 0;i<x;i++){
                    tab[i] = in.nextDouble();
                }
            } catch (Exception e) {
                System.out.println("Bledne dane");
                in.next();
                walidacja = true;

            } 

        } while (walidacja);

        for(double x : tab){
            if(x>20) return true;
        }
        return false;

    }
    static boolean z5(){
        Random gen = new Random();

        double[] tab = new double[9];

        for(int i =0;i<9;i++){
            tab[i] = (gen.nextDouble()*32)-4;
            System.out.print(tab[i]+" ");
        }

        for(double x: tab){
            if(x<9) return false;
        }
        return true;
    }
    static boolean z6(){
        Random gen = new Random();

        int[] tab = new int[10];

        for(int i =0;i<10;i++){
            tab[i] = gen.nextInt()%33;
            System.out.print(tab[i]+" ");
        }

        for(int x: tab){
            if(x%4==0) return false;
        }
        return true;

    }

}